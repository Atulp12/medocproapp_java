package com.example.medocpro2app.model;

public class CommonIdModel {
    String success, status, message, id, trans_id, date, invoice_no, bill_no, purchase_rate, net_amt, voucher_no, balance_amount,
    result, total_qty, total_net_amount,gst_amount, sgst_amount, amount_with_gst,total_amount,price,jv_no,image,requisition_no ;

    public CommonIdModel(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public CommonIdModel(String success, String status, String message, String id, String trans_id) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.id = id;
        this.trans_id = trans_id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public String getPurchase_rate() {
        return purchase_rate;
    }

    public void setPurchase_rate(String purchase_rate) {
        this.purchase_rate = purchase_rate;
    }

    public String getNet_amt() {
        return net_amt;
    }

    public void setNet_amt(String net_amt) {
        this.net_amt = net_amt;
    }

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
    }

    public String getBalance_amount() {
        return balance_amount;
    }

    public void setBalance_amount(String balance_amount) {
        this.balance_amount = balance_amount;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTotal_qty() {
        return total_qty;
    }

    public void setTotal_qty(String total_qty) {
        this.total_qty = total_qty;
    }

    public String getTotal_net_amount() {
        return total_net_amount;
    }

    public void setTotal_net_amount(String total_net_amount) {
        this.total_net_amount = total_net_amount;
    }

    public String getGst_amount() {
        return gst_amount;
    }

    public void setGst_amount(String gst_amount) {
        this.gst_amount = gst_amount;
    }

    public String getSgst_amount() {
        return sgst_amount;
    }

    public void setSgst_amount(String sgst_amount) {
        this.sgst_amount = sgst_amount;
    }

    public String getAmount_with_gst() {
        return amount_with_gst;
    }

    public void setAmount_with_gst(String amount_with_gst) {
        this.amount_with_gst = amount_with_gst;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getJv_no() {
        return jv_no;
    }

    public void setJv_no(String jv_no) {
        this.jv_no = jv_no;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRequisition_no() {
        return requisition_no;
    }

    public void setRequisition_no(String requisition_no) {
        this.requisition_no = requisition_no;
    }
}
