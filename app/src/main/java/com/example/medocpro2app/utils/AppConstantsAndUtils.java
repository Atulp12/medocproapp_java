package com.example.medocpro2app.utils;


public class AppConstantsAndUtils {

    public static final String STATUS_SUCCESS = "1";
    //public static final String STATUS_SUCCESS = "true";
    public static final Integer REQUEST_TIMEOUT = 640000; //2Min
    /*******************************************PREFERENCE************************************************************/
    /*  SHARED PREFERENCE*/
    public static final String USER_ID = "user_id";
    public static final String SHARED_PREFERENCE_NAME = "name";
    public static final String SHARED_PREFERENCE_NAME_BACK_UP = "back_up_token";
    public static final String PREF_HEADER_REQ_TOKEN = "header_token";
    public static final String LAST_SIGNIN_TIME = "last_signin_time";
    public static final String PREF_USER_LOGE_IN = "pref_user_loge_in";
    public static final String LAST_SIGNIN_USERID = "last_signin_userid";
    public static final String LAST_SIGNIN_PASSWORD = "last_signin_password";
    public static final String USERNAME = "username";
    public static final String USERTYPE = "user_type";
    public static final String NAME = "name";
    public static final String BRANCH_ID = "branch_Id";
    public static final String BRANCH_IDD = "branch_id";
    public static final String PRODUCT = "product";
    public static final String UNLOADING_ID = "unloading_id";
    public static final String IDD = "id";
    public static final String TRANS_MODE_ID = "id";
    public static final String REG_TYPE_ID = "reg_type_id";
    public static final String PARTY_TYPE_ID = "party_type_id";
    public static final String MODE_ID = "mode_id";
    public static final String ACCOUNT_ID = "group_id";
    public static final String VENDOR_ID = "id";
    public static final String PRODUCT_IDD = "id";
    public static final String PRODUCT_ID = "product_id";
    public static final String OUTLET_ID = "outlet_id";
    public static final String RACK_ID = "id";
    public static final String SCHEDULE_ID = "id";
    public static final String COUNTRY_ID = "country_id";
    public static final String STATE_ID = "state_id";
    public static final String CITY_ID = "city_id";
    public static final String PAYMENT_ID = "payment_id";
    public static final String BILL_NO = "bill_no";
    public static final String VENDOR_NAME = "vendor_name";
    //public static final String VENDOR_NAME = "vendor_name";
    public static final String BANK_ID = "bank_id";

    public static final String OUTLET_IDD = "outlet_id";
    /***************************------------------------------------------------All URL's---------*******************************/
    /*All URL's*/
    private static final String BASE_URL = "https://faithosys.com/Admin/index.php/api/";
    private static final String IMAGE_BASE_URL = "https://faithosys.com/Admin/product_images/";
    private static final String IMAGE_BASE_URL1 = "https://faithosys.com/Admin/product_images/image1.jpg";
    private static final String IMAGE_BASE_URL2 = "https://faithosys.com/Admin/product_images/image2.jpg";
    private static final String IMAGE_BASE_URL3 = "https://faithosys.com/Admin/product_images/image3.jpg";
    private static final String IMAGE_BASE_URL4 = "https://faithosys.com/Admin/product_images/image4.jpg";
    private static final String IMAGE_BASE_URL5 = "https://faithosys.com/Admin/product_images/image5.jpg";
    public static final String URL_IMAGE = IMAGE_BASE_URL;
    public static final String URL_LOGIN = BASE_URL + "Login/Login_user";
    public static final String URL_PRODUCT_LIST = BASE_URL + "Product/outlet_stock";
    public static final String URL_FETCH_PRODUCT_LIST = BASE_URL + "Product/fetch_outlet_stock";
    public static final String URL_UPDATE_PRODUCT = BASE_URL + "Product/update_product";

    public static final String URL_DELETE_PRODUCT = BASE_URL + "Product/delete_outlet_stock";
    public static final String URL_ACCOUNT_LIST = BASE_URL + "Outlet/Account_list_outlet";
    public static final String URL_FETCH_ACCOUNT = BASE_URL + "Outlet/fetch_account";
    public static final String URL_DELETE_ACCOUNT = BASE_URL + "Master/delete_account";
    public static final String URL_SCHEDULE_LIST = BASE_URL + "Master/schedule_list";
    public static final String URL_FETCH_SCHEDULE = BASE_URL + "Master/fetch_schedule";
    public static final String URL_ADD_SCHEDULE = BASE_URL + "Master/add_schedule";
    public static final String URL_UPDATE_SCHEDULE = BASE_URL + "Master/update_schedule";
    public static final String URL_DELETE_SCHEDULE = BASE_URL + "Master/delete_schedule";
    public static final String URL_SALES_INVOICE_LIST = BASE_URL + "Sales_invoice/sales_invoice_list";
    public static final String URL_FETCH_SALES_INVOICE = BASE_URL + "Sales_invoice/fetch_sales_invoice";
    public static final String URL_DELETE_SALES_INVOICE = BASE_URL + "Sales_invoice/delete_sales_invoice";
    public static final String URL_CUSTOMER_LIST = BASE_URL + "Outlet/customer_list";
    public static final String URL_DELETE_TRANSPORTER = BASE_URL + "Master/delete_transporter";
    public static final String URL_MODE_LIST = BASE_URL + "Master/mode_list";
    public static final String URL_AUTO_INCREMENT_TRANSPORTER_ID = BASE_URL + "Master/auotoIncrement_transporter_id";
    public static final String URL_RACK_LIST = BASE_URL + "Master/rack_list";
    public static final String URL_FETCH_RACK = BASE_URL + "Master/fetch_rack";
    public static final String URL_ADD_RACK = BASE_URL + "Master/add_rack";
    public static final String URL_UPDATE_RACK = BASE_URL + "Master/update_rack";

    public static final String URL_DELETE_RACK = BASE_URL + "Master/delete_rack";
    public static final String URL_UNDER_GROUP_LIST = BASE_URL + "Master/under_group_list";
    public static final String URL_UNDER_GROUP_LIST1 = BASE_URL + "Master/under_group_list1";
    public static final String URL_CRM_LIST = BASE_URL + "Master/crm_list";
    public static final String URL_FETCH_CRM = BASE_URL + "Master/fetch_crm";
    public static final String URL_ADD_CRM = BASE_URL + "Master/add_crm";
    public static final String URL_UPDATE_CRM = BASE_URL + "Master/update_crm";
    public static final String URL_DELETE_CRM = BASE_URL + "Master/delete_crm";
    public static final String URL_DELETE_PURCHASE_RETURN = BASE_URL + "Purchase_order/delete_purchase_return";

