/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main;

import com.service.main.impl.OperationCatalogServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author admin
 */
@WebService(name = "CalculatorOnRequest",
        portName = "CalculatorPort", serviceName = "CalculatorService"
        ,targetNamespace = "http://www.onlinecalc.com")
/**
 *By Default the "portType" name in WSDL is picked up from the name 
 * of the class but as now we've used "name" property in webservice annotation
 * the "portType name" will be picked up from there.
 * "portType name=CalculatorOnRequests"
 */
public class OperationCatalog {
   
    OperationCatalogServiceImpl catalogservice = new OperationCatalogServiceImpl();
    
    @WebMethod
    public List<String> getProductCategories(){
        return catalogservice.getProductCategories();
    }
    
    @WebMethod(action="fetch_category", operationName = "fetchCategory")
    public List<String> getProducts(String productType){
        return catalogservice.getProducts(productType);
    }
    
    @WebMethod
    public List<String> getLegitimateOperations(){
        return catalogservice.getLegitimateOperations();
    }
    
    @WebMethod
    public int performOperation(int operationID, List<Integer> numbers){
        return catalogservice.performOperation(operationID,numbers);
    }
}
