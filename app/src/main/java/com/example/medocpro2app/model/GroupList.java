package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList implements Serializable {
    String id, name;

    public GroupList(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if(obj instanceof GroupList){
            GroupList c = (GroupList) obj;
            if(c.getName().equals(name) && c.getId() == id)
                return true;
        }
        return false;
    }
}
