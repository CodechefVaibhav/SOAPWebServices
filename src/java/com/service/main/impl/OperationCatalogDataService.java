/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main.impl;

import com.service.main.entity.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class OperationCatalogDataService {

    List<String> musicList = new ArrayList<>();
    List<String> booksList = new ArrayList<>();
    List<String> operationLst = new  ArrayList<>();
    
    public OperationCatalogDataService(){
        musicList.add("TrackA");
        musicList.add("TrackB");
        musicList.add("TrackC");
        
        booksList.add("BookA");
        booksList.add("BookB");
        booksList.add("BookC");
        
        operationLst.add("add        -> 1");
        operationLst.add("substract  -> 2");
        operationLst.add("multiply   -> 3");
        operationLst.add("divide     -> 4");
    }
    public List<String> getLegitimateOperations(){        
        return operationLst;
    }
    
     public List<String> getProductCategories(){
        List<String> productCat = new ArrayList<String>();
        productCat.add("Music");
        productCat.add("Books");
        return productCat;
    }
    
     public List<String> getProductsAsString(String productType){
         productType = (productType!=null)?productType.toLowerCase():null;
         switch(productType){
             case "books": return booksList;
             case "music": return musicList;
             default:return null;
         }
     }
     
     public int performOperation(int operation, List<Integer> numbers){
         int result = 0;
         if(numbers!=null){
             switch(operation){
                 case 1:
                     for(Integer num : numbers){
                         result = result + num;
                     }
                 default: return -1;
             }
         }
         return result;
     }

    public List<Component> getProductsAsComponents(String productType) {
       List<Component> productList = new ArrayList<>();
       productList.add(new Component("Bumper", true, (float) 800));
       productList.add(new Component("Tyres", false, (float) 3000));
       productList.add(new Component("Suspensions", true, (float) 6000));
       return productList;
    }
     

}
