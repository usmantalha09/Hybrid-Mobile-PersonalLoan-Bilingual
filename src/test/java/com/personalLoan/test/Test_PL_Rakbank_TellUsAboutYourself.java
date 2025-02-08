package com.personalLoan.test;

import org.testng.annotations.Test;

import com.personalLoan.base.BaseClass;
import com.personalLoan.errorCollectors.ErrorCollector;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.pages.BankingPreferencesPage;
import com.personalLoan.pages.BusinessProductsPage;
import com.personalLoan.pages.LandingPage;
import com.personalLoan.pages.LetsGoPage;
import com.personalLoan.pages.OtpPage;
import com.personalLoan.pages.TellUsAboutYourselfPage;


public class Test_PL_Rakbank_TellUsAboutYourself extends BaseClass {
	
	@Test(priority = 13, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_DisabledContinueButtonWithEmptyFields() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_013");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();		
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Continue'</b> button is disabled.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyContinueButtonIsDisabled(), "Verified <b>'Continue'</b> button is disabled.");
		

	}
		
	@Test(priority = 1, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_TellUsAboutYourselfScreen() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_001");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Tell us about yourself'</b> page is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyTellUsPageIsDisplaying(), "Verified <b>'Tell us about yourself'</b> page is displaying.");
		
	}

	@Test(priority = 2, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_UserCanAbleToEnterFullNameAsPerValidation() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage= new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		
		String fullName = "Muhammad Usman Talha";

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_002");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Full Name: '</b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		

	}

	@Test(priority = 9, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_InlineErrorForInvalidEmail() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage= new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String fullName = "AutomationMari";
		String invalidEmail = "hgmail.";
		String mobileNumber ="52"+generateRandomNumberWithGivenNumberOfDigits(10);

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_009");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Full Name: '</b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Mobile Number: '</b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Invalid Email: '</b>"+invalidEmail);
		tellUsAboutYourselfPage.enterEmailAddress(invalidEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying");
		

	}
	
