package com.example.medocpro2app.model;

import java.io.Serializable;

public class ScheduleList implements Serializable {
    String id, schedule;

    public ScheduleList(String id, String schedule) {
        this.id = id;
        this.schedule = schedule;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return schedule;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ScheduleList){
            ScheduleList c = (ScheduleList) obj;
            if(c.getSchedule().equals(schedule) && c.getId() == id)
                return true;
        }
        return false;
    }
}
