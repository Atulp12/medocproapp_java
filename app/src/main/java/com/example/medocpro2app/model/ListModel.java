package com.example.medocpro2app.model;

import java.io.Serializable;

public class ListModel implements Serializable {
    String id, url, name, tablet_qty_per_strip, expiry_date, manufacturers, salt_composition, medicine_type, stock, introduction,
            benefits, description, how_to_use, safety_advise, if_miss, packaging, packaging_type, mrp, best_price, discount_percent,
            views, bought, prescription_required, label, Fact_Box, primary_use, storage, use_of, common_side_effect, alcohol_interaction,
            pregnancy_interaction, lactation_interaction, driving_interaction, kidney_interaction, liver_interaction, MANUFACTURER_ADDRESS,
            country_of_origin, for_sale, Q_A, igst, hsn, manufacturer, composition, packing_type, packing, schedule, usage, about_salt,
            mechanism_of_action, pharmacokinets, onset_of_action, duration_of_action, half_life, side_effects, contra_indications,
            sp_pre_wh_tk, preg_rel_inf, prod_alc_int, old_age_rel_inf, breast_feed_rel_inf, child_rel_inf, indications, interactions,
            typical_dosage, storage_requirements, eff_of_mis_dos, eff_of_overdose, exp_advice, faq, address, mobile, email,
            password, date, status, trans_id, trans_name, vehicle_no, rack_name, requirement, location, sr_no, po_date,
            total_net_amount, gst_amount, sgst_amount, amount_with_gst, quotation_no, quotation_ref, note, vendor, created_at,
            bill_no, terms, bill_date, due_date, debit_note_no, debit_note_date, voucher_no, paid_amount, total_amount, payment_date,
            mode, bill_amount, balance_amount, payment_id, jv_no, jv_date, reference_no, product_name, schedule_name, unit_name,
            qty, total_amount_with_gst, return_amount_without_gst, return_qty, acc_name, vendor_name, credit_to_vendor, total_credit_amount,
            total_debit_amount, invoice_no,invoice_date, outlet_name, received_amount, total_return_amount, total_paid_amount,
            total_invoice_amount, bank_name, purchase_rate, sales_price, total_inward_qty, total_outward_qty, average_pur_rate,
            sales_avg_rate, closing_qty, opening_value, total_inward_amount,sales_average_rate, total_outward_amount,
            closing_amount, net_amt, total_qty, requisition_no, requisition_date, outlet_id, rate, product, index, expense_nature
    ,product_id, total_Return_Amount_with_gst, inward_qty, inward_net_amount, outward_qty, sales_rate, outward_net_amount,
            closing_balance, original_qty, available_qty, image, mode_name, updated_date, payment_status, exp_date,
    return_amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTablet_qty_per_strip() {
        return tablet_qty_per_strip;
    }

