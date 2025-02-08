package com.personalLoan.test;

import org.testng.annotations.Test;

import com.personalLoan.base.BaseClass;
import com.personalLoan.errorCollectors.ErrorCollector;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.pages.AboutYourselfPage;
import com.personalLoan.pages.BankingPreferencesPage;
import com.personalLoan.pages.BusinessProductsPage;
import com.personalLoan.pages.GetEstimatePage;
import com.personalLoan.pages.LandingPage;
import com.personalLoan.pages.LetsGoPage;
import com.personalLoan.pages.OtpPage;
import com.personalLoan.pages.TellUsAboutYourselfPage;
import com.personalLoan.pages.TermsConditinonPage;
import com.personalLoan.pages.ViewDocumentsPage;
import com.personalLoan.pages.YourFinanceQuotePage;
import com.personalLoan.utilities.BypassERF;
import com.personalLoan.utilities.GenericUtilities;
import com.personalLoan.utilities.Waits;

public class Test_PL_PositiveFlow extends BaseClass {

	// Convenctional
	@Test(priority = 1, groups = { "Convenctional HappyFLow", "HappyFLow" })
	public void Verify_PL_RakBank_Expat_Salaried() throws InterruptedException {

		initReport();
		initConfiguration();

		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();

		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);// "501458234";//
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Expat'</b> as Nationality");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Salaried'</b> as Employment Status");
		tellUsAboutYourselfPage.selectExpatSalariedEmploymentStatus();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen - Employment Status Selected");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'Employer'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Salary: <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

	}

////	@Test(priority = 2, groups = { "Convenctional HappyFLow" })
	public void Verify_PL_RakBank_Expat_SelfEmployeed() throws InterruptedException {

		initReport();
		initConfiguration();

		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();

		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);// "508878166";//
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Expat'</b> as Nationality");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Self Employeed'</b> as Employment Status");
		tellUsAboutYourselfPage.selectExpatSelfEmployedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
	}

//	@Test(priority = 3, groups = { "Convenctional HappyFLow" })
	public void Verify_PL_RakBank_UAENational_Salaried() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Salaried'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'Employer'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Salary: <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

	}

//	@Test(priority = 4, groups = { "Convenctional HappyFLow" })
	public void Verify_PL_RakBank_UAENational_SalariedWithPensioner() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting <b>'Salaried with Pension'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalSalariedWithPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'Employer'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Salary: <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Pension: <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

	}

//	@Test(priority = 5, groups = { "Convenctional HappyFLow" })
	public void Verify_PL_RakBank_UAENational_Pensioner() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Pensioner'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Pension: <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

	}

////	@Test(priority = 6, groups = { "Convenctional HappyFLow" })
	public void Verify_PL_RakBank_UAENational_SelfEmployeed() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Self Employeed'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalSelfEmployeedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

	}

	// Islamic

//	@Test(priority = 1, groups = { "Islamic HappyFLow" })
	public void Verify_PL_RakBankIslamic_Expat_Salaried() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank Islamic'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Expat'</b> as Nationality");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Salaried'</b> as Employment Status");
		tellUsAboutYourselfPage.selectExpatSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'Employer'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Salary: <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
	}

////	@Test(priority = 2, groups = { "Islamic HappyFLow" })
	public void Verify_PL_RakBankIslamic_Expat_SelfEmployeed() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank Islamic'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Expat'</b> as Nationality");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Self Employeed'</b> as Employment Status");
		tellUsAboutYourselfPage.selectExpatSelfEmployedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
	}

//	@Test(priority = 3, groups = { "Islamic HappyFLow" })
	public void Verify_PL_RakBankIslamic_UAENational_Salaried() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank Islamic'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Salaried'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'Employer'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Salary: <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
	}

//	@Test(priority = 4, groups = { "Islamic HappyFLow" })
	public void Verify_PL_RakBankIslamic_UAENational_SalariedWithPensioner() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank Islamic'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting <b>'Salaried with Pension'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalSalariedWithPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'Employer'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Salary: <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Pension: <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

	}

