package com.example.medocpro2app.model;

import java.io.Serializable;

public class ModeList implements Serializable {
    String id, mode;

    public ModeList(String id, String mode) {
        this.id = id;
        this.mode = mode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return mode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ModeList){
            ModeList c = (ModeList) obj;
            if(c.getMode().equals(mode) && c.getMode() == mode)
                return true;
        }
        return false;
    }
}
