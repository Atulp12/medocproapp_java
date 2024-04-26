package com.example.medocpro2app.model;

import java.io.Serializable;

public class RegList implements Serializable {
    String reg_type_id,reg_type;

    public RegList(String reg_type_id, String reg_type) {
        this.reg_type_id = reg_type_id;
        this.reg_type = reg_type;
    }

    public String getReg_type_id() {
        return reg_type_id;
    }

    public void setReg_type_id(String reg_type_id) {
        this.reg_type_id = reg_type_id;
    }

    public String getReg_type() {
        return reg_type;
    }

    public void setReg_type(String reg_type) {
        this.reg_type = reg_type;
    }

    @Override
    public String toString() {
        return reg_type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof RegList){
            RegList c = (RegList) obj;
            if(c.getReg_type().equals(reg_type) && c.getReg_type_id() == reg_type_id)
                return true;
        }
        return false;
    }
}