    public static final String URL_PURCHASE_ORDER_LIST = BASE_URL + "Purchase_order/Purchase_order_list";
    public static final String URL_FETCH_PURCHASE_ORDER = BASE_URL + "Purchase_order/fetch_purchase_order";

    public static final String URL_AUTO_INCREMENT_PURCHASE_ORDER_ID = BASE_URL + "Purchase_order/autoincrement_pur_order_id";
    public static final String URL_AUTO_INCREMENT_QUOTATION_NO = BASE_URL + "Purchase_order/auotoIncrement_quotation_no";
    public static final String URL_PURCHASE_BILL_LIST = BASE_URL + "Purchase_order/Purchase_bill_list";

    public static final String URL_FETCH_PURCHASE_BILL = BASE_URL + "Purchase_order/fetch_purchase_bill";
    public static final String URL_FETCH_PURCHASE_BILL1 = BASE_URL + "Purchase_order/fetch_purchase_bill1";
    public static final String URL_PAYMENT_LIST = BASE_URL + "Purchase_order/payment_list";
    public static final String URL_FETCH_PAYMENT_DATA = BASE_URL + "Purchase_order/fetch_payment_data";
    public static final String URL_PURCHASE_RETURN_LIST = BASE_URL + "Purchase_order/purchase_return_list";
    public static final String URL_FETCH_PURCHASE_RETURN_DATA = BASE_URL + "Purchase_order/fetch_purchase_return_data";
    public static final String URL_EXPENSE_LIST = BASE_URL + "Expense/expenses_list";
    public static final String URL_FETCH_EXPENSE_DATA = BASE_URL + "Expense/fetch_expenses_data";
    public static final String URL_JOURNAL_VOUCHER_LIST = BASE_URL + "Journal_voucher/journal_Voucher_list";
    public static final String URL_STOCK_LIST = BASE_URL + "Stock/stock_list";

    public static final String URL_AUTOINCREMENT_PRODUCT_ID = BASE_URL + "Product/Autoincrement_product_id";
    public static final String URL_DELETE_PURCHASE_BILL = BASE_URL + "Purchase_order/delete_purchase_bill";
    public static final String URL_DELETE_PURCHASE_ORDER = BASE_URL + "Purchase_order/delete_purchase_order";
    public static final String URL_DELETE_PAYMENT = BASE_URL + "Purchase_order/delete_payment";
    public static final String URL_ADD_PRODUCT1 = BASE_URL + "Product/add_product1";
    public static final String URL_ADD_PRODUCT2 = BASE_URL + "Product/add_product2";
    public static final String URL_ADD_PRODUCT3 = BASE_URL + "Product/add_product3";
    public static final String URL_ADD_PRODUCT4 = BASE_URL + "Product/add_product4";
    public static final String URL_UPDATE_IMAGE = BASE_URL + "Product/update_image";
    public static final String URL_CALCULATE_PUR_ORDER = BASE_URL + "Product/calculation_pur_order";
    public static final String URL_CALCULATE_PUR_RETURN = BASE_URL + "Purchase_order/calculate_pur_return_amt";
    public static final String URL_ADD_SALES_INVOICE1 = BASE_URL + "Sales_invoice/add_sales_invoice1";
    public static final String URL_ADD_SALES_INVOICE2 = BASE_URL + "Sales_invoice/add_sales_invoice2";
    public static final String URL_ADD_SALES_INVOICE3 = BASE_URL + "Sales_invoice/add_sales_invoice3";
    //public static final String URL_NOTIFICATION_REQ_NOTIFICATION_ADMIN = BASE_URL + "Notification/req_notification_admin";
    //public static final String URL_NOTIFICATION_EXPIRED_ADMIN_STOCK = BASE_URL + "Notification/expired_Admin_stock";
    //public static final String URL_NOTIFICATION_LOW_STOCK_ADMIN = BASE_URL + "Notification/low_stock_admin";
    //public static final String URL_NOTIFICATION_OUT_OF_STOCK_ADMIN = BASE_URL + "Notification/out_of_stock_Admin";
    /*public static final String URL_NOTIFICATION_REC_PRODUCT_TO_OUTLET = BASE_URL + "Notification/rec_product_to_outlet";
    public static final String URL_NOTIFICATION_EXPIRED_OUTLET_STOCK = BASE_URL + "Notification/expired_outlet_stock";
    public static final String URL_NOTIFICATION_LOW_STOCK_OUTLET = BASE_URL + "Notification/low_stock_outlet";
    public static final String URL_LOW_STOCK_OUTLET = BASE_URL + "Notification/out_of_stock_outlet";*/
    public static final String URL_REQ_LIST = BASE_URL + "Req_order/Req_list";
    public static final String URL_FETCH_REQ_DATA = BASE_URL + "Req_order/fetch_req_data";
    public static final String URL_AUTOINCREMENT_REQ_NO = BASE_URL + "Req_order/autoincrement_req_no";
    public static final String URL_CALCULATE_REQ_ORDER = BASE_URL + "Req_order/calculation_req_order";
    public static final String URL_ADD_REQ_ORDER1 = BASE_URL + "Req_order/add_req_order1";
    public static final String URL_ADD_REQ_ORDER2 = BASE_URL + "Req_order/add_req_order2";
    public static final String URL_ADD_REQ_ORDER3 = BASE_URL + "Req_order/add_req_order3";
    public static final String URL_OUTLET_REQ_LIST_ADMIN = BASE_URL + "Req_order/outlet_req_list_for_admin";
    public static final String URL_VIEW_OUTLET_REQ_ADMIN = BASE_URL + "Req_order/view_outlet_req_for_admin";
    public static final String URL_AUTOINCREMENT_INVOICE_NO = BASE_URL + "Req_order/autoincrement_invoice_no";
    public static final String URL_AUTOINCREMENT_BILL_NO = BASE_URL + "Purchase_order/autoincrement_bill_no";
    public static final String URL_TERM = BASE_URL + "Req_order/term";
    public static final String URL_ADD_REQ_INVOICE = BASE_URL + "Req_order/add_req_invoice";
    public static final String URL_ADD_REQ_INVOICE1 = BASE_URL + "Req_order/add_req_invoice1";
    public static final String URL_ADD_REQ_INVOICE2 = BASE_URL + "Req_order/add_req_invoice2";
    public static final String URL_ADD_REQ_INVOICE3 = BASE_URL + "Req_order/add_req_invoice3";
    public static final String URL_REQ_PAYMENT_LIST = BASE_URL + "Req_order/req_payment_list";
    public static final String URL_FETCH_REQ_PAYMENT = BASE_URL + "Req_order/fetch_req_payment";
    public static final String URL_DELETE_REQ_PAYMENT = BASE_URL + "Req_order/delete_req_payment";
    public static final String URL_FETCH_REQ_PAY_PRODUCT_BY_INVOICE_NO = BASE_URL + "Req_order/fetch_reqPayProductByInvoice_no";
    public static final String URL_CALCULATE_BALANCE_AMOUNT = BASE_URL + "Product/calculate_balance_amount";
    public static final String URL_INVOICE_NO_LIST = BASE_URL + "Req_order/invoice_no_list";
    public static final String URL_ADD_REQ_PAYMENT1 = BASE_URL + "Req_order/add_req_payment1";
    public static final String URL_ADD_REQ_PAYMENT2 = BASE_URL + "Req_order/add_req_payment2";
    public static final String URL_ADD_REQ_PAYMENT3 = BASE_URL + "Req_order/add_req_payment3";
    public static final String URL_REQ_RETURN_LIST = BASE_URL + "Req_order/req_return_list";
    public static final String URL_FETCH_REQ_RETURN = BASE_URL + "Req_order/fetch_req_return";
    public static final String URL_DELETE_REQ_RETURN = BASE_URL + "Req_order/delete_req_return";
    public static final String URL_AUTOINCREMENT_DEBIT_NOTE_NO = BASE_URL + "Req_order/autoincrement_debitNoteNo";
    public static final String URL_ADD_REQ1 = BASE_URL + "Req_order/add_req_Return1";
    public static final String URL_ADD_REQ2 = BASE_URL + "Req_order/add_req_Return2";
    public static final String URL_ADD_REQ3 = BASE_URL + "Req_order/add_req_Return3";


