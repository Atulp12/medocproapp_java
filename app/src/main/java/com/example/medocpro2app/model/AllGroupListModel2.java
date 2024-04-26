package com.example.medocpro2app.model;



import java.util.List;

public class AllGroupListModel2 {
    String success, status, message;
    List<GroupList2> result;

    public AllGroupListModel2(String success, String status, String message, List<GroupList2> result) {
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

    public List<GroupList2> getResult() {
        return result;
    }

    public void setResult(List<GroupList2> result) {
        this.result = result;
    }
}
