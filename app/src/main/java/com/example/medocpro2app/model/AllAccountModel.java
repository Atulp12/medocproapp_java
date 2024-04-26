package com.example.medocpro2app.model;

import java.util.List;

public class AllAccountModel {
    String success, status, message;
    private List<GeneralAccountModel> general;
    private List<VendorAccountModel> vendor;
    private List<DoctorAccountModel> doctor;
    private List<CustomerAccountModel> customer;

    public AllAccountModel(String success, String status, String message, List<GeneralAccountModel> general, List<VendorAccountModel> vendor, List<DoctorAccountModel> doctor, List<CustomerAccountModel> customer) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.general = general;
        this.vendor = vendor;
        this.doctor = doctor;
        this.customer = customer;
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

    public List<GeneralAccountModel> getGeneral() {
        return general;
    }

    public void setGeneral(List<GeneralAccountModel> general) {
        this.general = general;
    }

    public List<VendorAccountModel> getVendor() {
        return vendor;
    }

    public void setVendor(List<VendorAccountModel> vendor) {
        this.vendor = vendor;
    }

    public List<DoctorAccountModel> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<DoctorAccountModel> doctor) {
        this.doctor = doctor;
    }

    public List<CustomerAccountModel> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerAccountModel> customer) {
        this.customer = customer;
    }
}