    public static final String URL_VENDOR_LIST = BASE_URL + "Purchase_order/vendor_list";
    public static final String URL_VENDOR_LIST1 = BASE_URL + "Purchase_order/vendor_list1";
    public static final String URL_PARTY_TYPE = BASE_URL + "Master/party_type_list";
    public static final String URL_REG_TYPE = BASE_URL + "Master/reg_type_list";

    public static final String URL_PAYMENT_MODE_LIST = BASE_URL + "Master/payment_mode_list";
    public static final String URL_PAYMENT_MODE_LIST1 = BASE_URL + "Master/payment_mode_list1";
    public static final String URL_FETCH_BILL_NO = BASE_URL + "Purchase_order/fetch_bill_no";
    public static final String URL_COUNTRY_LIST = BASE_URL + "Master/country_list";
    public static final String URL_STATE_LIST = BASE_URL + "Master/state_list";
    public static final String URL_CITY_LIST = BASE_URL + "Master/city_list";

    public static final String URL_ADD_ACCOUNT1 = BASE_URL + "Master/add_account1";
    public static final String URL_ADD_ACCOUNT2 = BASE_URL + "Master/add_account2";
    public static final String URL_ADD_ACCOUNT3 = BASE_URL + "Master/add_account3";
    public static final String URL_APPROVED_STATUS = BASE_URL + "Purchase_order/approved_status";
    public static final String URL_ADD_PURCHASE_BILL = BASE_URL + "Purchase_order/add_purchase_bill";
    public static final String URL_ADD_BATCH_NO = BASE_URL + "Purchase_order/add_batch_no";
    public static final String URL_PRODUCT = BASE_URL + "Product/get_product_list";
    public static final String URL_FETCH_PRODUCT = BASE_URL + "Purchase_order/fetch_product";
    public static final String URL_VIEW_TEMP_PRODUCT = BASE_URL + "Purchase_order/view_temp_product";
    public static final String URL_DELETE_TEMP_PRODUCT = BASE_URL + "Purchase_order/delete_temp_product";
    public static final String URL_SEARCH_VENDOR_LIST = BASE_URL + "Product/search_vendor_list";

    public static final String URL_SEARCH_PRODUCT_NAME = BASE_URL + "Product/search_product_name";
    public static final String URL_SEARCH_PRODUCT_NAME1 = BASE_URL + "Stock/search_product_name1";
    public static final String URL_AUTOINCREMENT_VOUCHER_NO = BASE_URL + "Purchase_order/autoincrement_voucher_no";
    public static final String URL_ADD_PAYMENT = BASE_URL + "Purchase_order/add_payment";
    public static final String URL_AUTOINCREMENT_DEBIT_NOTE1 = BASE_URL + "Purchase_order/autoincrement_debitNoteNo1";

    public static final String URL_ADD_PURCHASE_RETURN_QTY = BASE_URL + "Purchase_order/add_purchase_return_qty";
    public static final String URL_ADD_PURCHASE_RETURN = BASE_URL + "Purchase_order/add_purchase_return";
    public static final String URL_FETCH_PRODUCT_AGAINST_BILL = BASE_URL + "Purchase_order/fetch_products_against_bill";
    public static final String URL_ADD_PAYMENT1 = BASE_URL + "Purchase_order/add_payment1";
    public static final String URL_ADD_PAYMENT2 = BASE_URL + "Purchase_order/add_payment2";
    public static final String URL_UPDATE_PURCHASE_ORDER = BASE_URL + "Purchase_order/update_purchase_order";
    public static final String URL_UPDATE_SALES_PRICE_ADMIN = BASE_URL + "Stock/updateSalesPriceAdmin";
    public static final String URL_REASON = BASE_URL + "Purchase_order/reason";
    public static final String URL_FETCH_PRODUCT_STOCK = BASE_URL + "Stock/fetch_product";
    public static final String URL_CALCULATED_AMOUNT = BASE_URL + "Purchase_order/calculated_amount";
    public static final String URL_ALL_ACCOUNT_LIST = BASE_URL + "Master/all_account_list";
    public static final String URL_AUTO_INCREMENT_EXP_VOUCHER_NO = BASE_URL + "Expense/auotoIncrement_exp_voucherNo";

