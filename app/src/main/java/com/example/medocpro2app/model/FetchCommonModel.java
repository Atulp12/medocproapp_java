package com.example.medocpro2app.model;

import java.util.List;

public class FetchCommonModel {
    String success, status, message;
    public Result result;

    public FetchCommonModel(String success, String status, String message, Result result) {
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

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        List<ProductImage> product_image;
        String id, url, name, tablet_qty_per_strip, expiry_date, manufacturers, salt_composition, medicine_type, stock, introduction,
                benefits, description, how_to_use, safety_advise, if_miss, packaging, packaging_type, mrp, best_price, discount_percent,
                views, bought, prescription_required, label, Fact_Box, primary_use, storage, use_of, common_side_effect, alcohol_interaction,
                pregnancy_interaction, lactation_interaction, driving_interaction, kidney_interaction, liver_interaction, MANUFACTURER_ADDRESS,
                country_of_origin, for_sale, Q_A, igst, hsn, manufacturer, composition, packing_type, packing, schedule, usage, about_salt,
                mechanism_of_action, pharmacokinets, onset_of_action, duration_of_action, half_life, side_effects, contra_indications,
                sp_pre_wh_tk, preg_rel_inf, prod_alc_int, old_age_rel_inf, breast_feed_rel_inf, child_rel_inf, indications, interactions,
                typical_dosage, storage_requirements, eff_of_mis_dos, eff_of_overdose, exp_advice, faq, address, mobile, email,
                password, date, status, under_group, gstin, reg_type, party_type, legal_name, acc_name, short_name, contact_name,
                pan_no, def_cre_per, mode, address1, address2, country, pincode, state, ProvideBankDetails, Enablecreditlimit, opening_bal,
                hsn_sac, gst_rate, nature_of_transaction, inc_val_cal, app_to, meth_of_calc, od_limit, item_type, under_group_name,
                state_name, city_name, country_name, party_type_name, reg_type_name, mode_name, bank_details_id, bank_acc_name,
                bank_acc, bank_name, bank_ifsc, trans_id, trans_name, vehicle_no, veh_type, is_active, veh_type_name, rack_name,
                requirement,location, vendor, po_date, total_net_amount, gst_amount, sgst_amount, amount_with_gst, quotation_no,
                note, sr_no, total_qty, qty, unit_name, purchase_rate, product_name, schedule_name, sales_price, rack, jv_no,
                jv_date, vendor_name, debit_amount, credit_amount, reference_no, total_debit_amount, total_credit_amount, show_password;

        public String getParty_type_name() {
            return party_type_name;
        }

        public void setParty_type_name(String party_type_name) {
            this.party_type_name = party_type_name;
        }

        public String getReg_type_name() {
            return reg_type_name;
        }

        public void setReg_type_name(String reg_type_name) {
            this.reg_type_name = reg_type_name;
        }

        public String getMode_name() {
            return mode_name;
        }

        public void setMode_name(String mode_name) {
            this.mode_name = mode_name;
        }

        public String getBank_details_id() {
            return bank_details_id;
        }

        public void setBank_details_id(String bank_details_id) {
            this.bank_details_id = bank_details_id;
        }

        public String getBank_acc_name() {
            return bank_acc_name;
        }

        public void setBank_acc_name(String bank_acc_name) {
            this.bank_acc_name = bank_acc_name;
        }

        public String getBank_acc() {
            return bank_acc;
        }

        public void setBank_acc(String bank_acc) {
            this.bank_acc = bank_acc;
        }

        public String getBank_name() {
            return bank_name;
        }

        public void setBank_name(String bank_name) {
            this.bank_name = bank_name;
        }

        public String getBank_ifsc() {
            return bank_ifsc;
        }

        public void setBank_ifsc(String bank_ifsc) {
            this.bank_ifsc = bank_ifsc;
        }

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

        public String getUnder_group() {
            return under_group;
        }

        public void setUnder_group(String under_group) {
            this.under_group = under_group;
        }

        public String getGstin() {
            return gstin;
        }

        public void setGstin(String gstin) {
            this.gstin = gstin;
        }

        public String getReg_type() {
            return reg_type;
        }

        public void setReg_type(String reg_type) {
            this.reg_type = reg_type;
        }

        public String getParty_type() {
            return party_type;
        }

        public void setParty_type(String party_type) {
            this.party_type = party_type;
        }

        public String getLegal_name() {
            return legal_name;
        }

        public void setLegal_name(String legal_name) {
            this.legal_name = legal_name;
        }

        public String getAcc_name() {
            return acc_name;
        }

        public void setAcc_name(String acc_name) {
            this.acc_name = acc_name;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public String getContact_name() {
            return contact_name;
        }

        public void setContact_name(String contact_name) {
            this.contact_name = contact_name;
        }

        public String getPan_no() {
            return pan_no;
        }

        public void setPan_no(String pan_no) {
            this.pan_no = pan_no;
        }

        public String getDef_cre_per() {
            return def_cre_per;
        }

        public void setDef_cre_per(String def_cre_per) {
            this.def_cre_per = def_cre_per;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getAddress1() {
            return address1;
        }

        public void setAddress1(String address1) {
            this.address1 = address1;
        }

        public String getAddress2() {
            return address2;
        }

        public void setAddress2(String address2) {
            this.address2 = address2;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getProvideBankDetails() {
            return ProvideBankDetails;
        }

        public void setProvideBankDetails(String provideBankDetails) {
            ProvideBankDetails = provideBankDetails;
        }

        public String getEnablecreditlimit() {
            return Enablecreditlimit;
        }

        public void setEnablecreditlimit(String enablecreditlimit) {
            Enablecreditlimit = enablecreditlimit;
        }

        public String getOpening_bal() {
            return opening_bal;
        }

        public void setOpening_bal(String opening_bal) {
            this.opening_bal = opening_bal;
        }

        public String getHsn_sac() {
            return hsn_sac;
        }

        public void setHsn_sac(String hsn_sac) {
            this.hsn_sac = hsn_sac;
        }

        public String getGst_rate() {
            return gst_rate;
        }

        public void setGst_rate(String gst_rate) {
            this.gst_rate = gst_rate;
        }

        public String getNature_of_transaction() {
            return nature_of_transaction;
        }

        public void setNature_of_transaction(String nature_of_transaction) {
            this.nature_of_transaction = nature_of_transaction;
        }

        public String getInc_val_cal() {
            return inc_val_cal;
        }

        public void setInc_val_cal(String inc_val_cal) {
            this.inc_val_cal = inc_val_cal;
        }

        public String getApp_to() {
            return app_to;
        }

        public void setApp_to(String app_to) {
            this.app_to = app_to;
        }

        public String getMeth_of_calc() {
            return meth_of_calc;
        }

        public void setMeth_of_calc(String meth_of_calc) {
            this.meth_of_calc = meth_of_calc;
        }

        public String getOd_limit() {
            return od_limit;
        }

        public void setOd_limit(String od_limit) {
            this.od_limit = od_limit;
        }

        public String getItem_type() {
            return item_type;
        }

        public void setItem_type(String item_type) {
            this.item_type = item_type;
        }

        public String getUnder_group_name() {
            return under_group_name;
        }

        public void setUnder_group_name(String under_group_name) {
            this.under_group_name = under_group_name;
        }

        public String getState_name() {
            return state_name;
        }

        public void setState_name(String state_name) {
            this.state_name = state_name;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
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

        public String getVeh_type() {
            return veh_type;
        }

        public void setVeh_type(String veh_type) {
            this.veh_type = veh_type;
        }

        public String getIs_active() {
            return is_active;
        }

        public void setIs_active(String is_active) {
            this.is_active = is_active;
        }

        public String getVeh_type_name() {
            return veh_type_name;
        }

        public void setVeh_type_name(String veh_type_name) {
            this.veh_type_name = veh_type_name;
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

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
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

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getSr_no() {
            return sr_no;
        }

        public void setSr_no(String sr_no) {
            this.sr_no = sr_no;
        }

        public String getTotal_qty() {
            return total_qty;
        }

        public void setTotal_qty(String total_qty) {
            this.total_qty = total_qty;
        }

        public String getQty() {
            return qty;
        }

        public void setQty(String qty) {
            this.qty = qty;
        }

        public String getUnit_name() {
            return unit_name;
        }

        public void setUnit_name(String unit_name) {
            this.unit_name = unit_name;
        }

        public String getPurchase_rate() {
            return purchase_rate;
        }

        public void setPurchase_rate(String purchase_rate) {
            this.purchase_rate = purchase_rate;
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

        public String getSales_price() {
            return sales_price;
        }

        public void setSales_price(String sales_price) {
            this.sales_price = sales_price;
        }

        public String getRack() {
            return rack;
        }

        public void setRack(String rack) {
            this.rack = rack;
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

        public String getVendor_name() {
            return vendor_name;
        }

        public void setVendor_name(String vendor_name) {
            this.vendor_name = vendor_name;
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

        public String getReference_no() {
            return reference_no;
        }

        public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
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

        public String getShow_password() {
            return show_password;
        }

        public void setShow_password(String show_password) {
            this.show_password = show_password;
        }

        public List<ProductImage> getProduct_image() {
            return product_image;
        }

        public void setProduct_image(List<ProductImage> product_image) {
            this.product_image = product_image;
        }
    }
}
