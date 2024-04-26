package com.example.medocpro2app.model;



import java.util.List;

public class AllRegTypeModel {
    String success, status, message;
    List<RegList> result;


    public AllRegTypeModel(String success, String status, String message, List<RegList> result) {
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

    public List<RegList> getResult() {
        return result;
    }

    public void setResult(List<RegList> result) {
        this.result = result;
    }
}