    public static final String URL_FETCH_ACCOUNT_DETAILS = BASE_URL + "Master/fetch_account_details";
    public static final String URL_ADD_EXPENSE1 = BASE_URL + "Expense/add_expense1";
    public static final String URL_EXPENSE_NATURE_LIST = BASE_URL + "Expense/expense_nature_list";
    public static final String URL_ADD_EXPENSE2 = BASE_URL + "Expense/add_expense2";
    public static final String URL_ADD_EXPENSE3 = BASE_URL + "Expense/add_expense3";
    public static final String URL_VIEW_TEMP_NATURE_OF_EXPENSE = BASE_URL + "Expense/view_tmp_nature_of_exp";

    public static final String URL_DELETE_TEMP_NATURE_EXPENSE = BASE_URL + "Expense/delete_temp_natureofexp";
    public static final String URL_CALCULATE_EXP_TOTAL_AMT = BASE_URL + "Expense/calaculate_exp_total_amt";

    public static final String URL_FETCH_STOCK_PRODUCT = BASE_URL + "Stock/fetch_stock_product";
    public static final String URL_UPDATE_STOCK_ADMIN = BASE_URL + "Stock/update_stock_admin";
    public static final String URL_ADD_JOURNAL_VOUCHER = BASE_URL + "Journal_voucher/add_journal_voucher";
    public static final String URL_AUTOINCREMENT_JV = BASE_URL + "Journal_voucher/autoincrement_jv";
    public static final String URL_FETCH_JOURNAL_VOUCHER = BASE_URL + "Journal_voucher/fetch_journal_Voucher";

    public static final String URL_DELETE_JOURNAL_VOUCHER = BASE_URL + "Journal_voucher/delete_journal_voucher";

    public static final String URL_STAFF_LIST = BASE_URL + "Staff/staff_list";
    public static final String URL_FETCH_STAFF = BASE_URL + "Staff/fetch_staff";
    public static final String URL_ADD_STAFF = BASE_URL + "Staff/add_staff";
    public static final String URL_UPDATE_STAFF = BASE_URL + "Staff/update_staff";
    public static final String URL_DELETE_STAFF = BASE_URL + "Staff/delete_staff";
    public static final String URL_VIEW_PRODUCT_IMAGE = BASE_URL + "Product/view_products_image";
    public static final String URL_FETCH_SINGLE_IMAGE = BASE_URL + "Product/fetch_single_image";
    public static final String URL_SEARCH_PRODUCT_BY_RACK = BASE_URL + "Stock/search_product_by_rack";
    public static final String URL_SEARCH_PRODUCT_BY_SCHEDULE = BASE_URL + "Stock/search_product_by_schedule";


    //report
    public static final String URL_REQUISITION_SUMMARY = BASE_URL + "Outlet_report/Requisition_summary";
    public static final String URL_REQUISITION_RETURN_SUMMARY_REPORT = BASE_URL + "Outlet_report/Requisition_return_summery_report";
    public static final String URL_EXPENSE_SUMMARY_REPORT = BASE_URL + "Outlet_report/Expenses_summery_report";

    public static final String URL_ADMIN_REPORT = BASE_URL + "Outlet_report/Admin_history";
    public static final String URL_PROFIT_LOSS_REPORT = BASE_URL + "Outlet_report/ProfitLoss_outlet";
    public static final String URL_GST_REPORT = BASE_URL + "Outlet_report/GST_report";
    public static final String URL_SALES_INVOICE_REPORT = BASE_URL + "Outlet_report/Sales_invoice_Report";

    public static final String URL_SALES_RETURN_REPORT = BASE_URL + "Outlet_report/Sales_return_report";
    public static final String URL_INVOICE_WISE_REPORT = BASE_URL + "Outlet_report/Invoice_wise_report";
    public static final String URL_CUSTOMER_WISE_REPORT = BASE_URL + "Outlet_report/Customer_wise_report";
    public static final String URL_PAYMENT_OPTIONWISE_REPORT = BASE_URL + "Outlet_report/Payment_optionwise_report";
    public static final String URL_DOCTOR_WISE_REPORT = BASE_URL + "Outlet_report/Doctor_wise_report";
    public static final String URL_BILL_PAYABLE_REPORT = BASE_URL + "Outlet_report/Bill_payable_report";
    public static final String URL_VIEW_CUSTOMER_HISTORY = BASE_URL + "Outlet_report/view_customer_history";
    public static final String URL_PAYMENT_REPORT = BASE_URL + "Outlet_report/req_payment_report";
    public static final String URL_OUTLET_STOCK_SUMMARY_REPORT = BASE_URL + "Outlet_report/outlet_stock_summery_report";
    public static final String URL_OUTLET_STOCK_VALUATION_REPORT = BASE_URL + "Outlet_report/outlet_stock_valuation_report";
    public static final String URL_PRODUCT_REQ_SUMMARY_REPORT = BASE_URL + "Outlet_report/product_Req_summery_report";

    public static final String URL_PRODUCT_SALES_SUMMARY_REPORT = BASE_URL + "Outlet_report/product_sales_summery_report";
    //public static final String URL_DOCTOR_WISE_REPORT = BASE_URL + "Outlet_report/Doctor_wise_report";
    public static final String URL_VIEW_DOCTOR_WISE_REPORT = BASE_URL + "Outlet_report/view_doctorwise_report";
    public static final String URL_OUTLET_LOW_STOCK_SUMMARY = BASE_URL + "Outlet_report/outlet_low_stock_summery";

