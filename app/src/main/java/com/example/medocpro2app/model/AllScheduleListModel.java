package com.example.medocpro2app.model;



import java.util.List;

public class AllScheduleListModel {
    String success, status, message;
    List<ScheduleList> result;


    public AllScheduleListModel(String success, String status, String message, List<ScheduleList> result) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ScheduleList> getResult() {
        return result;
    }

    public void setResult(List<ScheduleList> result) {
        this.result = result;
    }
}
