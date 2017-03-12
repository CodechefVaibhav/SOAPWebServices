/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author admin
 */
@XmlType(name = "Body")
/**
 * Scrutinizing this class we'll notice that this class is not
 * the root element
 */
public class Corpse {
    private Integer noOfDoors;
    private String type;

    public Corpse(){
        
    }
    
    @XmlElement(defaultValue = "2")
    public Integer getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(Integer noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @XmlElement(defaultValue = "Hatchback")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
