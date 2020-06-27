package om.sri.service.impl;

import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

@Service
public class PropertyFileUtilService {
	ResourceBundle bundle = ResourceBundle.getBundle("messages");

	public String getLogoutMessage() {
		return bundle.getString("logout");
	}

	public String getLoginFailureMessage() {
		return bundle.getString("loginFailure");
	}

	public String getInvalidUserMessage() {
		return bundle.getString("invalidUser");
	}

	public String getInvalidPasswordMessage() {
		return bundle.getString("invalidPassword");
	}

	public String getUserSaveSuccessMessage() {
		return bundle.getString("usersavesuccess");
	}

	public Object getUserSaveFailureMessage() {
		return bundle.getString("usersavefailure");
	}

	public String getUserUpdateSuccessMessage() {
		return bundle.getString("userupdatesuccess");
	}

	public String getUserUpdateFailureMessage() {
		return bundle.getString("userupdatefailure");
	}

	public String getChangePasswordSuccessMessage() {
		return bundle.getString("changepasswordsuccess");
	}

	public String getChangePasswordFailureMessage() {
		return bundle.getString("changepasswordfailure");
	}

	public String getUserEnableMessage() {
		return bundle.getString("userenable");
	}

	public String getDepositorSettlementSuccessMsg() {
		return bundle.getString("depositorsettlementsuccess");
	}

	public String getDepositorSettlementFailureMsg() {
		return bundle.getString("depositorsettlementfailure");
	}

	public Object getDepositorCreateSuccessMsg() {
		return bundle.getString("depositorceatesuccess");
	}

	public String getDepositorCreateFailureMsg() {
		return bundle.getString("depositorceatefailure");
	}

	public String getDepositorCreditSuccessMsg() {
		return bundle.getString("depositorcreditsuccess");
	}

	public String getDepositorCreditFailureMsg() {
		return bundle.getString("depositorcreditfailure");
	}

	public String getDepositorDebitSuccessMsg() {
		return bundle.getString("depositordebitsuccess");
	}

	public String getDepositorDebitFailureMsg() {
		return bundle.getString("depositordebitfailure");
	}

	public String getDepositorCREInfo() {
		return bundle.getString("depositor_cre_scroll_info");
	}

	public String getDepositorDEBInfo() {
		return bundle.getString("depositor_deb_scroll_info");
	}

	public String getDepositorSETDEBInfo() {
		return bundle.getString("depositor_set_deb_scroll_info");
	}

	public String getDepositorSETDEBinterestInfo() {
		return bundle.getString("depositor_set_deb_int_scroll_info");
	}

	public String getDepositorSETCREInfo() {
		return bundle.getString("depositor_set_cre_scroll_info");
	}

	public String getDepositorSETCREInterestInfo() {
		return bundle.getString("depositor_set_cre_scroll_int_info");
	}

	public String getCustomerFailureMsg() {
		return bundle.getString("customer_save_failure");
	}

	public String getCustomerSuccessMsg() {
		return bundle.getString("customer_save_success");
	}

	public String getCustomerUpdateSuccessMsg() {
		return bundle.getString("customer_update_success");
	}

	public String getCustomerUpdateFailureMsg() {
		return bundle.getString("customer_update_failure");
	}

	public String getSuritySaveSuccessMsg() {
		return bundle.getString("surity_save_success");
	}

	public String getSuritySaveFailureMsg() {
		return bundle.getString("surity_save_failure");
	}

	public String getSurityUpdateSuccessMsg() {
		return bundle.getString("surity_update_success");
	}

	public String getSurityUpdateFailureMsg() {
		return bundle.getString("surity_update_failure");
	}

	public String getSaveOutSuccessMsg() {
		return bundle.getString("save_out_success");
	}

	public String getSaveOutFailureMsg() {
		return bundle.getString("save_out_failure");
	}

	public String getCustomerOutDebitInfo() {
		return bundle.getString("customer_out_debit_info");
	}

	public String getCustomerOutCreditInfo() {
		return bundle.getString("customer_out_credit_info");
	}

	public String getCustomerOutCreditInterestInfo() {
		return bundle.getString("customer_out_credit_interest_info");
	}

	public String getOutPaymentSuccessMsg() {
		return bundle.getString("out_payment_success");
	}

