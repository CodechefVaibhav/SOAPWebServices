/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author admin
 */
@WebService
/**
 * RPC/document are inter-changable, Document generates the "types" into
 * a separate url whereas the RPC writes the "types : return or request type"
 * within the same WSDL file
 */
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class CollegeDetails {
    
    @WebMethod
    /**
     * partName of WEBPARAM & WEBRESULT, you'll find in 
     * message tag of the WSDL defining the type
     */
    @WebResult(partName = "propertyReturnName")
    public String getCollegeDetail(@WebParam(partName = "propertyCallName") String property){
        String detail = "not found";
        switch(property){
            case "noofstudents" : detail = "1000";
            case "nameofcollege" : detail = "XYZ college";
            default :;
        }
        
        return detail;
    }
}
