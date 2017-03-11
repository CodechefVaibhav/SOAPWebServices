/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main;

import com.service.main.entity.Component;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author admin
 */

@WebService(name = "CalculatorOnRequest"
        ,targetNamespace = "http://www.onlinecalc.com")
/**
 * By Default the "portType" name in WSDL is picked up from the name 
 * of the class but as we've used "name" property in webservice annotation
 * the "portType name" will be picked up from there.
 * "portType name=CalculatorOnRequests"
 */
public interface OperationCatalogServiceImpl {
/**
 * This interface is called Service End Point Interface
 */
    
    @WebMethod
    List<String> getLegitimateOperations();

    /**
     * it's not even mandatory to mark method with @webMethod
     * because the methods written under web service are implicitly
     * considered as Web method
     * @return
     */
    @WebMethod
    List<String> getProductCategories();

    /**
     * "operation name" represents in WSDL, the name of the method defined in
     * the actual service class
     * <operation name="fetchCategory">
     * <soap:operation soapAction="fetch_category"/>
     * </operation>
     * 
     * getProducts -> fetchCategory
     */
    @WebMethod(action = "fetch_category", operationName = "fetchCategory")
    List<String> getProducts(String productType);

    @WebMethod
    List<Component> getProductsAsComponents(String productType);

    @WebMethod
    int performOperation(int operationID, List<Integer> numbers);
    
}
