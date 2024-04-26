package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList3 implements Serializable {
    String city_id, name;

    public GroupList3(String city_id, String name) {
        this.city_id = city_id;
        this.name = name;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
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
        if(obj instanceof GroupList3){
            GroupList3 c = (GroupList3) obj;
            if(c.getName().equals(name) && c.getCity_id() == city_id)
                return true;
        }
        return false;
    }
}
