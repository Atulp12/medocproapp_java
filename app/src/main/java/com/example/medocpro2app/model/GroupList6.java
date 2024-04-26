package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList6 implements Serializable {
    String group_id, name;

    public GroupList6(String group_id, String name) {
        this.group_id = group_id;
        this.name = name;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
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
            GroupList6 c = (GroupList6) obj;
            if(c.getName().equals(name) && c.getGroup_id() == group_id)
                return true;
        }
        return false;
    }
}
