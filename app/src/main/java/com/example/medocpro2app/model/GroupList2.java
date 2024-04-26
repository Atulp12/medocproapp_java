package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList2 implements Serializable {
    String state_id, name;

    public GroupList2(String state_id, String name) {
        this.state_id = state_id;
        this.name = name;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
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
        if(obj instanceof GroupList2){
            GroupList2 c = (GroupList2) obj;
            if(c.getName().equals(name) && c.getState_id() == state_id)
                return true;
        }
        return false;
    }
}
