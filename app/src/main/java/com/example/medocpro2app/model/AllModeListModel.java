package com.example.medocpro2app.model;



import java.util.List;

public class AllModeListModel {
    String success, status, message;
    List<ModeList> result;


    public AllModeListModel(String success, String status, String message, List<ModeList> result) {
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

    public List<ModeList> getResult() {
        return result;
    }

    public void setResult(List<ModeList> result) {
        this.result = result;
    }
}
