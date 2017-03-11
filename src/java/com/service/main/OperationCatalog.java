/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main;

import com.service.main.entity.Component;
import com.service.main.impl.OperationCatalogDataService;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author admin
 */

@WebService(serviceName = "CalculatorService", portName = "CalculatorPort",
        endpointInterface = "com.service.main.OperationCatalogServiceImpl")
/**
 * "serviceName" defines the name of the web service.
 * 
 * "endpointInterface" is the binding to the actual service end point interface
 * defined
 */
public class OperationCatalog implements OperationCatalogServiceImpl {
   
    OperationCatalogDataService catalogservice = new OperationCatalogDataService();

    @Override
    public List<String> getProductCategories(){
        return catalogservice.getProductCategories();
    }
    
    @Override
    public List<String> getProducts(String productType){
        return catalogservice.getProductsAsString(productType);
    }
    
    @Override
    public List<Component> getProductsAsComponents(String productType){
        return catalogservice.getProductsAsComponents(productType);
    }
    
    
    @Override
    public List<String> getLegitimateOperations(){
        return catalogservice.getLegitimateOperations();
    }
    
    @Override
    public int performOperation(int operationID, List<Integer> numbers){
        return catalogservice.performOperation(operationID,numbers);
    }
}