    public void setTablet_qty_per_strip(String tablet_qty_per_strip) {
        this.tablet_qty_per_strip = tablet_qty_per_strip;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getSalt_composition() {
        return salt_composition;
    }

    public void setSalt_composition(String salt_composition) {
        this.salt_composition = salt_composition;
    }

    public String getMedicine_type() {
        return medicine_type;
    }

    public void setMedicine_type(String medicine_type) {
        this.medicine_type = medicine_type;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHow_to_use() {
        return how_to_use;
    }

    public void setHow_to_use(String how_to_use) {
        this.how_to_use = how_to_use;
    }

    public String getSafety_advise() {
        return safety_advise;
    }

    public void setSafety_advise(String safety_advise) {
        this.safety_advise = safety_advise;
    }

    public String getIf_miss() {
        return if_miss;
    }

    public void setIf_miss(String if_miss) {
        this.if_miss = if_miss;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getPackaging_type() {
        return packaging_type;
    }

    public void setPackaging_type(String packaging_type) {
        this.packaging_type = packaging_type;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getBest_price() {
        return best_price;
    }

    public void setBest_price(String best_price) {
        this.best_price = best_price;
    }

    public String getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(String discount_percent) {
        this.discount_percent = discount_percent;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getBought() {
        return bought;
    }

    public void setBought(String bought) {
        this.bought = bought;
    }

    public String getPrescription_required() {
        return prescription_required;
    }

    public void setPrescription_required(String prescription_required) {
        this.prescription_required = prescription_required;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFact_Box() {
        return Fact_Box;
    }

    public void setFact_Box(String fact_Box) {
        Fact_Box = fact_Box;
    }

    public String getPrimary_use() {
        return primary_use;
    }

    public void setPrimary_use(String primary_use) {
        this.primary_use = primary_use;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getUse_of() {
        return use_of;
    }

    public void setUse_of(String use_of) {
        this.use_of = use_of;
    }

    public String getCommon_side_effect() {
        return common_side_effect;
    }

    public void setCommon_side_effect(String common_side_effect) {
        this.common_side_effect = common_side_effect;
    }

    public String getAlcohol_interaction() {
        return alcohol_interaction;
    }

    public void setAlcohol_interaction(String alcohol_interaction) {
        this.alcohol_interaction = alcohol_interaction;
    }

    public String getPregnancy_interaction() {
        return pregnancy_interaction;
    }

    public void setPregnancy_interaction(String pregnancy_interaction) {
        this.pregnancy_interaction = pregnancy_interaction;
    }

    public String getLactation_interaction() {
        return lactation_interaction;
    }

    public void setLactation_interaction(String lactation_interaction) {
        this.lactation_interaction = lactation_interaction;
    }

    public String getDriving_interaction() {
        return driving_interaction;
    }

    public void setDriving_interaction(String driving_interaction) {
        this.driving_interaction = driving_interaction;
    }

    public String getKidney_interaction() {
        return kidney_interaction;
    }

    public void setKidney_interaction(String kidney_interaction) {
        this.kidney_interaction = kidney_interaction;
    }

    public String getLiver_interaction() {
        return liver_interaction;
    }

    public void setLiver_interaction(String liver_interaction) {
        this.liver_interaction = liver_interaction;
    }

    public String getMANUFACTURER_ADDRESS() {
        return MANUFACTURER_ADDRESS;
    }

    public void setMANUFACTURER_ADDRESS(String MANUFACTURER_ADDRESS) {
        this.MANUFACTURER_ADDRESS = MANUFACTURER_ADDRESS;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public String getFor_sale() {
        return for_sale;
    }

    public void setFor_sale(String for_sale) {
        this.for_sale = for_sale;
    }

    public String getQ_A() {
        return Q_A;
    }

    public void setQ_A(String q_A) {
        Q_A = q_A;
    }

    public String getIgst() {
        return igst;
    }

    public void setIgst(String igst) {
        this.igst = igst;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getPacking_type() {
        return packing_type;
    }

    public void setPacking_type(String packing_type) {
        this.packing_type = packing_type;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getAbout_salt() {
        return about_salt;
    }

    public void setAbout_salt(String about_salt) {
        this.about_salt = about_salt;
    }

    public String getMechanism_of_action() {
        return mechanism_of_action;
    }

    public void setMechanism_of_action(String mechanism_of_action) {
        this.mechanism_of_action = mechanism_of_action;
    }

    public String getPharmacokinets() {
        return pharmacokinets;
    }

    public void setPharmacokinets(String pharmacokinets) {
        this.pharmacokinets = pharmacokinets;
    }

    public String getOnset_of_action() {
        return onset_of_action;
    }

    public void setOnset_of_action(String onset_of_action) {
        this.onset_of_action = onset_of_action;
    }

    public String getDuration_of_action() {
        return duration_of_action;
    }

    public void setDuration_of_action(String duration_of_action) {
        this.duration_of_action = duration_of_action;
    }

    public String getHalf_life() {
        return half_life;
    }

    public void setHalf_life(String half_life) {
        this.half_life = half_life;
    }

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    public String getContra_indications() {
        return contra_indications;
    }

    public void setContra_indications(String contra_indications) {
        this.contra_indications = contra_indications;
    }

    public String getSp_pre_wh_tk() {
        return sp_pre_wh_tk;
    }

    public void setSp_pre_wh_tk(String sp_pre_wh_tk) {
        this.sp_pre_wh_tk = sp_pre_wh_tk;
    }

    public String getPreg_rel_inf() {
        return preg_rel_inf;
    }

    public void setPreg_rel_inf(String preg_rel_inf) {
        this.preg_rel_inf = preg_rel_inf;
    }

    public String getProd_alc_int() {
        return prod_alc_int;
    }

    public void setProd_alc_int(String prod_alc_int) {
        this.prod_alc_int = prod_alc_int;
    }

    public String getOld_age_rel_inf() {
        return old_age_rel_inf;
    }

    public void setOld_age_rel_inf(String old_age_rel_inf) {
        this.old_age_rel_inf = old_age_rel_inf;
    }

    public String getBreast_feed_rel_inf() {
        return breast_feed_rel_inf;
    }

    public void setBreast_feed_rel_inf(String breast_feed_rel_inf) {
        this.breast_feed_rel_inf = breast_feed_rel_inf;
    }

    public String getChild_rel_inf() {
        return child_rel_inf;
    }

    public void setChild_rel_inf(String child_rel_inf) {
        this.child_rel_inf = child_rel_inf;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getTypical_dosage() {
        return typical_dosage;
    }

    public void setTypical_dosage(String typical_dosage) {
        this.typical_dosage = typical_dosage;
    }

    public String getStorage_requirements() {
        return storage_requirements;
    }

    public void setStorage_requirements(String storage_requirements) {
        this.storage_requirements = storage_requirements;
    }

    public String getEff_of_mis_dos() {
        return eff_of_mis_dos;
    }

    public void setEff_of_mis_dos(String eff_of_mis_dos) {
        this.eff_of_mis_dos = eff_of_mis_dos;
    }

    public String getEff_of_overdose() {
        return eff_of_overdose;
    }

    public void setEff_of_overdose(String eff_of_overdose) {
        this.eff_of_overdose = eff_of_overdose;
    }

    public String getExp_advice() {
        return exp_advice;
    }

    public void setExp_advice(String exp_advice) {
        this.exp_advice = exp_advice;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_name() {
        return trans_name;
    }

    public void setTrans_name(String trans_name) {
        this.trans_name = trans_name;
    }

    public String getVehicle_no() {
        return vehicle_no;
    }

    public void setVehicle_no(String vehicle_no) {
        this.vehicle_no = vehicle_no;
    }

    public String getRack_name() {
        return rack_name;
    }

    public void setRack_name(String rack_name) {
        this.rack_name = rack_name;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getQuotation_ref() {
        return quotation_ref;
    }

    public void setQuotation_ref(String quotation_ref) {
        this.quotation_ref = quotation_ref;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
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

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
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

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
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

    public String getReference_no() {
        return reference_no;
    }

    public void setReference_no(String reference_no) {
        this.reference_no = reference_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getSchedule_name() {
        return schedule_name;
    }

    public void setSchedule_name(String schedule_name) {
        this.schedule_name = schedule_name;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTotal_amount_with_gst() {
        return total_amount_with_gst;
    }

    public void setTotal_amount_with_gst(String total_amount_with_gst) {
        this.total_amount_with_gst = total_amount_with_gst;
    }

    public String getReturn_amount_without_gst() {
        return return_amount_without_gst;
    }

    public void setReturn_amount_without_gst(String return_amount_without_gst) {
        this.return_amount_without_gst = return_amount_without_gst;
    }

    public String getReturn_qty() {
        return return_qty;
    }

    public void setReturn_qty(String return_qty) {
        this.return_qty = return_qty;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getCredit_to_vendor() {
        return credit_to_vendor;
    }

    public void setCredit_to_vendor(String credit_to_vendor) {
        this.credit_to_vendor = credit_to_vendor;
    }

    public String getTotal_credit_amount() {
        return total_credit_amount;
    }

    public void setTotal_credit_amount(String total_credit_amount) {
        this.total_credit_amount = total_credit_amount;
    }

    public String getTotal_debit_amount() {
        return total_debit_amount;
    }

    public void setTotal_debit_amount(String total_debit_amount) {
        this.total_debit_amount = total_debit_amount;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(String invoice_date) {
        this.invoice_date = invoice_date;
    }

    public String getOutlet_name() {
        return outlet_name;
    }

    public void setOutlet_name(String outlet_name) {
        this.outlet_name = outlet_name;
    }

    public String getReceived_amount() {
        return received_amount;
    }

    public void setReceived_amount(String received_amount) {
        this.received_amount = received_amount;
    }

    public String getTotal_return_amount() {
        return total_return_amount;
    }

    public void setTotal_return_amount(String total_return_amount) {
        this.total_return_amount = total_return_amount;
    }

    public String getTotal_paid_amount() {
        return total_paid_amount;
    }

    public void setTotal_paid_amount(String total_paid_amount) {
        this.total_paid_amount = total_paid_amount;
    }

    public String getTotal_invoice_amount() {
        return total_invoice_amount;
    }

    public void setTotal_invoice_amount(String total_invoice_amount) {
        this.total_invoice_amount = total_invoice_amount;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getPurchase_rate() {
        return purchase_rate;
    }

    public void setPurchase_rate(String purchase_rate) {
        this.purchase_rate = purchase_rate;
    }

    public String getSales_price() {
        return sales_price;
    }

    public void setSales_price(String sales_price) {
        this.sales_price = sales_price;
    }

    public String getTotal_inward_qty() {
        return total_inward_qty;
    }

    public void setTotal_inward_qty(String total_inward_qty) {
        this.total_inward_qty = total_inward_qty;
    }

    public String getTotal_outward_qty() {
        return total_outward_qty;
    }

    public void setTotal_outward_qty(String total_outward_qty) {
        this.total_outward_qty = total_outward_qty;
    }

    public String getAverage_pur_rate() {
        return average_pur_rate;
    }

    public void setAverage_pur_rate(String average_pur_rate) {
        this.average_pur_rate = average_pur_rate;
    }

    public String getSales_avg_rate() {
        return sales_avg_rate;
    }

    public void setSales_avg_rate(String sales_avg_rate) {
        this.sales_avg_rate = sales_avg_rate;
    }

    public String getClosing_qty() {
        return closing_qty;
    }

    public void setClosing_qty(String closing_qty) {
        this.closing_qty = closing_qty;
    }

    public String getTotal_inward_amount() {
        return total_inward_amount;
    }

    public void setTotal_inward_amount(String total_inward_amount) {
        this.total_inward_amount = total_inward_amount;
    }

    public String getSales_average_rate() {
        return sales_average_rate;
    }

    public void setSales_average_rate(String sales_average_rate) {
        this.sales_average_rate = sales_average_rate;
    }

    public String getTotal_outward_amount() {
        return total_outward_amount;
    }

    public void setTotal_outward_amount(String total_outward_amount) {
        this.total_outward_amount = total_outward_amount;
    }

    public String getClosing_amount() {
        return closing_amount;
    }

    public void setClosing_amount(String closing_amount) {
        this.closing_amount = closing_amount;
    }

    public String getOpening_value() {
        return opening_value;
    }

    public void setOpening_value(String opening_value) {
        this.opening_value = opening_value;
    }

    public String getNet_amt() {
        return net_amt;
    }

    public void setNet_amt(String net_amt) {
        this.net_amt = net_amt;
    }

    public String getTotal_qty() {
        return total_qty;
    }

    public void setTotal_qty(String total_qty) {
        this.total_qty = total_qty;
    }

    public String getRequisition_no() {
        return requisition_no;
    }

    public void setRequisition_no(String requisition_no) {
        this.requisition_no = requisition_no;
    }

    public String getRequisition_date() {
        return requisition_date;
    }

    public void setRequisition_date(String requisition_date) {
        this.requisition_date = requisition_date;
    }

    public String getOutlet_id() {
        return outlet_id;
    }

    public void setOutlet_id(String outlet_id) {
        this.outlet_id = outlet_id;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getExpense_nature() {
        return expense_nature;
    }

    public void setExpense_nature(String expense_nature) {
        this.expense_nature = expense_nature;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getTotal_Return_Amount_with_gst() {
        return total_Return_Amount_with_gst;
    }

    public void setTotal_Return_Amount_with_gst(String total_Return_Amount_with_gst) {
        this.total_Return_Amount_with_gst = total_Return_Amount_with_gst;
    }

    public String getInward_qty() {
        return inward_qty;
    }

    public void setInward_qty(String inward_qty) {
        this.inward_qty = inward_qty;
    }

    public String getInward_net_amount() {
        return inward_net_amount;
    }

    public void setInward_net_amount(String inward_net_amount) {
        this.inward_net_amount = inward_net_amount;
    }

    public String getOutward_qty() {
        return outward_qty;
    }

    public void setOutward_qty(String outward_qty) {
        this.outward_qty = outward_qty;
    }

    public String getSales_rate() {
        return sales_rate;
    }

    public void setSales_rate(String sales_rate) {
        this.sales_rate = sales_rate;
    }

    public String getOutward_net_amount() {
        return outward_net_amount;
    }

    public void setOutward_net_amount(String outward_net_amount) {
        this.outward_net_amount = outward_net_amount;
    }

    public String getClosing_balance() {
        return closing_balance;
    }

    public void setClosing_balance(String closing_balance) {
        this.closing_balance = closing_balance;
    }

    public String getOriginal_qty() {
        return original_qty;
    }

    public void setOriginal_qty(String original_qty) {
        this.original_qty = original_qty;
    }

    public String getAvailable_qty() {
        return available_qty;
    }

    public void setAvailable_qty(String available_qty) {
        this.available_qty = available_qty;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMode_name() {
        return mode_name;
    }

    public void setMode_name(String mode_name) {
        this.mode_name = mode_name;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getReturn_amount() {
        return return_amount;
    }

    public void setReturn_amount(String return_amount) {
        this.return_amount = return_amount;
    }
}