//	@Test(priority = 5, groups = { "Islamic HappyFLow" })
	public void Verify_PL_RakBankIslamic_UAENational_Pensioner() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank Islamic'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Pensioner'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Pension: <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
	}

////	@Test(priority = 6, groups = { "Islamic HappyFLow" })
	public void Verify_PL_RakBankIslamic_UAENational_SelfEmployeed() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Launching Application");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank Islamic'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'UAE National'</b> as Nationality");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'Self Employeed'</b> as Employment Status");
		tellUsAboutYourselfPage.selectUAENationalSelfEmployeedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Get Estimate'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'View Documents'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ExtentListeners.attachScreenShot("EFR Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();
		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Apply For Product'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Personal Loan'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'RakBank'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Lets Go'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Full Name: <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Mobile Number: <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue Journey Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter OTP: <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Joining Date");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Job Title <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting Installment Duration <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering monthly Household Income <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Number of Member Earning <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Cash Deposit <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Purpose Of Loan <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting Retirement Plan <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Lifestyle Expense <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Utilities <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Monthly Other Finance <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering Monthly Expense <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Dependents <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Your Quote'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting<b>'RAK Insurance'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();
		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'See Loan Summary'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Let's Continue'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Verify Salary'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Name <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering villa Number <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Street Number <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Po-Box <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Home Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Name <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering House Number <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Area Name <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting City Town<b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Postal Code <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering Mobile Number With Country Code <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Birth Country <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Dual Nationality <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Citizen <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting US Relation <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting Uae Tax Resident <b>'Yes'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting tax Payable In Other Country <b>'No'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'Continue'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
	}

