/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.main.entity;

/**
 *
 * @author admin
 */
public class Component {
    private String name = "";
    private Boolean available = false;
    private Float price = 0.0f;

    public Component(String name, Boolean available, Float price){
        this.name = name;
        this.available = available;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
