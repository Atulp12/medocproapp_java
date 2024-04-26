package com.example.medocpro2app.model;

import java.io.Serializable;

public class GroupList4 implements Serializable {
    String party_type_id, name;

    public GroupList4(String party_type_id, String name) {
        this.party_type_id = party_type_id;
        this.name = name;
    }


    public String getParty_type_id() {
        return party_type_id;
    }

    public void setParty_type_id(String party_type_id) {
        this.party_type_id = party_type_id;
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
        if(obj instanceof GroupList4){
            GroupList4 c = (GroupList4) obj;
            if(c.getName().equals(name) && c.getParty_type_id() == party_type_id)
                return true;
        }
        return false;
    }
}