//	Convenctional Arabic
//	@Test(priority = 1, groups = { "Convenctional Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBank_Expat_Salaried_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'Expat'</b> ");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried'</b>");
		tellUsAboutYourselfPage.selectExpatSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ExtentListeners.attachScreenShot("Tell Us About Yourself Screen - Employment Status Selected");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering Iban <b>'" + iban + "'</b>");
		aboutYourselfPage.enterIban(iban);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التحقق من الراتب'</b> button");
		aboutYourselfPage.clickOnVerifySalaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering اسم المبنى أو الفيل <b>'" + villaName + "'</b>");
		aboutYourselfPage.enterVillaName(villaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering رقم المبنى أو الفيلا <b>'" + villaNo + "'</b>");
		aboutYourselfPage.enterVillaNumber(villaNo);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering اسم الشارع أو المنطقة <b>'" + streetNumber + "'</b>");
		aboutYourselfPage.enterStreetName(streetNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'المدينة'</b>");
		aboutYourselfPage.selectCity();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering صندوق البريد <b>'" + poBox + "'</b>");
		aboutYourselfPage.enterPoBox(poBox);

		ExtentListeners.attachScreenShot("About Yourself Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الموطن <b>'" + country + "'</b>");
		aboutYourselfPage.selectHomeCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering اسم المنزل أو الشقة <b>'" + houseName + "'</b>");
		aboutYourselfPage.enterHouseNameInput(houseName);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering رقم المنزل أو الشقة <b>'" + houseNumber + "'</b>");
		aboutYourselfPage.enterHouseNoInput(houseNumber);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering اسم الشارع أو المنطقة <b>'" + areaName + "'</b>");
		aboutYourselfPage.enterAreaNameInput(areaName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting المدينة أو البلدة <b>'" + cityTown + "'</b>");
		aboutYourselfPage.selectCityTown(cityTown);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering الرمز البريدي أو رمز المنطقة <b>'" + postalCode + "'</b>");
		aboutYourselfPage.enterPostalCodeInput(postalCode);

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Entering يرجى إدخال رقم الهاتف المحمول (بما في ذلك رمز الدولة) <b>'" + mobileNumber + "'</b>");
		aboutYourselfPage.enterMobileNumberInput(mobileNumberWithCode);
		ExtentListeners.attachScreenShot("Home Country Details Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting دولة ميلادك <b>'" + country + "'</b>");
		aboutYourselfPage.selectBirthCountry(country);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الجنسية المزدوجة <b>'لا'</b> Radio Button");
		aboutYourselfPage.clickOnDualNationality_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مواطن أمريكي <b>'لا'</b> Radio Button");
		aboutYourselfPage.clickOnUSCitizen_NoRadioButton();

		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}
		ExtentListeners.attachScreenShot("Tax Payer Details Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting العلاقات الأمريكية <b>'نعم'</b> Radio Button");
		aboutYourselfPage.clickOnUSRelation_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مقيم ضريبة الإمارات العربية المتحدة <b>'نعم'</b> Radio Button");
		aboutYourselfPage.clickOnUaeTaxResident_YesRadioButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting الضريبة المستحقة في بلد آخر <b>'لا'</b> Radio Button");
		aboutYourselfPage.clickOntaxPayableInOtherCntry_NoRadioButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();
		Waits.wait3s();

	}

////	@Test(priority = 1, groups = { "Convenctional Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBank_Expat_SelfEmployeed_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'Expat'</b> ");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Self-Employed'</b>");
		tellUsAboutYourselfPage.selectExpatSelfEmployedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	@Test(priority = 1, groups = { "Convenctional Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBank_UAENational_Salaried_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried'</b>");
		tellUsAboutYourselfPage.selectUAENationalSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

////	@Test(priority = 1, groups = { "Convenctional Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBank_UAENational_SelfEmployeed_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Self-Employed'</b>");
		tellUsAboutYourselfPage.selectUAENationalSelfEmployeedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	@Test(priority = 1, groups = { "Convenctional Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBank_UAENational_Pensioner_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String pension = "10000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Pensioner'</b>");
		tellUsAboutYourselfPage.selectUAENationalPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'المعاش الشهري': <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	@Test(priority = 1, groups = { "Convenctional Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBank_UAENational_SalariedWithPensioner_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried With Pensioner'</b>");
		tellUsAboutYourselfPage.selectUAENationalSalariedWithPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'المعاش الشهري': <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	islamic Arabic
//	@Test(priority = 1, groups = { "Islamic Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBankIslamic_Expat_Salaried_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك الإسلامي'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'Expat'</b> ");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried'</b>");
		tellUsAboutYourselfPage.selectExpatSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

////	@Test(priority = 1, groups = { "Islamic Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBankIslamic_Expat_SelfEmployeed_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك الإسلامي'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'Expat'</b> ");
		tellUsAboutYourselfPage.selectExpatNationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Self-Employed'</b>");
		tellUsAboutYourselfPage.selectExpatSelfEmployedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	@Test(priority = 1, groups = { "Islamic Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBankIslamic_UAENational_Salaried_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك الإسلامي'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried'</b>");
		tellUsAboutYourselfPage.selectUAENationalSalariedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

////	@Test(priority = 1, groups = { "Islamic Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBankIslamic_UAENational_SelfEmployeed_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك الإسلامي'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Self-Employed'</b>");
		tellUsAboutYourselfPage.selectUAENationalSelfEmployeedEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	@Test(priority = 1, groups = { "Islamic Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBankIslamic_UAENational_Pensioner_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String pension = "10000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك الإسلامي'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Pensioner'</b>");
		tellUsAboutYourselfPage.selectUAENationalPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'المعاش الشهري': <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

//	@Test(priority = 1, groups = { "Islamic Arabic HappyFLow", "Arabic" })
	public void Verify_PL_RakBankIslamic_UAENational_SalariedWithPensioner_InArabic() throws InterruptedException {

		initReport();
		initConfiguration();
		LandingPage landingPage = new LandingPage();
		BusinessProductsPage businessProductsPage = new BusinessProductsPage();
		BankingPreferencesPage bankingPreferencesPage = new BankingPreferencesPage();
		LetsGoPage letsGoPage = new LetsGoPage();
		TellUsAboutYourselfPage tellUsAboutYourselfPage = new TellUsAboutYourselfPage();
		OtpPage otpPage = new OtpPage();
		GetEstimatePage getEstimatePage = new GetEstimatePage();
		ViewDocumentsPage viewDocumentsPage = new ViewDocumentsPage();
		TermsConditinonPage termsConditinonPage = new TermsConditinonPage();
		YourFinanceQuotePage yourFinanceQuotePage = new YourFinanceQuotePage();
		GenericUtilities genericUtilities = new GenericUtilities();
		AboutYourselfPage aboutYourselfPage = new AboutYourselfPage();
		String jobTitle = JobTitle;
		String installmentDuration = InstallmentDuration;
		String householdIncome = HouseholdIncome;
		String numberOfMemberEarning = NumberOfMemberEarning;
		String cashDeposit = CashDeposit;
		String loanPurpose = LoanPurpose;
		String retirementPlan = RetirementPlan;
		String monthlyLifestyleExpense = MonthlyLifestyleExpense;
		String monthlyUtilities = MonthlyUtilities;
		String monthlyOtherFinance = MonthlyOtherFinance;
		String monthlyExpenses = MonthlyExpenses;
		String dependents = Dependents;
		String name = Name;
		String mobileNumber = "504874787";// "50" + generateRandomNumberWithGivenNumberOfDigits(7);
		String email = Email;
		String employerName = EmployerName;
		String salary = Salary;
		String pension = "5000";
		String otp = Otp;
		String iban = Iban;
		String villaName = VillaName;
		String villaNo = VillaNo;
		String streetNumber = StreetNumber;
		String poBox = PoBox;
		String country = Country;
		String houseName = HouseName;
		String houseNumber = HouseNumber;
		String areaName = AreaName;
		String cityTown = CityTown;
		String postalCode = PostalCode;
		String mobileNumberWithCode = MobileNumberWithCode;

		int step = 0;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : إطلاق التطبيق");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'العربية'</b> ");
		landingPage.clickOnToArabicLangButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();
		ExtentListeners.attachScreenShot("Product Screen");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ExtentListeners.attachScreenShot("Banking Preferences Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك الإسلامي'</b> button");
		bankingPreferencesPage.clickOnRakbankIslamicButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter البريد الإلكتروني: <b>" + email);
		tellUsAboutYourselfPage.enterEmailAddress(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting جنسية <b>'UAE National'</b> ");
		tellUsAboutYourselfPage.selectUAENationality();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting 'ضعك الوظيفي' <b>'Salaried With Pensioner'</b>");
		tellUsAboutYourselfPage.selectUAENationalSalariedWithPensionerEmploymentStatus();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Search And Select <b>'اسم الشركة التي تعمل بها'</b> ");
		tellUsAboutYourselfPage.SearchAndSelectEmployer(employerName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'راتبك الشهري': <b>" + salary);
		tellUsAboutYourselfPage.enterSalary(salary);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'المعاش الشهري': <b>" + pension);
		tellUsAboutYourselfPage.enterPension(pension);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("OTP Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ExtentListeners.attachScreenShot("Get Estimate Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'احصل على تقدير'</b> button");
		getEstimatePage.clickOnGetEstimate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("View Document Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'عرض المستندات'</b> button");
		viewDocumentsPage.clickOnViewDocumentButton();

		ExtentListeners.attachScreenShot("First Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'First Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ExtentListeners.attachScreenShot("Second Document Screen");
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Review the 'Second Document' & Click On <b>'قبول ومتابعة'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithMultipleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Bypassing EFR with <b>'Update Prospect API'</b>");
		BypassERF.BypassERFWithRestAssured(mobileNumber);

		ExtentListeners.attachScreenShot("EFR Screen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Terminating Application and Re-launch");
		genericUtilities.terminateAndRelaunchApplication();

		ExtentListeners.attachScreenShot("After Terminating and Re-launching Sreen");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'التقدم بطلب للحصول على منتج'</b> button ");
		landingPage.clickOnApplyForProductButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'قرض شخصي'</b> button ");
		businessProductsPage.clickOnPersonaLoanButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'راك بنك'</b> button");
		bankingPreferencesPage.clickOnRakbankButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'البدء'</b> button");
		letsGoPage.clickOnLetsGoButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'الاسم الكامل': <b>" + name);
		tellUsAboutYourselfPage.enterFullName(name);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ' رقم الهاتف المحمول': <b>" + mobileNumber);
		tellUsAboutYourselfPage.enterMobileNumber(mobileNumber);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ExtentListeners.attachScreenShot("Continue Journey Popup");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button to continue journey");
		tellUsAboutYourselfPage.clickOnContinueComebackJourneyButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter 'كلمة المرور لمرة واحدة': <b>" + otp);
		otpPage.enterOTP(otp);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting <b>'تاريخ الانضمام'</b>");
		yourFinanceQuotePage.selectCurrentJobJoiningDate();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting مسمى وظيفي <b>'" + jobTitle + "'</b>");
		yourFinanceQuotePage.selectOtherJobTitle(jobTitle);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Selecting مدة القسط <b>'" + installmentDuration + " Days'</b> ");
		yourFinanceQuotePage.selectInstallmentDuration(installmentDuration);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering دخل الأسرة الشهري <b>'" + householdIncome + "'</b>");
		yourFinanceQuotePage.enterMonthlyHouseholdIncome(householdIncome);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering عدد كسب الأعضاء <b>'" + numberOfMemberEarning + "'</b>");
		yourFinanceQuotePage.enterNumberOfMemberEarning(numberOfMemberEarning);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering إيداع نقدي <b>'" + cashDeposit + "'</b>");
		yourFinanceQuotePage.enterCashDeposit(cashDeposit);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting الغرض من القرض <b>'" + loanPurpose + "'</b>");
		yourFinanceQuotePage.selectPurposeOfLoan(loanPurpose);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selecting خطة تقاعد <b>'" + retirementPlan + "'</b>");
		yourFinanceQuotePage.selectRetirementPlan(retirementPlan);

		ExtentListeners.attachScreenShot("Your Finance Quote Screen");
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			scrollDownToEnd(getIOSDriver());
		} else {
			scrollToBottom(getAndroidDriver());
		}

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering نفقات نمط الحياة الشهرية <b>'" + monthlyLifestyleExpense + "'</b>");
		yourFinanceQuotePage.enterMonthlyLifeStyleExpense(monthlyLifestyleExpense);

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Entering المرافق الشهرية <b>'" + monthlyUtilities + "'</b>");
		yourFinanceQuotePage.enterMonthlyUtilities(monthlyUtilities);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Entering التمويل الشهري الآخر <b>'" + monthlyOtherFinance + "'</b>");
		yourFinanceQuotePage.enterMonthlyOtherFinancing(monthlyOtherFinance);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering نفقة شهرية <b>'" + monthlyExpenses + "'</b>");
		yourFinanceQuotePage.enterMonthlyExpenses(monthlyExpenses);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Entering المعالين <b>'" + dependents + "'</b>");
		yourFinanceQuotePage.enterDependents(dependents);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر الاقتباس الخاص بك'</b> Button");
		yourFinanceQuotePage.clickOnSeeYourQuote();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Selecting<b>'رأس الخيمة للتأمين'</b> as Insurance provider");
		yourFinanceQuotePage.selectInsuranceProvider_RakInsurance();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Clicking On <b>'Insurance Terms & Condition'</b> Read button");
		yourFinanceQuotePage.clickOnReadTermsAndCondition();

		ExtentListeners.attachScreenShot("Insurance Terms & Condition Screen");
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Review the 'Terms & Condition Document' & Click On <b>'Accept and Continue'</b> button");
		termsConditinonPage.clickOnAcceptTermsConditionButtonWithSingleScroll();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Clicking On <b>'انظر ملخص القرض'</b> button");
		yourFinanceQuotePage.clickOnSeeLoanSummaryButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnContinueButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>'استمرار'</b> button");
		tellUsAboutYourselfPage.clickOnLetsContinueButton();
	}

}