	public String getOutPaymentFailureMsg() {
		return bundle.getString("out_payment_failure");
	}

	public String getOutPaymentWithNewAmountSuccessMsg() {
		return bundle.getString("out_payment_with_new_amount_success");
	}

	public String getOutPaymentWithNewAmountFailureMsg() {
		return bundle.getString("out_payment_with_new_amount_failure");
	}

	public String getOutSettlementSuccessMsg() {
		return bundle.getString("out_settlement_success");
	}

	public String getOutSettlementFailureMsg() {
		return bundle.getString("out_settlement_failure");
	}

	public String getSaveFinanceSuccessMsg() {
		return bundle.getString("customer_finance_save_success");
	}

	public String getSaveFinanceFailureMsg() {
		return bundle.getString("customer_finance_save_failure");
	}

	public String getCustomerInstallmentfullCredit() {
		return bundle.getString("customer_installment_full_credit");
	}

	public String getCustomerInstallmentsfullCredit() {
		return bundle.getString("customer_installments_full_credit");
	}

	public String getCustomerInstallmentpartCredit() {
		return bundle.getString("customer_installment_part_credit");
	}

	public String getCustomerInstallmentspartCredit() {
		return bundle.getString("customer_installments_part_credit");
	}

	public String getCustomerInstallmentInterestfullCredit() {
		return bundle.getString("customer_installment_intrest_full_credit");
	}

	public String getCustomerInstallmentsInterestfullCredit() {
		return bundle.getString("customer_installments_intrest_full_credit");
	}

	public String getCustomerInstallmentInterestpartCredit() {
		return bundle.getString("customer_installment_intrest_part_credit");
	}

	public String getCustomerInstallmentsInterestpartCredit() {
		return bundle.getString("customer_installments_intrest_part_credit");
	}

	public String getCustomerInstallmentSucessMsg() {
		return bundle.getString("customer_installments_success");
	}

	public String getCustomerInstallmentFailureMsg() {
		return bundle.getString("customer_installments_failure");
	}

	public String getFinanceCreateWithDCInfo() {
		return bundle.getString("finance_create_with_document_charges");
	}

	public String getFinanceCreateInfo() {
		return bundle.getString("finance_create");
	}

	public String getDocumentationChargesInfo() {
		return bundle.getString("finance_documentation_charges_paid");
	}

	public String getDocumentationChargesPartPaidInfo() {
		return bundle.getString("finance_documentation_charges_part_paid");
	}

	public String getCustomerInstallmentSettlementCredit() {
		return bundle.getString("customer_installments_settlement_credit");
	}

	public String getCustomerInstallmentSettlementIntrestCredit() {
		return bundle.getString("customer_installments_settlement_credit");
	}

	public String getCustomerInstallmentSettlmentFailureMsg() {
		return bundle.getString("customer_installments__settlment_failure");
	}

	public String getDocumentationPaymentSuccessMsg() {
		return bundle.getString("customer_documentation_payment_success");
	}

	public String getDocumentationPaymentFailureMsg() {
		return bundle.getString("customer_documentation_payment_failure");
	}

	public String getCustomerDocumentationPaymentInfo() {
		return bundle.getString("customer_documentation_payment_credit_info");
	}

	public String getSaveLineInfoSuccessMsg() {
		return bundle.getString("save_line_info_success");
	}

	public String getSaveLineInfoFailureMsg() {
		return bundle.getString("save_line_info_failure");
	}

	public String getUpdateLineInfoSuccessMsg() {
		return bundle.getString("update_line_info_success");
	}

	public String getUpdateLineInfoFailureMsg() {
		return bundle.getString("update_line_info_failure");
	}

	public String getRouteSaveSuccessMsg() {
		return bundle.getString("route_save_success");
	}

	public String getRouteSaveFailureMsg() {
		return bundle.getString("route_save_failure");
	}

	public String getRouteUpdateSuccessMsg() {
		return bundle.getString("route_update_success");
	}

	public String getRouteUpdateFailureMsg() {
		return bundle.getString("route_update_failure");
	}

	public String getExpensesCategorySuccessMsg() {
		return bundle.getString("expenses_category_save_success");
	}

