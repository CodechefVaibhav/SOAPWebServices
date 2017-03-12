/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author admin
 */
@XmlRootElement(name = "CarComponents")
@XmlType(propOrder = {"name","price","available","corpse"})
/**
 * Difference between XmlRootElement & XmlType, by root element indicates the root element
 * i.e. root of the whole XML Structure but this root element could contain some CLASS as the
 * member variable as name, available etc. so that class would just be the XMLType NOT the
 * ROOTELEMENT
 */
public class Component {
    private String name = "";
    private Boolean available = false;
    private Float price = 0.0f;
    private Corpse corpse;
    
    /**
     * Un-availability of default constructor throws the following exception:
     * com.sun.xml.ws.spi.db.DatabindingException: com.sun.xml.bind.v2.runtime.IllegalAnnotationsException: 1 counts 
     * of IllegalAnnotationExceptions
     * com.service.main.entity.Component does not have a no-arg default constructor.
     * 
     * This No-arg or default constructor is used by JAXB (JAVA XML Binding API)
     */
    public Component(){
        
    }
    
    public Component(String name, Boolean available, Float price){
        this.name = name;
        this.available = available;
        this.price = price;
    }
    
    @XmlElement(name = "ComponentName")
    /**
     * SOAP Response
     * <return>
     * <ComponentName>Bumper</ComponentName>
     * <ComponentPrice>800.0</ComponentPrice>
     * <ComponentAvailability>true</ComponentAvailability>
     * </return>
     * 
     * carefully scrutinize the order of variable defined. It is same as like we've
     * defined in @XMLType annotation
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "ComponentAvailability")
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @XmlElement(name = "ComponentPrice")
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
    @XmlElement(name = "BodyDescription")
    public Corpse getCorpse() {
        return corpse;
    }

    public void setCorpse(Corpse corpse) {
        this.corpse = corpse;
    }
}
