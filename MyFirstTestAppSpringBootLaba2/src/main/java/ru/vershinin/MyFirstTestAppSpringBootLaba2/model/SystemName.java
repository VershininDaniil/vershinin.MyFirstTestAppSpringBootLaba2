package ru.vershinin.MyFirstTestAppSpringBootLaba2.model;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SystemName {
    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System");

    private final String name;


    SystemName(String name){
        this.name = name;
    }

    @JsonValue
    public String getName(){
        return name;
    }
}
