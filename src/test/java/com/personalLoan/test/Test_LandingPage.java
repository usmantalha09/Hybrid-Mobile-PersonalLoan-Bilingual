package com.personalLoan.test;


import org.testng.annotations.Test;

import com.personalLoan.base.BaseClass;
import com.personalLoan.errorCollectors.ErrorCollector;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.pages.LandingPage;
import com.personalLoan.pages.ProductSelectionPage;


public class Test_LandingPage extends BaseClass {

	@Test(priority = 1, groups = { "LandingPage"})
	public void VerifyBAUScreenAfterClickinApplyForProduct() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage = new LandingPage();
		ProductSelectionPage productSelectionPage = new ProductSelectionPage();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'What are you interested in?'</b> title is Displaying.");
		ErrorCollector.verifyTrue(productSelectionPage.verifyProductSelectionPageTitleIsDisplaying(), "Verified <b>'What are you interested in?'</b> title is Displaying.");
		
	}
	
	@Test(priority = 1, groups = { "LandingPage", "Arabic"})
	public void VerifyBAUScreenAfterClickinApplyForProduct_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage = new LandingPage();
		ProductSelectionPage productSelectionPage = new ProductSelectionPage();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'What are you interested in?'</b> title is Displaying.");
		ErrorCollector.verifyTrue(productSelectionPage.verifyProductSelectionPageTitleIsDisplaying(), "Verified <b>'What are you interested in?'</b> title is Displaying.");
		
	}

	@Test(priority = 1, groups = {"LandingPage"})
	public void VerifyUserCanChangelanguage_EnglishToArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();

		int step = 0;
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_012");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Arabic Lang'</b> Icon ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'مرحباً بكم في راك بنك'</b> is displaying.");
		ErrorCollector.verifyTrue(landingPage.verifyWelcomeToRakBankInArabicDisplaying(), "verified: <b>'مرحباً بكم في راك بنك'</b> screen is displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'التقدم بطلب للحصول على منتج'</b> button is displaying.");
		ErrorCollector.verifyTrue(landingPage.verifyApplyForProductInArabicButtonIsDisplaying(), "verified: <b>'التقدم بطلب للحصول على منتج'</b> button is displaying.");
		ExtentListeners.attachScreenShot("Arabic Screen");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'ENG Lang'</b> Icon ");
		landingPage.clickOnToEnglishLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Welcome to Rakbank'</b> is displaying.");
		ErrorCollector.verifyTrue(landingPage.verifyWelcomeToRakBankDisplaying(), "verified: <b>'Welcome to Rakbank'</b> screen is displaying.");

	}
}