    public static final String URL_MEDICINE_SCHEDULE_REPORT = BASE_URL + "Outlet_report/medicine_schedule_report";
    public static final String URL_SEARCH_INCOME_LIST_BY_DATE = BASE_URL + "search_incomeListBy_date";
    public static final String URL_FETCH_INCOME_LIST_USER = BASE_URL + "fetch_IncomeList_user";
    public static final String URL_FETCH_LOAD_DATA = BASE_URL + "fetch_loadData";
    public static final String URL_INSERT_LOADING_PAY_AMOUNT = BASE_URL + "insert_LoadingPay_amount";
    public static final String URL_INSERT_INSTALLMENT_LOADING = BASE_URL + "insert_Installment_loading";
    public static final String URL_PAYMENT_HISTORY_LOADING = BASE_URL + "Payment_history_loading";
    public static final String URL_FETCH_UNLOAD_DATA = BASE_URL + "fetch_unloadData";
    public static final String URL_INSERT_UNLOADING_PAY_AMOUNT = BASE_URL + "insert_UnloadingPay_amount";
    public static final String URL_INSERT_INSTALLMENT_UNLOADING = BASE_URL + "insert_Installment_unloading";
    public static final String URL_PAYMENT_HISTORY_UNLOADING = BASE_URL + "Payment_history_unloading";
    public static final String URL_VIEW_SALARY_SHEET = BASE_URL + "view_salarySheet";
    public static final String URL_DELETE_SALARY = BASE_URL + "delete_salary";

    public static final String URL_BALANCE_AMOUNT = BASE_URL + "balance_amount";
    public static final String URL_BALANCE_AMOUNT1 = BASE_URL + "balance_amount1";
    public static final String URL_LOADING_ADD_ROW = BASE_URL + "loading_Addrow";
    public static final String URL_FETCH_VEH_DETAILS = BASE_URL + "fetch_vehDetails";
    public static final String URL_FETCH_ADD_ROW_DATA = BASE_URL + "fetch_addRowData";
    public static final String URL_FETCH_LOADING_DATA = BASE_URL + "fetch_loading_data";

    public static final String URL_FETCH_LOADING_ADD_ROW = BASE_URL + "fetch_loading_addRow";
    public static final String URL_UNLOADING_ADD_ROW = BASE_URL + "unloading_Addrow";

    public static final String URL_DELETE_LOADING_ADD_ROW = BASE_URL + "delete_loading_Addrow";
    public static final String URL_DELETE_UNLOADING_ADD_ROW = BASE_URL + "delete_unloading_Addrow";
    public static final String URL_DRIVER_PAY_AMOUNT = BASE_URL + "driver_pay_amount";
    public static final String URL_DRIVER_PAYMENT_HISTORY = BASE_URL + "driver_payment_history";
    public static final String URL_UNIT_LIST = BASE_URL + "unit_list";

    public static final String URL_ROYALTY_AMOUNT_CALCULATION = BASE_URL + "royaltyAmount_calculation";

    public static final String URL_INCOME_VENDOR_LIST = BASE_URL + "income_vendor_list";
    public static final String URL_VIEW_INCOME_VENDOR_LIST = BASE_URL + "view_income_vendor_list";
    public static final String URL_NOTIFICATION = BASE_URL + "notification";
    public static final String URL_NOTIFICATION_REQ_NOTIFICATION_ADMIN = BASE_URL + "Notification/req_notification_admin";
    public static final String URL_NOTIFICATION_EXPIRED_ADMIN_STOCK = BASE_URL + "Notification/expired_Admin_stock";
    public static final String URL_NOTIFICATION_LOW_STOCK_ADMIN = BASE_URL + "Notification/low_stock_admin";
    public static final String URL_NOTIFICATION_OUT_OF_STOCK_ADMIN = BASE_URL + "Notification/out_of_stock_Admin";
    public static final String URL_NOTIFICATION_REC_PRODUCT_TO_OUTLET = BASE_URL + "Notification/rec_product_to_outlet";
    public static final String URL_NOTIFICATION_EXPIRED_OUTLET_STOCK = BASE_URL + "Notification/expired_outlet_stock";
    public static final String URL_NOTIFICATION_LOW_STOCK_OUTLET = BASE_URL + "Notification/low_stock_outlet";
    //public static final String URL_NOTIFICATION_LOW_STOCK_OUTLET = BASE_URL + "Notification/low_stock_outlet";

}


/*
public class AppConstantsAndUtils {

    public static final String STATUS_SUCCESS = "1";
    //public static final String STATUS_SUCCESS = "true";
    public static final Integer REQUEST_TIMEOUT = 640000; //2Min
    */
/*******************************************PREFERENCE************************************************************//*

    */
/*  SHARED PREFERENCE*//*

    public static final String USER_ID = "user_id";
    public static final String SHARED_PREFERENCE_NAME = "name";
    public static final String SHARED_PREFERENCE_NAME_BACK_UP = "back_up_token";
    public static final String PREF_HEADER_REQ_TOKEN = "header_token";
    public static final String LAST_SIGNIN_TIME = "last_signin_time";
    public static final String PREF_USER_LOGE_IN = "pref_user_loge_in";
    public static final String LAST_SIGNIN_USERID = "last_signin_userid";
    public static final String LAST_SIGNIN_PASSWORD = "last_signin_password";
    public static final String USERNAME = "username";
    public static final String USERTYPE = "user_type";
    public static final String NAME = "name";
    public static final String BRANCH_ID = "branch_Id";
    public static final String BRANCH_IDD = "branch_id";
    public static final String LOADING_ID = "loading_id";
    public static final String UNLOADING_ID = "unloading_id";
    public static final String IDD = "id";
    public static final String OUTLET_ID = "id";
    public static final String PAYMENT_ID = "payment_id";
    public static final String BILL_NO = "bill_no";
    public static final String VENDOR_NAME = "vendor_name";


    */
/***************************------------------------------------------------All URL's---------*******************************//*

    */
