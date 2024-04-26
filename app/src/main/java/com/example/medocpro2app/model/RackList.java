package com.example.medocpro2app.model;

import java.io.Serializable;

public class RackList implements Serializable {
    String id, rack_name;

    public RackList(String id, String rack_name) {
        this.id = id;
        this.rack_name = rack_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRack_name() {
        return rack_name;
    }

    public void setRack_name(String rack_name) {
        this.rack_name = rack_name;
    }

    @Override
    public String toString() {
        return rack_name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof RackList){
            RackList c = (RackList) obj;
            if(c.getRack_name().equals(rack_name) && c.getId() == id)
                return true;
        }
        return false;
    }
}
