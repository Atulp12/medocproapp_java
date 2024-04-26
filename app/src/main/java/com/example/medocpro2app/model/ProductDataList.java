package com.example.medocpro2app.model;

import java.io.Serializable;

public class ProductDataList implements Serializable {
    String id, purchase_order_id, rack, vendor_name, requisition_no, product, expiry_date, qty, rate, purchase_rate, unit, tablet_qty_per_strip,
            disc_value, disc_type, net_amt, created_at, updated_at, status, index, product_name,purchase_bill_id, bill_no,
            batch_no, return_qty, expense_nature_name, taxable_amount, total_amount, description, available_qty_admin, available_qty,
    vendor, debit_amount, credit_amount, availableQty_outlet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurchase_order_id() {
        return purchase_order_id;
    }

    public void setPurchase_order_id(String purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getRequisition_no() {
        return requisition_no;
    }

    public void setRequisition_no(String requisition_no) {
        this.requisition_no = requisition_no;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPurchase_rate() {
        return purchase_rate;
    }

    public void setPurchase_rate(String purchase_rate) {
        this.purchase_rate = purchase_rate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTablet_qty_per_strip() {
        return tablet_qty_per_strip;
    }

    public void setTablet_qty_per_strip(String tablet_qty_per_strip) {
        this.tablet_qty_per_strip = tablet_qty_per_strip;
    }

    public String getDisc_value() {
        return disc_value;
    }

    public void setDisc_value(String disc_value) {
        this.disc_value = disc_value;
    }

    public String getDisc_type() {
        return disc_type;
    }

    public void setDisc_type(String disc_type) {
        this.disc_type = disc_type;
    }

    public String getNet_amt() {
        return net_amt;
    }

    public void setNet_amt(String net_amt) {
        this.net_amt = net_amt;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public String getPurchase_bill_id() {
        return purchase_bill_id;
    }

    public void setPurchase_bill_id(String purchase_bill_id) {
        this.purchase_bill_id = purchase_bill_id;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getReturn_qty() {
        return return_qty;
    }

    public void setReturn_qty(String return_qty) {
        this.return_qty = return_qty;
    }

    public String getExpense_nature_name() {
        return expense_nature_name;
    }

    public void setExpense_nature_name(String expense_nature_name) {
        this.expense_nature_name = expense_nature_name;
    }

    public String getTaxable_amount() {
        return taxable_amount;
    }

    public void setTaxable_amount(String taxable_amount) {
        this.taxable_amount = taxable_amount;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailable_qty_admin() {
        return available_qty_admin;
    }

    public void setAvailable_qty_admin(String available_qty_admin) {
        this.available_qty_admin = available_qty_admin;
    }

    public String getAvailable_qty() {
        return available_qty;
    }

    public void setAvailable_qty(String available_qty) {
        this.available_qty = available_qty;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDebit_amount() {
        return debit_amount;
    }

    public void setDebit_amount(String debit_amount) {
        this.debit_amount = debit_amount;
    }

    public String getCredit_amount() {
        return credit_amount;
    }

    public void setCredit_amount(String credit_amount) {
        this.credit_amount = credit_amount;
    }

    public String getAvailableQty_outlet() {
        return availableQty_outlet;
    }

    public void setAvailableQty_outlet(String availableQty_outlet) {
        this.availableQty_outlet = availableQty_outlet;
    }
}
