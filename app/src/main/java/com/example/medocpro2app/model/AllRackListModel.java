package com.example.medocpro2app.model;



import java.util.List;

public class AllRackListModel {
    String success, status, message;
    List<RackList> result;


    public AllRackListModel(String success, String status, String message, List<RackList> result) {
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

    public List<RackList> getResult() {
        return result;
    }

    public void setResult(List<RackList> result) {
        this.result = result;
    }
}
