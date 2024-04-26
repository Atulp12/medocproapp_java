package com.example.medocpro2app.model;

import java.util.List;

public class AllListModel1 {
    String success, status, message;
    public Data result;

    public AllListModel1(String success, String status, String message, Data result) {
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

    public Data getResult() {
        return result;
    }

    public void setResult(Data result) {
        this.result = result;
    }
    public class Data{
        String mobile_no, email, sr_no, po_date, total_net_amount, gst_amount, sgst_amount, amount_with_gst, quotation_no,vendor,
                note, address, total_qty, terms, due_date, bill_no, po_no, bill_date, payment_date, mode, voucher_no, debit_note_no,
                debit_note_date, reason, date, payment_method, paid_amount, total_amount, reference_no, bank_account, bank_name,
        outlet_name, mobile, requisition_date, requisition_no, invoice_no, total_amt, bank_id, remaining_amount, vendor_name,
                balance_amount,  net_amt, result, jv_no, jv_date, total_debit_amount, total_credit_amount, mode_name, return_qty;
        List<ProductDataList> product_data;
        List<PaymentHistory> payment;

        public Data(String mobile_no, String email, String sr_no, String po_date, String total_net_amount, String gst_amount, String sgst_amount, String amount_with_gst, String quotation_no, String vendor, String note, String address, String total_qty, String terms, String due_date, String bill_no, String po_no, String bill_date, String payment_date, String mode, String voucher_no, String debit_note_no, String debit_note_date, String reason, String date, String payment_method, String paid_amount, String total_amount, String reference_no, String bank_account, String bank_name, String outlet_name, String mobile, String requisition_date, String requisition_no, String invoice_no, String total_amt, String bank_id, String remaining_amount, String vendor_name, String balance_amount, List<ProductDataList> product_data, List<PaymentHistory> payment) {
            this.mobile_no = mobile_no;
            this.email = email;
            this.sr_no = sr_no;
            this.po_date = po_date;
            this.total_net_amount = total_net_amount;
            this.gst_amount = gst_amount;
            this.sgst_amount = sgst_amount;
            this.amount_with_gst = amount_with_gst;
            this.quotation_no = quotation_no;
            this.vendor = vendor;
            this.note = note;
            this.address = address;
            this.total_qty = total_qty;
            this.terms = terms;
            this.due_date = due_date;
            this.bill_no = bill_no;
            this.po_no = po_no;
            this.bill_date = bill_date;
            this.payment_date = payment_date;
            this.mode = mode;
            this.voucher_no = voucher_no;
            this.debit_note_no = debit_note_no;
            this.debit_note_date = debit_note_date;
            this.reason = reason;
            this.date = date;
            this.payment_method = payment_method;
            this.paid_amount = paid_amount;
            this.total_amount = total_amount;
            this.reference_no = reference_no;
            this.bank_account = bank_account;
            this.bank_name = bank_name;
            this.outlet_name = outlet_name;
            this.mobile = mobile;
            this.requisition_date = requisition_date;
            this.requisition_no = requisition_no;
            this.invoice_no = invoice_no;
            this.total_amt = total_amt;
            this.bank_id = bank_id;
            this.remaining_amount = remaining_amount;
            this.vendor_name = vendor_name;
            this.balance_amount = balance_amount;
            this.product_data = product_data;
            this.payment = payment;
        }

        public String getMobile_no() {
            return mobile_no;
        }

        public void setMobile_no(String mobile_no) {
            this.mobile_no = mobile_no;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSr_no() {
            return sr_no;
        }

        public void setSr_no(String sr_no) {
            this.sr_no = sr_no;
        }

        public String getPo_date() {
            return po_date;
        }

        public void setPo_date(String po_date) {
            this.po_date = po_date;
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

        public String getQuotation_no() {
            return quotation_no;
        }

        public void setQuotation_no(String quotation_no) {
            this.quotation_no = quotation_no;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTotal_qty() {
            return total_qty;
        }

        public void setTotal_qty(String total_qty) {
            this.total_qty = total_qty;
        }

        public String getTerms() {
            return terms;
        }

        public void setTerms(String terms) {
            this.terms = terms;
        }

        public String getDue_date() {
            return due_date;
        }

        public void setDue_date(String due_date) {
            this.due_date = due_date;
        }

        public String getBill_no() {
            return bill_no;
        }

        public void setBill_no(String bill_no) {
            this.bill_no = bill_no;
        }

        public String getPo_no() {
            return po_no;
        }

        public void setPo_no(String po_no) {
            this.po_no = po_no;
        }

        public String getBill_date() {
            return bill_date;
        }

        public void setBill_date(String bill_date) {
            this.bill_date = bill_date;
        }

        public String getPayment_date() {
            return payment_date;
        }

        public void setPayment_date(String payment_date) {
            this.payment_date = payment_date;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getVoucher_no() {
            return voucher_no;
        }

        public void setVoucher_no(String voucher_no) {
            this.voucher_no = voucher_no;
        }

        public String getDebit_note_no() {
            return debit_note_no;
        }

        public void setDebit_note_no(String debit_note_no) {
            this.debit_note_no = debit_note_no;
        }

        public String getDebit_note_date() {
            return debit_note_date;
        }

        public void setDebit_note_date(String debit_note_date) {
            this.debit_note_date = debit_note_date;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getPayment_method() {
            return payment_method;
        }

        public void setPayment_method(String payment_method) {
            this.payment_method = payment_method;
        }

        public String getPaid_amount() {
            return paid_amount;
        }

        public void setPaid_amount(String paid_amount) {
            this.paid_amount = paid_amount;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public String getReference_no() {
            return reference_no;
        }

        public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
        }

        public String getBank_account() {
            return bank_account;
        }

        public void setBank_account(String bank_account) {
            this.bank_account = bank_account;
        }

        public String getBank_name() {
            return bank_name;
        }

        public void setBank_name(String bank_name) {
            this.bank_name = bank_name;
        }

        public String getOutlet_name() {
            return outlet_name;
        }

        public void setOutlet_name(String outlet_name) {
            this.outlet_name = outlet_name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getRequisition_date() {
            return requisition_date;
        }

        public void setRequisition_date(String requisition_date) {
            this.requisition_date = requisition_date;
        }

        public String getRequisition_no() {
            return requisition_no;
        }

        public void setRequisition_no(String requisition_no) {
            this.requisition_no = requisition_no;
        }

        public String getInvoice_no() {
            return invoice_no;
        }

        public void setInvoice_no(String invoice_no) {
            this.invoice_no = invoice_no;
        }

        public String getTotal_amt() {
            return total_amt;
        }

        public void setTotal_amt(String total_amt) {
            this.total_amt = total_amt;
        }

        public String getBank_id() {
            return bank_id;
        }

        public void setBank_id(String bank_id) {
            this.bank_id = bank_id;
        }

        public String getRemaining_amount() {
            return remaining_amount;
        }

        public void setRemaining_amount(String remaining_amount) {
            this.remaining_amount = remaining_amount;
        }

        public String getVendor_name() {
            return vendor_name;
        }

        public void setVendor_name(String vendor_name) {
            this.vendor_name = vendor_name;
        }

        public String getBalance_amount() {
            return balance_amount;
        }

        public void setBalance_amount(String balance_amount) {
            this.balance_amount = balance_amount;
        }

        public Data(List<PaymentHistory> payment) {
            this.payment = payment;
        }

        public List<PaymentHistory> getPayment() {
            return payment;
        }

        public void setPayment(List<PaymentHistory> payment) {
            this.payment = payment;
        }

        public List<ProductDataList> getProduct_data() {
            return product_data;
        }

        public void setProduct_data(List<ProductDataList> product_data) {
            this.product_data = product_data;
        }

        public String getNet_amt() {
            return net_amt;
        }

        public void setNet_amt(String net_amt) {
            this.net_amt = net_amt;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getJv_no() {
            return jv_no;
        }

        public void setJv_no(String jv_no) {
            this.jv_no = jv_no;
        }

        public String getJv_date() {
            return jv_date;
        }

        public void setJv_date(String jv_date) {
            this.jv_date = jv_date;
        }

        public String getTotal_debit_amount() {
            return total_debit_amount;
        }

        public void setTotal_debit_amount(String total_debit_amount) {
            this.total_debit_amount = total_debit_amount;
        }

        public String getTotal_credit_amount() {
            return total_credit_amount;
        }

        public void setTotal_credit_amount(String total_credit_amount) {
            this.total_credit_amount = total_credit_amount;
        }

        public String getMode_name() {
            return mode_name;
        }

        public void setMode_name(String mode_name) {
            this.mode_name = mode_name;
        }

        public String getReturn_qty() {
            return return_qty;
        }

        public void setReturn_qty(String return_qty) {
            this.return_qty = return_qty;
        }
    }

}
