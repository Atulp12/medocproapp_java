package com.example.medocpro2app.model;

import java.io.Serializable;

public class NatureList implements Serializable {
    String id, nature_of_expense;

    public NatureList(String id, String nature_of_expense) {
        this.id = id;
        this.nature_of_expense = nature_of_expense;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNature_of_expense() {
        return nature_of_expense;
    }

    public void setNature_of_expense(String nature_of_expense) {
        this.nature_of_expense = nature_of_expense;
    }

    @Override
    public String toString() {
        return nature_of_expense;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NatureList){
            NatureList c = (NatureList) obj;
            if(c.getNature_of_expense().equals(nature_of_expense) && c.getId() == id)
                return true;
        }
        return false;
    }
}
