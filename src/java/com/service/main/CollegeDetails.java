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
 * RPC/document are inter-changeable, Document generates the "types" into
 * a separate url whereas the RPC writes the "types : return or request type"
 * within the same WSDL file
 * 
 * BINDING STYLE : DOCUMENT is by default
 */
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class CollegeDetails {
    
    
    /**
     * partName of WEBPARAM & WEBRESULT, you'll find in 
     * message tag of the WSDL defining the type
     */
    /**
     * Now carefully observe:-
     * WebResult : represents the collective name we've defined for 
     * return type of the method. Also try to look back into the WSDL, type this partName
     * must have been declared over there. In our case it would look like as follows:-
     * <message name="getCollegeDetail">
     * <part name="propertyCallName" type="xsd:string"/>
     * </message>
     * 
     * WebParam : represents the collective name for the input parameters we'll be passing be 
     * passing in while calling the method. In WSDL it looks like as follows :-
     * message name="getCollegeDetailResponse">
     * <part name="propertyReturnName" type="xsd:string"/>
     * </message>
     */
    @WebMethod
    @WebResult(partName = "propertyReturnName")
    public String getCollegeDetail(@WebParam(partName = "propertyCallName") String property){
        String detail = "not found";
        switch(property){
            case "noofstudents" : detail = "1000";
                break;
            case "nameofcollege" : detail = "XYZ college";
                break;
            default :;
        }
        
        return detail;
    }
}
