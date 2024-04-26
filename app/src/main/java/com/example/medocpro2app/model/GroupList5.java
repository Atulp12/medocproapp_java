package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList5 implements Serializable {
    String mode_id, name;

    public GroupList5(String mode_id, String name) {
        this.mode_id = mode_id;
        this.name = name;
    }

    public String getMode_id() {
        return mode_id;
    }

    public void setMode_id(String mode_id) {
        this.mode_id = mode_id;
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
        if(obj instanceof GroupList5){
            GroupList5 c = (GroupList5) obj;
            if(c.getName().equals(name) && c.getMode_id() == mode_id)
                return true;
        }
        return false;
    }
}
