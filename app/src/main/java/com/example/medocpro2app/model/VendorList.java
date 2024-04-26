package com.example.medocpro2app.model;

import java.io.Serializable;

public class VendorList implements Serializable {
    String id, acc_name;

    public VendorList(String id, String acc_name) {
        this.id = id;
        this.acc_name = acc_name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }


    @Override
    public String toString() {
        return acc_name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof VendorList){
            VendorList c = (VendorList) obj;
            if(c.getAcc_name().equals(acc_name) && c.getId() == id)
                return true;
        }
        return false;
    }
}
