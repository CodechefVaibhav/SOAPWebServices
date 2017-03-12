/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main.exception;

/**
 *
 * @author admin
 */
public class InvalidPropertyException extends Exception{
    private String errorMessage = "";
    
    public InvalidPropertyException(String reason,String errorMessage){
        super(reason);
        this.errorMessage = errorMessage;
    }
    
    public String getErrorMessage(){
        return errorMessage;
    }
}