	public String getExpensesCategoryFailureMsg() {
		return bundle.getString("expenses_category_save_failure");
	}

	public String getOfficeExpensesSuccessMsg() {
		return bundle.getString("office_expenses_save_success");
	}

	public String getOfficeExpensesFailureMsg() {
		return bundle.getString("office_expenses_save_failure");
	}

	public String getCustomerDocumentationInterestPaymentInfo() {
		return bundle.getString("customer_documentation_interest_payment_credit_info");
	}

	public String getBankCreditSuccessMsg() {
		return bundle.getString("office_bank_credit_save_success");
	}

	public String getBankCreditFailureMsg() {
		return bundle.getString("office_bank_credit_save_failure");
	}

	public String getCustomerInstallmentSettlementHPCredit() {
		return bundle.getString("customer_installments_hp_settlement_credit");
	}

	public String getBankDebitSuccessMsg() {
		return bundle.getString("office_bank_debit_save_success");
	}

	public String getBankDebitFailureMsg() {
		return bundle.getString("office_bank_debit_save_failure");
	}

	public String getUserCreditSuccessMsg() {
		return bundle.getString("user_credit_save_success");
	}

	public String getUserCreditFailureMsg() {
		return bundle.getString("user_credit_save_failure");
	}

	public String getUserDebitSuccessMsg() {
		return bundle.getString("user_debit_save_success");
	}

	public String getUserDebitFailureMsg() {
		return bundle.getString("user_debit_save_failure");
	}

	public String getUpdateDocumentSuccessMsg() {
		return bundle.getString("update_doc_success");
	}

	public String getUpdateDocFailureMsg() {
		return bundle.getString("update_doc_failure");
	}

	public String getSaveSeizeSuccessMsg() {
		return bundle.getString("save_seized_success_message");
	}

	public String getSaveSeizeFailureMsg() {
		return bundle.getString("save_seized_failure_message");
	}

	public String getCancelSeizeSuccessMsg() {
		return bundle.getString("cancel_seized_success_message");
	}

	public String getCancelSeizeFailureMsg() {
		return bundle.getString("cancel_seized_failure_message");
	}

	public String getOutSaveInfo() {
		return bundle.getString("out_save_info");
	}

	public String getOutPaymentInfo() {
		return bundle.getString("out_payment_info");
	}

	public String getAuthenticationFailureMessage() {
		return bundle.getString("get_authentication_failure_message");
	}

	public String getFinanceAlreadyPaidException() {
		return bundle.getString("finance_already_paid_exception");
	}

	public String getInstallmentAlreadyPaidException() {
		return bundle.getString("installment_already_paid_exception");
	}

	public String getOtherPaymentSuccessMsg() {
		return bundle.getString("other_payment_success_message");
	}

	public String getOtherPaymentFailureMsg() {
		return bundle.getString("other_payment_failure_message");
	}

	public String getOtherPaymentDebitSuccessMsg() {
		return bundle.getString("other_payment_debit_success_message");
	}

	public String getOtherPaymentDebitFailureMsg() {
		return bundle.getString("other_payment_debit_failure_message");
	}

	public String getPurchaseSuccessMsg() {
		return bundle.getString("purchase_save_success_message");
	}

	public String getPurchaseFailureMsg() {
		return bundle.getString("purchase_save_failure_message");
	}

	public String getSellSuccessMsg() {
		return bundle.getString("purchase_sell_save_success_message");
	}

	public String getSellFailureMsg() {
		return bundle.getString("purchase_sell_failure_message");
	}

	public String getMaintenanceSuccessMsg() {
		return bundle.getString("maintenance_save_success_message");
	}

	public String getMaintenanceFailureMsg() {
		return bundle.getString("maintenance_save_failure_message");
	}

	public String getOutPaymentException() {
		return bundle.getString("out_already_paid_exception");
	}

	public String getAddVillageSuccessMsg() {
		return bundle.getString("add_village_success_message");
	}

	public String getAddVillageFailureMsg() {
		return bundle.getString("add_village_failure_message");
	}

	public String getPaymentCategorySaveSuccessMsg() {
		return bundle.getString("payment_category_save_success_message");
	}

	public String getPaymentCategorySaveFailureMsg() {
		return bundle.getString("payment_category_save_failure_message");
	}

}