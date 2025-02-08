package com.personalLoan.test;

import org.testng.annotations.Test;

import com.personalLoan.base.BaseClass;
import com.personalLoan.errorCollectors.ErrorCollector;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.pages.BankingPreferencesPage;
import com.personalLoan.pages.BusinessProductsPage;
import com.personalLoan.pages.LandingPage;


public class Test_BankingPreferencesScreen extends BaseClass {

	
	@Test(priority = 1, groups = {"Banking Preferences"})
	public void VerifyBankingPreferenceOptions() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_001");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Banking Preferences'</b> Page is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyBankingPreferencesPageTitleIsDisplaying(), "Verified <b>'Banking Preferences'</b> Page is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Rakbank Islamic'</b> Button is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyRakbankIslamicButtonIsDisplaying(), "Verified <b>'Rakbank Islamic'</b> Button is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Rakbank'</b> Button is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyRakbankButtonIsDisplaying(), "Verified <b>'Rakbank'</b> Button is Displaying.");
		
	}
	
	@Test(priority = 1, groups = {"Banking Preferences", "Arabic"})
	public void VerifyBankingPreferenceOptions_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_001");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'ما الخدمات المصرفية التي تفضلها؟'</b> Title is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyBankingPreferencesPageTitleIsDisplaying(), "Verified <b>'ما الخدمات المصرفية التي تفضلها؟'</b> Title is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'راك بنك الإسلامي'</b> Button is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyRakbankIslamicButtonIsDisplaying(), "Verified <b>'راك بنك الإسلامي'</b> Button is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'راك بنك'</b> Button is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyRakbankButtonIsDisplaying(), "Verified <b>'راك بنك'</b> Button is Displaying.");
		
	}
}
