package com.example.medocpro2app.model;

public class ImageModel {
    String success, status, message, user;

    public ImageModel(String success, String status, String message, String user) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
