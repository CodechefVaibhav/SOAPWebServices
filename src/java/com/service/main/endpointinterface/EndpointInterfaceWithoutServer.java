/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main.endpointinterface;

import com.service.main.OperationCatalog;
import javax.xml.ws.Endpoint;
/**
 *
 * @author admin
 */
/**
 * SHORTCUT FOR PUBLISHING WEBSERVICE
 */
public class EndpointInterfaceWithoutServer {
    public static void main(String... we){
        Endpoint.publish("http://localhost:8082/endpointinterfacedirect", new OperationCatalog());
        /**
         * OUTPUT YOU'LL COME ACROSS : 
         * Mar xx, xxxx 12:19:05 AM com.sun.xml.ws.server.MonitorBase createRoot
         * INFO: Metro monitoring rootname 
         * successfully set to: com.sun.metro:pp=/,type=WSEndpoint,name=CalculatorService-CalculatorPort
         * 
         * ON BROWSER :
         * Web Services
         * ENDPOINT :	   
         * Service Name:	{http://main.service.com/}CalculatorService
         * Port Name:	{http://main.service.com/}CalculatorPort
         * INFORMATION :
         * Address:	http://localhost:8082/endpointinterfacedirect
         * WSDL:	http://localhost:8082/endpointinterfacedirect?wsdl
         * Implementation class:	com.service.main.OperationCatalog
         * 
         * JAX-WS is the standard or guideline & METRO is the implementation of it.
         * METRO also comes along with the JDK bundle which is why don't require any server to run this
         * program, working on a single threaded model.
         */
    }
}
