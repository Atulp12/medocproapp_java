package com.example.medocpro2app.model;

import java.io.Serializable;

public class PaymentHistory implements Serializable {
    String id, voucher_no, payment_date, total_net_amount, amount_with_gst, bill_amount, balance_amount, paid_amount, status,
            bill_no, index;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getTotal_net_amount() {
        return total_net_amount;
    }

    public void setTotal_net_amount(String total_net_amount) {
        this.total_net_amount = total_net_amount;
    }

    public String getAmount_with_gst() {
        return amount_with_gst;
    }

    public void setAmount_with_gst(String amount_with_gst) {
        this.amount_with_gst = amount_with_gst;
    }

    public String getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(String bill_amount) {
        this.bill_amount = bill_amount;
    }

    public String getBalance_amount() {
        return balance_amount;
    }

    public void setBalance_amount(String balance_amount) {
        this.balance_amount = balance_amount;
    }

    public String getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(String paid_amount) {
        this.paid_amount = paid_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
