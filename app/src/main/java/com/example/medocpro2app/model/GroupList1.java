package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList1 implements Serializable {
    String country_id, name;

    public GroupList1(String country_id, String name) {
        this.country_id = country_id;
        this.name = name;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof GroupList1){
            GroupList1 c = (GroupList1) obj;
            if(c.getName().equals(name) && c.getCountry_id() == country_id)
                return true;
        }
        return false;
    }
}