/*All URL's*//*

    private static final String BASE_URL = "https://faithosys.com/Admin/index.php/api/";
    private static final String IMAGE_BASE_URL = "https://asmtransport.in/Admin/assets/img/vehicleDetails_Image/";

    public static final String URL_IMAGE = IMAGE_BASE_URL;
    public static final String URL_LOGIN = BASE_URL + "Login/Login_user";
    public static final String URL_PRODUCT_LIST = BASE_URL + "Product/product_list";
    public static final String URL_FETCH_PRODUCT_LIST = BASE_URL + "Product/get_product";
    public static final String URL_UPDATE_PRODUCT = BASE_URL + "Product/update_product";

    public static final String URL_DELETE_PRODUCT = BASE_URL + "Product/delete_product";
    public static final String URL_OUTLET_LIST = BASE_URL + "Outlet/Outlet_list";
    public static final String URL_FETCH_OUTLET = BASE_URL + "Outlet/fetch_outlet";
    public static final String URL_DELETE_OUTLET = BASE_URL + "Outlet/delete_outlet";
    public static final String URL_UPDATE_OUTLET = BASE_URL + "Outlet/update_outlet";
    public static final String URL_ADD_OUTLET = BASE_URL + "Outlet/add_outlet";
    public static final String URL_ACCOUNT_LIST = BASE_URL + "Master/Account_list";
    public static final String URL_FETCH_ACCOUNT = BASE_URL + "Master/fetch_account";
    public static final String URL_SCHEDULE_LIST = BASE_URL + "Master/schedule_list";
    public static final String URL_FETCH_SCHEDULE = BASE_URL + "Master/fetch_schedule";
    public static final String URL_ADD_SCHEDULE = BASE_URL + "Master/add_schedule";
    public static final String URL_UPDATE_SCHEDULE = BASE_URL + "Master/update_schedule";
    public static final String URL_DELETE_SCHEDULE = BASE_URL + "Master/delete_schedule";
    public static final String URL_TRANSPORTER_LIST = BASE_URL + "Master/transpoter_list";
    public static final String URL_FETCH_TRANSPORTER = BASE_URL + "Master/fetch_transporter";
    public static final String URL_ADD_TRANSPORTER = BASE_URL + "Master/add_transporter";
    public static final String URL_UPDATE_TRANSPORTER = BASE_URL + "Master/update_transporter";
    public static final String URL_DELETE_TRANSPORTER = BASE_URL + "Master/delete_transporter";
    public static final String URL_MODE_LIST = BASE_URL + "Master/mode_list";
    public static final String URL_AUTO_INCREMENT_TRANSPORTER_ID = BASE_URL + "Master/auotoIncrement_transporter_id";
    public static final String URL_RACK_LIST = BASE_URL + "Master/rack_list";
    public static final String URL_FETCH_RACK = BASE_URL + "Master/fetch_rack";
    public static final String URL_ADD_RACK = BASE_URL + "Master/add_rack";
    public static final String URL_UPDATE_RACK = BASE_URL + "Master/update_rack";

    public static final String URL_DELETE_RACK = BASE_URL + "Master/delete_rack";
    public static final String URL_UNDER_GROUP_LIST = BASE_URL + "Master/under_group_list";
    public static final String URL_CRM_LIST = BASE_URL + "Master/crm_list";
    public static final String URL_FETCH_CRM = BASE_URL + "Master/fetch_crm";
    public static final String URL_ADD_CRM = BASE_URL + "Master/add_crm";
    public static final String URL_UPDATE_CRM = BASE_URL + "Master/update_crm";
    public static final String URL_DELETE_CRM = BASE_URL + "Master/delete_crm";

    public static final String URL_PURCHASE_ORDER_LIST = BASE_URL + "Purchase_order/Purchase_order_list";
    public static final String URL_FETCH_PURCHASE_ORDER = BASE_URL + "Purchase_order/fetch_purchase_order";

    public static final String URL_AUTO_INCREMENT_PURCHASE_ORDER_ID = BASE_URL + "Purchase_order/autoincrement_pur_order_id";
    public static final String URL_AUTO_INCREMENT_QUOTATION_NO = BASE_URL + "Purchase_order/auotoIncrement_quotation_no";
    public static final String URL_PURCHASE_BILL_LIST = BASE_URL + "Purchase_order/Purchase_bill_list";

    public static final String URL_FETCH_PURCHASE_BILL = BASE_URL + "Purchase_order/fetch_purchase_bill";
    public static final String URL_PAYMENT_LIST = BASE_URL + "Purchase_order/payment_list";
    public static final String URL_FETCH_PAYMENT_DATA = BASE_URL + "Purchase_order/fetch_payment_data";
    public static final String URL_PURCHASE_RETURN_LIST = BASE_URL + "Purchase_order/purchase_return_list";
    public static final String URL_FETCH_PURCHASE_RETURN_DATA = BASE_URL + "Purchase_order/fetch_purchase_return_data";
    public static final String URL_EXPENSE_LIST = BASE_URL + "Expense/expenses_list";
    public static final String URL_FETCH_EXPENSE_DATA = BASE_URL + "Expense/fetch_expenses_data";
    public static final String URL_JOURNAL_VOUCHER_LIST = BASE_URL + "Journal_voucher/journal_Voucher_list";
    public static final String URL_STOCK_LIST = BASE_URL + "Stock/stock_list";

    public static final String URL_PURCHASE_SUMMERY_REPORT = BASE_URL + "Report/purchase_summery_report";
    public static final String URL_PURCHASE_RETURN_SUMMERY = BASE_URL + "Report/purchase_Return_summery";
    public static final String URL_PURCHASE_RETURN_PRODUCT_WISE_REPORT = BASE_URL + "Report/purchase_return_productwise_report";
    public static final String URL_VENDOR_HISTORY_REPORT = BASE_URL + "Report/vendor_history_Report";
    public static final String URL_VIEW_VENDOR_HISTORY = BASE_URL + "Report/view_vendor_history";
    public static final String URL_VENDOR_STATEMENT = BASE_URL + "Report/vendor_statement";
    public static final String URL_VIEW_VENDOR_STATEMENT = BASE_URL + "Report/view_vendor_statement";
    public static final String URL_INVOICE_REPORT = BASE_URL + "Report/Invoice_wise_report";
    public static final String URL_REQUITION_SUMMARY_REPORT = BASE_URL + "Report/Requisition_summery_report";
    public static final String URL_REQUISITIOM_RETURN_SUMMARY_REPORT = BASE_URL + "Report/Requisition_Return_summery_report";
    public static final String URL_PAYMENT_MODE_REPORT = BASE_URL + "Report/Payment_mode_report";
    public static final String URL_VENDOR_WISE_REPORT = BASE_URL + "Report/Vendor_wise_report";
    public static final String URL_PURCHASE_PAYMENT_REPORT = BASE_URL + "Report/purchase_payment_report";
    public static final String URL_STOCK_SUMMARY_REPORT = BASE_URL + "Report/Stock_summery_report";
    public static final String URL_STOCK_VALUATION_REPORT = BASE_URL + "Report/Stock_valuation_report";
    public static final String URL_PRODUCT_REPORT_OUTLETWISE = BASE_URL + "Report/Product_report_outletwise";
    public static final String URL_AUTOINCREMENT_PRODUCT_ID = BASE_URL + "Product/Autoincrement_product_id";
    public static final String URL_PRODUCT_REPORT_VENDOR_WISE = BASE_URL + "Report/Product_Report_vendorwise";
    public static final String URL_LOW_STOCK_SUMMARY_REPORT = BASE_URL + "Report/Low_stock_summery_report";
    public static final String URL_DELETE_PURCHASE_BILL = BASE_URL + "Purchase_order/delete_purchase_bill";
    public static final String URL_DELETE_PURCHASE_ORDER = BASE_URL + "Purchase_order/delete_purchase_order";
    public static final String URL_DELETE_PAYMENT = BASE_URL + "Purchase_order/delete_payment";
    public static final String URL_ADD_PRODUCT1 = BASE_URL + "Product/add_product1";
    public static final String URL_ADD_PRODUCT2 = BASE_URL + "Product/add_product2";
    public static final String URL_ADD_PRODUCT3 = BASE_URL + "Product/add_product3";
    public static final String URL_UPDATE_IMAGE = BASE_URL + "Product/update_image";
    public static final String URL_CALCULATE_PUR_ORDER = BASE_URL + "Purchase_order/calculation_pur_order";
    public static final String URL_ADD_PURCHASE1 = BASE_URL + "Purchase_order/add_purchase_order1";
    public static final String URL_ADD_PURCHASE2 = BASE_URL + "Purchase_order/add_purchase_order2";
    public static final String URL_ADD_PURCHASE3 = BASE_URL + "Purchase_order/add_purchase_order3";
    public static final String URL_NOTIFICATION_REQ_NOTIFICATION_ADMIN = BASE_URL + "Notification/req_notification_admin";
    public static final String URL_NOTIFICATION_EXPIRED_ADMIN_STOCK = BASE_URL + "Notification/expired_Admin_stock";
    public static final String URL_NOTIFICATION_LOW_STOCK_ADMIN = BASE_URL + "Notification/low_stock_admin";
    public static final String URL_NOTIFICATION_OUT_OF_STOCK_ADMIN = BASE_URL + "Notification/out_of_stock_Admin";
    public static final String URL_NOTIFICATION_REC_PRODUCT_TO_OUTLET = BASE_URL + "Notification/rec_product_to_outlet";
    public static final String URL_NOTIFICATION_EXPIRED_OUTLET_STOCK = BASE_URL + "Notification/expired_outlet_stock";
    public static final String URL_NOTIFICATION_LOW_STOCK_OUTLET = BASE_URL + "Notification/low_stock_outlet";
    public static final String URL_LOW_STOCK_OUTLET = BASE_URL + "Notification/out_of_stock_outlet";
    //Outlet
    public static final String URL_REQ_LIST = BASE_URL + "Req_order/Req_list";
    public static final String URL_FETCH_REQ_DATA = BASE_URL + "Req_order/fetch_req_data";
    public static final String URL_AUTOINCREMENT_REQ_NO = BASE_URL + "Req_order/autoincrement_req_no";
    public static final String URL_CALCULATE_REQ_ORDER = BASE_URL + "Req_order/calculation_req_order";
    public static final String URL_ADD_REQ_ORDER1 = BASE_URL + "Req_order/add_req_order1";
    public static final String URL_ADD_REQ_ORDER2 = BASE_URL + "Req_order/add_req_order2";
    public static final String URL_ADD_REQ_ORDER3 = BASE_URL + "Req_order/add_req_order3";
    public static final String URL_OUTLET_REQ_LIST_ADMIN = BASE_URL + "Req_order/outlet_req_list_for_admin";
    public static final String URL_VIEW_OUTLET_REQ_ADMIN = BASE_URL + "Req_order/view_outlet_req_for_admin";
    public static final String URL_AUTOINCREMENT_INVOICE_NO = BASE_URL + "Req_order/autoincrement_invoice_no";
    public static final String URL_ADD_REQ_INVOICE1 = BASE_URL + "Req_order/add_req_invoice1";
    public static final String URL_ADD_REQ_INVOICE2 = BASE_URL + "Req_order/add_req_invoice2";
    public static final String URL_ADD_REQ_INVOICE3 = BASE_URL + "Req_order/add_req_invoice3";
    public static final String URL_REQ_PAYMENT_LIST = BASE_URL + "Req_order/req_payment_list";
    public static final String URL_FETCH_REQ_PAYMENT = BASE_URL + "Req_order/fetch_req_payment";
    public static final String URL_DELETE_REQ_PAYMENT = BASE_URL + "Req_order/delete_req_payment";
    public static final String URL_FETCH_REQ_PAY_PRODUCT_BY_INVOICE_NO = BASE_URL + "Req_order/fetch_reqPayProductByInvoice_no";
    public static final String URL_CALCULATE_BALANCE_AMOUNT = BASE_URL + "Req_order/calculate_balance_amount";
    public static final String URL_INVOICE_NO_LIST = BASE_URL + "Req_order/invoice_no_list";
    public static final String URL_ADD_REQ_PAYMENT1 = BASE_URL + "Req_order/add_req_payment1";
    public static final String URL_ADD_REQ_PAYMENT2 = BASE_URL + "Req_order/add_req_payment2";
    public static final String URL_ADD_REQ_PAYMENT3 = BASE_URL + "Req_order/add_req_payment3";
    public static final String URL_REQ_RETURN_LIST = BASE_URL + "Req_order/req_return_list";
    public static final String URL_FETCH_REQ_RETURN = BASE_URL + "Req_order/fetch_req_return";
    public static final String URL_DELETE_REQ_RETURN = BASE_URL + "Req_order/delete_req_return";
    public static final String URL_AUTOINCREMENT_DEBIT_NOTE_NO = BASE_URL + "Req_order/autoincrement_debitNoteNo";
    public static final String URL_ADD_REQ1 = BASE_URL + "Req_order/add_req_Return1";
    public static final String URL_ADD_REQ2 = BASE_URL + "Req_order/add_req_Return2";
    public static final String URL_ADD_REQ3 = BASE_URL + "Req_order/add_req_Return3";

    //reports
    public static final String URL_REQUISITION_SUMMARY = BASE_URL + "Outlet_report/Requisition_summary";
    public static final String URL_REQUISITION_RETURN_SUMMARY_REPORT = BASE_URL + "Outlet_report/Requisition_return_summery_report";
    public static final String URL_EXPENSE_SUMMARY_REPORT = BASE_URL + "Outlet_report/Expenses_summery_report";

    public static final String URL_ADMIN_REPORT = BASE_URL + "Outlet_report/Admin_history";
    public static final String URL_PROFIT_LOSS_REPORT = BASE_URL + "Outlet_report/ProfitLoss_outlet";
    public static final String URL_GST_REPORT = BASE_URL + "Outlet_report/GST_report";
    public static final String URL_SALES_INVOICE_REPORT = BASE_URL + "Outlet_report/Sales_invoice_Report";

    public static final String URL_SALES_RETURN_REPORT = BASE_URL + "Outlet_report/Sales_return_report";
    public static final String URL_INVOICE_WISE_REPORT = BASE_URL + "Outlet_report/Invoice_wise_report";
    public static final String URL_CUSTOMER_WISE_REPORT = BASE_URL + "Outlet_report/Customer_wise_report";
    public static final String URL_PAYMENT_OPTIONWISE_REPORT = BASE_URL + "Outlet_report/Payment_optionwise_report";
    public static final String URL_DOCTOR_WISE_REPORT = BASE_URL + "Outlet_report/Doctor_wise_report";
    public static final String URL_BILL_PAYABLE_REPORT = BASE_URL + "Outlet_report/Bill_payable_report";
    public static final String URL_VIEW_CUSTOMER_HISTORY = BASE_URL + "Outlet_report/view_customer_history";
    public static final String URL_PAYMENT_REPORT = BASE_URL + "Outlet_report/req_payment_report";
    public static final String URL_OUTLET_STOCK_SUMMARY_REPORT = BASE_URL + "Outlet_report/outlet_stock_summery_report";
    public static final String URL_OUTLET_STOCK_VALUATION_REPORT = BASE_URL + "Outlet_report/outlet_stock_valuation_report";
    public static final String URL_PRODUCT_REQ_SUMMARY_REPORT = BASE_URL + "Outlet_report/product_Req_summery_report";

    public static final String URL_PRODUCT_SALES_SUMMARY_REPORT = BASE_URL + "Outlet_report/product_sales_summery_report";
    //public static final String URL_DOCTOR_WISE_REPORT = BASE_URL + "Outlet_report/Doctor_wise_report";
    public static final String URL_VIEW_DOCTOR_WISE_REPORT = BASE_URL + "Outlet_report/view_doctorwise_report";
    public static final String URL_OUTLET_LOW_STOCK_SUMMARY = BASE_URL + "Outlet_report/outlet_low_stock_summery";

    public static final String URL_MEDICINE_SCHEDULE_REPORT = BASE_URL + "Outlet_report/medicine_schedule_report";
    public static final String URL_SEARCH_INCOME_LIST_BY_DATE = BASE_URL + "search_incomeListBy_date";
    public static final String URL_FETCH_INCOME_LIST_USER = BASE_URL + "fetch_IncomeList_user";
    public static final String URL_FETCH_LOAD_DATA = BASE_URL + "fetch_loadData";
    public static final String URL_INSERT_LOADING_PAY_AMOUNT = BASE_URL + "insert_LoadingPay_amount";
    public static final String URL_INSERT_INSTALLMENT_LOADING = BASE_URL + "insert_Installment_loading";
    public static final String URL_PAYMENT_HISTORY_LOADING = BASE_URL + "Payment_history_loading";
    public static final String URL_FETCH_UNLOAD_DATA = BASE_URL + "fetch_unloadData";
    public static final String URL_INSERT_UNLOADING_PAY_AMOUNT = BASE_URL + "insert_UnloadingPay_amount";
    public static final String URL_INSERT_INSTALLMENT_UNLOADING = BASE_URL + "insert_Installment_unloading";
    public static final String URL_PAYMENT_HISTORY_UNLOADING = BASE_URL + "Payment_history_unloading";
    public static final String URL_VIEW_SALARY_SHEET = BASE_URL + "view_salarySheet";
    public static final String URL_DELETE_SALARY = BASE_URL + "delete_salary";

    public static final String URL_BALANCE_AMOUNT = BASE_URL + "balance_amount";
    public static final String URL_BALANCE_AMOUNT1 = BASE_URL + "balance_amount1";
    public static final String URL_LOADING_ADD_ROW = BASE_URL + "loading_Addrow";
    public static final String URL_FETCH_VEH_DETAILS = BASE_URL + "fetch_vehDetails";
    public static final String URL_FETCH_ADD_ROW_DATA = BASE_URL + "fetch_addRowData";
    public static final String URL_FETCH_LOADING_DATA = BASE_URL + "fetch_loading_data";

    public static final String URL_FETCH_LOADING_ADD_ROW = BASE_URL + "fetch_loading_addRow";
    public static final String URL_UNLOADING_ADD_ROW = BASE_URL + "unloading_Addrow";

    public static final String URL_DELETE_LOADING_ADD_ROW = BASE_URL + "delete_loading_Addrow";
    public static final String URL_DELETE_UNLOADING_ADD_ROW = BASE_URL + "delete_unloading_Addrow";
    public static final String URL_DRIVER_PAY_AMOUNT = BASE_URL + "driver_pay_amount";
    public static final String URL_DRIVER_PAYMENT_HISTORY = BASE_URL + "driver_payment_history";
    public static final String URL_UNIT_LIST = BASE_URL + "unit_list";

    public static final String URL_ROYALTY_AMOUNT_CALCULATION = BASE_URL + "royaltyAmount_calculation";

    public static final String URL_INCOME_VENDOR_LIST = BASE_URL + "income_vendor_list";
    public static final String URL_VIEW_INCOME_VENDOR_LIST = BASE_URL + "view_income_vendor_list";
    public static final String URL_NOTIFICATION = BASE_URL + "notification";


}
*/