	@Test(priority = 10, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_ValidEmailIsAcceptableOnly() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String fullName = "AutomationMari";
		String specialCharacterEmail = "!@#$%^";
		String lowercaseLettersEmail = "qwertyuiop";
		String uppercaseLettersEmail = "QWERTYUIO";
		String numbersEmail = "12345678900";
		String alphaNumericsEmail = "qwerty123456";
		String email = "h@gmail.com";
		String mobileNumber ="52"+generateRandomNumberWithGivenNumberOfDigits(10);

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_010");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Full Name: '</b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Mobile Number: '</b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> Email With Special Characters Only: '</b>"+specialCharacterEmail);
		tellUsAboutYourselfPage.enterEmailAddress(specialCharacterEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> Email With Lowercase Letters Only: '</b>"+lowercaseLettersEmail);
		tellUsAboutYourselfPage.enterEmailAddress(lowercaseLettersEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> Email With Uppercase Letters Only: '</b>"+uppercaseLettersEmail);
		tellUsAboutYourselfPage.enterEmailAddress(uppercaseLettersEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> Email With Numbers Only: '</b>"+numbersEmail);
		tellUsAboutYourselfPage.enterEmailAddress(numbersEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> Email With Alpha Numerics Only: '</b>"+alphaNumericsEmail);
		tellUsAboutYourselfPage.enterEmailAddress(alphaNumericsEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'Please enter a valid email address'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> Valid Email : '</b>"+email);
		tellUsAboutYourselfPage.enterEmailAddress(email);		

	}

	@Test(priority = 9, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_StartOverJourneyForExistingUser() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String fullName = "AutomationMari";
		String mobileNumber = "524691837";

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_009");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Full Name: '</b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Mobile Number: '</b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Continue with previous application?'</b> Popup is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyStartOverJourneyPopupIsDisplaying(), "Verified <b>'Continue with previous application?'</b> Popup is displaying.");
		

	}

	@Test(priority = 23, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_EnterDetailsAndProceed_TellUsAboutYourselfScreen() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		String fullName = "AutomationMari";
		String mobileNumber ="52"+generateRandomNumberWithGivenNumberOfDigits(10);
		String email = "hello@gmail.com";
		String employerName = "Other";
		String salary = "10000";

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_023");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Full Name: '</b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Mobile Number: '</b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Email: '</b>"+email);
		tellUsAboutYourselfPage.enterEmailAddress(email);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'nationality'</b> as <b>'Expat'</b>");
		tellUsAboutYourselfPage.selectExpatNationality();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Employment Status'</b> as <b>'Salaried'</b>");
		tellUsAboutYourselfPage.selectExpatSalariedEmploymentStatus();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Employer'</b> as <b>'"+employerName+"'</b>");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'Salary: '</b>"+salary);
		tellUsAboutYourselfPage.enterSalary(salary);
		ExtentListeners.attachScreenShot("Tell Us About Yourself Details Entered");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User Proceed To <b>'Enter your OTP'</b> Screen.");
		ErrorCollector.verifyTrue(otpPage.verifyOtpPageTitleIsDisplaying(), "Verified User Proceed To <b>'Enter your OTP'</b> Screen.");
		

	}
	
	@Test(priority = 2, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_NameAndNumberField() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_02");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Full Name'</b> field is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyFullNameFieldIsDisplaying(), "Verified <b>'Full Name'</b> field is displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Mobile Number'</b> field is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyMobileNumberFieldIsDisplaying(), "Verified <b>'Mobile Number'</b> field is displaying.");
		

	}
	
	@Test(priority = 3, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_FullNameShouldNotBeBlank() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_003");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Error Message'</b> is displaying with blank name field.");
		tellUsAboutYourselfPage.clickOnFullNameInput();
		tellUsAboutYourselfPage.clickOnMobileNumberInput();
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyBlankFullNameFieldErrorMessageIsDisplaying(), "Verified <b>'Error Message'</b> is displaying with blank name field.");

	}
	
	@Test(priority = 4, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_FullNameValidations() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_004");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Error Message'</b> is displaying with blank name field.");
		tellUsAboutYourselfPage.clickOnFullNameInput();
		tellUsAboutYourselfPage.clickOnMobileNumberInput();
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyBlankFullNameFieldErrorMessageIsDisplaying(), "Verified <b>'Error Message'</b> is displaying with blank name field.");

	}
	
	@Test(priority = 6, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_MobileNumberShouldNotBeBlank() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_006");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Error Message'</b> is displaying with blank mobile field.");
		tellUsAboutYourselfPage.clickOnMobileNumberInput();
		tellUsAboutYourselfPage.clickOnFullNameInput();
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyBlankMobileNumberFieldErrorMessageIsDisplaying(), "Verified <b>'Error Message'</b> is displaying with blank mobile field.");

	}
	
	@Test(priority = 7, groups = {"Tell Us About Yourself"})
	public void Verify_PL_RakBank_MobileNumberLenghtAndCodeValidations() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String name = "Mari";
		String mobileWithFiveZero = "50"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveTwo = "52"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveFour = "54"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveFive = "55"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveSix = "56"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveEight = "58"+generateRandomNumberWithGivenNumberOfDigits(7);


		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_007");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>"+name);
		tellUsAboutYourselfPage.enterFullName(name);
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with Five Zero: <b>"+mobileWithFiveZero);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveZero);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '50'</b> from "+mobileWithFiveZero);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '50'</b> from "+mobileWithFiveZero);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with Five Two: <b>"+mobileWithFiveTwo);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveTwo);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '52'</b> from "+mobileWithFiveTwo);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '52'</b> from "+mobileWithFiveTwo);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with Five Four: <b>"+mobileWithFiveFour);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveFour);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '54'</b> from "+mobileWithFiveFour);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '54'</b> from "+mobileWithFiveFour);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with 55: <b>"+mobileWithFiveFive);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveFive);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '55'</b> from "+mobileWithFiveFive);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '55'</b> from "+mobileWithFiveFive);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with 56: <b>"+mobileWithFiveSix);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveSix);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '56'</b> from "+mobileWithFiveSix);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '56'</b> from "+mobileWithFiveSix);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with 58: <b>"+mobileWithFiveEight);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveEight);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '58'</b> from "+mobileWithFiveEight);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '58'</b> from "+mobileWithFiveEight);
		
		
	}


	
	//Arabic
	
	@Test(priority = 13, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_DisabledContinueButtonWithEmptyFields_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_013");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();		
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'استمرار'</b> button is disabled.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyContinueButtonIsDisabled(), "Verified <b>'استمرار'</b> button is disabled.");
		

	}
	
	@Test(priority = 1, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_TellUsAboutYourselfScreen_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_001");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'أخبرنا عن نفسك'</b> Title is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyTellUsPageIsDisplaying(), "Verified <b>'أخبرنا عن نفسك'</b> Title is displaying.");
		
	}
	
	@Test(priority = 2, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_UserCanAbleToEnterFullNameAsPerValidation_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage= new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		
		String fullName = "Muhammad Usman Talha";

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_002");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		

	}
	
	@Test(priority = 9, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_InlineErrorForInvalidEmail_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		
		LandingPage landingPage= new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String fullName = "AutomationMari";
		String invalidEmail = "hgmail.";
		String mobileNumber ="52"+generateRandomNumberWithGivenNumberOfDigits(10);

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_009");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b>'بريد إلكتروني خاطئ: '</b>"+invalidEmail);
		tellUsAboutYourselfPage.enterEmailAddress(invalidEmail);
		tellUsAboutYourselfPage.clickOnFullNameInput();
		scrollToText("استمرار");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying");
		

	}

	@Test(priority = 10, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_ValidEmailIsAcceptableOnly_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String fullName = "AutomationMari";
		String specialCharacterEmail = "!@#$%^";
		String lowercaseLettersEmail = "qwertyuiop";
		String uppercaseLettersEmail = "QWERTYUIO";
		String numbersEmail = "12345678900";
		String alphaNumericsEmail = "qwerty123456";
		String email = "h@gmail.com";
		String mobileNumber ="52"+generateRandomNumberWithGivenNumberOfDigits(10);

		int step = 0;
		
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_010");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> البريد الإلكتروني بأحرف خاصة فقط: '</b>"+specialCharacterEmail);
		tellUsAboutYourselfPage.enterEmailAddress(specialCharacterEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> البريد الإلكتروني بأحرف صغيرة فقط: '</b>"+lowercaseLettersEmail);
		tellUsAboutYourselfPage.enterEmailAddress(lowercaseLettersEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> البريد الإلكتروني بأحرف كبيرة فقط: '</b>"+uppercaseLettersEmail);
		tellUsAboutYourselfPage.enterEmailAddress(uppercaseLettersEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> البريد الإلكتروني بالأرقام فقط: '</b>"+numbersEmail);
		tellUsAboutYourselfPage.enterEmailAddress(numbersEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> البريد الإلكتروني باستخدام أرقام ألفا فقط: '</b>"+alphaNumericsEmail);
		tellUsAboutYourselfPage.enterEmailAddress(alphaNumericsEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyinvalidEmailInlineError(), "Verified <b>'يرجى إدخال عنوان بريد إلكتروني ساري.'</b> Inline Error Message for Email Displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering <b> بريد إلكتروني صالح : '</b>"+email);
		tellUsAboutYourselfPage.enterEmailAddress(email);		

	}
	
	@Test(priority = 9, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_StartOverJourneyForExistingUser_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String fullName = "AutomationMari";
		String mobileNumber = "524691837";

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_009");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'هل تريد الاستمرار في الطلب السابق؟'</b> Popup is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyStartOverJourneyPopupIsDisplaying(), "Verified <b>'هل تريد الاستمرار في الطلب السابق؟'</b> Popup is displaying.");
		
	}

	@Test(priority = 23, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_EnterDetailsAndProceed_TellUsAboutYourselfScreen_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		String fullName = "AutomationMari";
		String mobileNumber ="52"+generateRandomNumberWithGivenNumberOfDigits(10);
		String email = "hello@gmail.com";
		String employerName = "Other";
		String salary = "10000";

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_023");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>"+fullName);
		tellUsAboutYourselfPage.enterFullName(fullName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>"+mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>"+email);
		tellUsAboutYourselfPage.enterEmailAddress(email);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'Expat'</b> ");
		tellUsAboutYourselfPage.selectExpatNationality();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried'</b>");
		tellUsAboutYourselfPage.selectExpatSalariedEmploymentStatus();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>"+salary);
		tellUsAboutYourselfPage.enterSalary(salary);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User Proceed To <b>'يرجى إدخال كلمة المرور لمرة واحدة'</b> Screen.");
		ErrorCollector.verifyTrue(otpPage.verifyOtpPageTitleIsDisplaying(), "Verified User Proceed To <b>'يرجى إدخال كلمة المرور لمرة واحدة'</b> Screen.");
		

	}
	
	@Test(priority = 2, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_NameAndNumberField_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_02");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'الاسم الكامل'</b> field is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyFullNameFieldIsDisplaying(), "Verified <b>'Full Name'</b> field is displaying.");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'رقم الهاتف المحمول'</b> field is displaying.");
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyMobileNumberFieldIsDisplaying(), "Verified <b>'Mobile Number'</b> field is displaying.");
		

	}
	
	@Test(priority = 3, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_FullNameShouldNotBeBlank_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_003");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Error Message'</b> is displaying with blank name field.");
		tellUsAboutYourselfPage.clickOnFullNameInput();
		tellUsAboutYourselfPage.clickOnMobileNumberInput();
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyBlankFullNameFieldErrorMessageIsDisplaying(), "Verified <b>'Error Message'</b> is displaying with blank name field.");

	}
	
	@Test(priority = 4, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_FullNameValidations_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_004");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Error Message'</b> is displaying with blank name field.");
		tellUsAboutYourselfPage.clickOnFullNameInput();
		tellUsAboutYourselfPage.clickOnMobileNumberInput();
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyBlankFullNameFieldErrorMessageIsDisplaying(), "Verified <b>'Error Message'</b> is displaying with blank name field.");

	}
	
	@Test(priority = 6, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_MobileNumberShouldNotBeBlank_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();

		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_006");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Error Message'</b> is displaying with blank mobile field.");
		tellUsAboutYourselfPage.clickOnMobileNumberInput();
		tellUsAboutYourselfPage.clickOnFullNameInput();
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyBlankMobileNumberFieldErrorMessageIsDisplaying(), "Verified <b>'Error Message'</b> is displaying with blank mobile field.");

	}
		
	@Test(priority = 7, groups = {"Tell Us About Yourself" , "Arabic"})
	public void Verify_PL_RakBank_MobileNumberLenghtAndCodeValidations_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		String name = "Mari";
		String mobileWithFiveZero = "50"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveTwo = "52"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveFour = "54"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveFive = "55"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveSix = "56"+generateRandomNumberWithGivenNumberOfDigits(7);
		String mobileWithFiveEight = "58"+generateRandomNumberWithGivenNumberOfDigits(7);


		int step = 0;
		
		ErrorCollector.extentLogInfo("<b>Test case ID: </b> TC_BBG_ENG_PC_MOB_001_007");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>"+name);
		tellUsAboutYourselfPage.enterFullName(name);
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with Five Zero: <b>"+mobileWithFiveZero);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveZero);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '50'</b> from "+mobileWithFiveZero);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '50'</b> from "+mobileWithFiveZero);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with Five Two: <b>"+mobileWithFiveTwo);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveTwo);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '52'</b> from "+mobileWithFiveTwo);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '52'</b> from "+mobileWithFiveTwo);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with Five Four: <b>"+mobileWithFiveFour);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveFour);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '54'</b> from "+mobileWithFiveFour);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '54'</b> from "+mobileWithFiveFour);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with 55: <b>"+mobileWithFiveFive);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveFive);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '55'</b> from "+mobileWithFiveFive);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '55'</b> from "+mobileWithFiveFive);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with 56: <b>"+mobileWithFiveSix);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveSix);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '56'</b> from "+mobileWithFiveSix);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '56'</b> from "+mobileWithFiveSix);
		tellUsAboutYourselfPage.clickOnLeftBackIcon();
		letsGoPage.clickOnLetsGoButton();
		
		
		tellUsAboutYourselfPage.enterFullName(name);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number Starting with 58: <b>"+mobileWithFiveEight);
		tellUsAboutYourselfPage.enterMobileNumber(mobileWithFiveEight);
		tellUsAboutYourselfPage.clickOnContinueButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>'Field Must be Lead with '58'</b> from "+mobileWithFiveEight);
		ErrorCollector.verifyTrue(tellUsAboutYourselfPage.verifyEmailFieldIsDisplaying(), "Verified <b>'Field Must be Lead with '58'</b> from "+mobileWithFiveEight);
		
		
	}
	
}
