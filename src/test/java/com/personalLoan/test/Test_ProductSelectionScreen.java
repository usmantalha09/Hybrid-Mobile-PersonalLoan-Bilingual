package com.personalLoan.test;

import org.testng.annotations.Test;

import com.personalLoan.base.BaseClass;
import com.personalLoan.errorCollectors.ErrorCollector;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.pages.BankingPreferencesPage;
import com.personalLoan.pages.BusinessProductsPage;
import com.personalLoan.pages.LandingPage;


public class Test_ProductSelectionScreen extends BaseClass {

	@Test(priority = 6, groups = {"Product Selection"})
	public void VerifyProductServicesOnPage() throws InterruptedException {

		initReport();
		initConfiguration();

		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_006");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Credit Card'</b> Product Service is Displaying.");
		ErrorCollector.verifyTrue(businessProductsPage.verifyCreditCardProductButtonIsDisplaying(), "<b>'Credit Card'</b> Product Service is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Personal Loan'</b> Product Service is Displaying.");
		ErrorCollector.verifyTrue(businessProductsPage.verifyPersonalLoanProductButtonIsDisplaying(), "<b>'Personal Loan'</b> Product Service is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Bank Account'</b> Product Service is Displaying.");
		ErrorCollector.verifyTrue(businessProductsPage.verifyBankAccountProductButtonIsDisplaying(), "<b>'Bank Account'</b> Product Service is Displaying.");
		
		
	}
	
	@Test(priority = 6, groups = {"Product Selection", "Arabic"})
	public void VerifyProductServicesOnPage_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();

		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_006");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'بطاقة ائتمان'</b> Product Service is Displaying.");
		ErrorCollector.verifyTrue(businessProductsPage.verifyCreditCardProductButtonIsDisplaying(), "<b>'بطاقة ائتمان'</b> Product Service is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'قرض شخصي'</b> Product Service is Displaying.");
		ErrorCollector.verifyTrue(businessProductsPage.verifyPersonalLoanProductButtonIsDisplaying(), "<b>'قرض شخصي'</b> Product Service is Displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'حساب بنكي'</b> Product Service is Displaying.");
		ErrorCollector.verifyTrue(businessProductsPage.verifyBankAccountProductButtonIsDisplaying(), "<b>'حساب بنكي'</b> Product Service is Displaying.");
		
		
	}
	
	@Test(priority = 7, groups = {"Product Selection"})
	public void VerifyPersonalLoanIsOnSecondPlace() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage() ;
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_007");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Second Place'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User Navigated With Personal Loan on <b>'Banking Preferences'</b> Screen.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyBankingPreferencesPageTitleIsDisplaying(), "Verified User Navigated With Personal Loan on <b>'Banking Preferences'</b> Screen.");
		
	}
	
	@Test(priority = 8, groups = {"Product Selection"})
	public void VerifyUserNavigatedToBankingPreferences_ClickingPersonalLoan() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_008");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Banking Preferences'</b> Page is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyBankingPreferencesPageTitleIsDisplaying(), "Verified <b>'Banking Preferences'</b> Page is Displaying.");
		
	}
	
	@Test(priority = 11, groups = {"Product Selection"})
	public void VerifyUserNavigatedBackToLandingPage_ClickOnBackArrow() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_011");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Left Bank'</b> Icon ");
		businessProductsPage.clickOnLeftBackIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Welcome To Rakbank'</b> screen is displaying.");
		ErrorCollector.verifyTrue(landingPage.verifyWelcomeToRakBankDisplaying(), "verified: <b>'Welcome To Rakbank'</b> screen is displaying.");
	
	}
	
	@Test(priority = 7, groups = {"Product Selection", "Arabic"})
	public void VerifyPersonalLoanIsOnSecondPlace_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage() ;
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_007");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'المكان الثاني'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User Navigated With Personal Loan on <b>'ما الخدمات المصرفية التي تفضلها؟'</b> Title.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyBankingPreferencesPageTitleIsDisplaying(), "Verified User Navigated With Personal Loan on <b>'ما الخدمات المصرفية التي تفضلها؟'</b> Title.");
		
	}
	
	@Test(priority = 8, groups = {"Product Selection", "Arabic"})
	public void VerifyUserNavigatedToBankingPreferences_ClickingPersonalLoan_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_008");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'ما الخدمات المصرفية التي تفضلها؟'</b> Title is Displaying.");
		ErrorCollector.verifyTrue(bankingPreferencesPage.verifyBankingPreferencesPageTitleIsDisplaying(), "Verified <b>'ما الخدمات المصرفية التي تفضلها؟'</b> Title is Displaying.");
		
	}
	
	@Test(priority = 11, groups = {"Product Selection", "Arabic"})
	public void VerifyUserNavigatedBackToLandingPage_ClickOnBackArrow_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_011");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'الضفة اليسرى'</b> Icon ");
		businessProductsPage.clickOnLeftBackIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'مرحباً بكم في راك بنك'</b> is displaying.");
		ErrorCollector.verifyTrue(landingPage.verifyWelcomeToRakBankInArabicDisplaying(), "verified: <b>'مرحباً بكم في راك بنك'</b> screen is displaying.");
	
	}
	

	
}
