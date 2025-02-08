package com.personalLoan.pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.utilities.GenericUtilities;
import com.personalLoan.utilities.Waits;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class YourFinanceQuotePage extends BaseClass {

	// Page 1

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-jobStartDate-calendar-touchable']")
	WebElement ios_currentJobStartDate;

	@FindBy(xpath = "//android.widget.EditText[@text='Select date'] | //android.widget.EditText[@text='يرجى تحديد التاريخ'] ")
	WebElement currentJobStartDate;
	
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Previous month']")
	WebElement previousMonthButton;
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc,'01')]")
	WebElement firstDateButton;
	
	
	

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='undefined-jobStartDate-dateTimePickerAnimated-done'] | (//XCUIElementTypeStaticText[@name=\"undefined-jobStartDate-dateTimePickerAnimated-done\"])[last()]")
	WebElement ios_currentJobStartDateAccepyButton;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	WebElement currentJobStartDateAccepyButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-jobTitle-input-main-touchable']")
	WebElement ios_jobTitleInput;

	@FindBy(xpath = "//android.widget.EditText[@text='Select one'] | //android.widget.EditText[@text='اختر واحداً']")
	WebElement jobTitleInput;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='undefined-jobTitle-search-input']")
	WebElement ios_jobTitleSearchInput;

	@FindBy(xpath = "//android.widget.EditText[@text='Search job titles...'] | //android.widget.EditText[@text='البحث في المسميات الوظيفية']")
	WebElement jobTitleSearchInput;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-jobTitle-list-item-0-onPress']")
	WebElement ios_jobTitleOherOption;

	@FindBy(xpath = "//android.widget.TextView[@text='OTHER']")
	WebElement jobTitleOherOption;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-firstInstallmentDate-touchable']")
	WebElement ios_firstInstallmentDate;

	@FindBy(xpath = "//android.widget.EditText[@text='Select preferred date'] | //android.widget.EditText[@text='يرجى اختيار التاريخ المفضل']")
	WebElement firstInstallmentDate;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-firstInstallmentDate-list-0-onPress']")
	WebElement ios_firstInstallmentDate_30Days;

	@FindBy(xpath = "//android.widget.TextView[@text='30 days']")
	WebElement firstInstallmentDate_30Days;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-firstInstallmentDate-list-1-onPress']")
	WebElement ios_firstInstallmentDate_60Days;

	@FindBy(xpath = "//android.widget.TextView[@text='60 days']")
	WebElement firstInstallmentDate_60Days;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-totalMonthlyIncome-touchable']")
	WebElement ios_monthlyHouseholdIncome;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-totalMonthlyIncome-icon']//following-sibling::android.widget.EditText")
	WebElement monthlyHouseholdIncome;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-numEarningMembers-touchable']")
	WebElement ios_numberOfMemberEarning;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'earning members are in the family')]//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'كم عدد أفراد الأسرة الذين يتحصلون على دخل')]//following-sibling::android.widget.EditText")
	WebElement numberOfMemberEarning;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-depositStAcc-touchable']")
	WebElement ios_monthlycashDepositInAccount;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'how much cash will you deposit')]//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'بخلاف راتبك، ما هو المبلغ النقدي الذي ستودعه في حساب تحويل الراتب الخاص بك')]//following-sibling::android.widget.EditText")
	WebElement monthlycashDepositInAccount;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-purposeLoan-touchable']")
	WebElement ios_purposeOfLoan;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'purpose of the loan')] | //android.widget.TextView[@text='ما هو الغرض من القرض؟'] | //android.widget.TextView[contains(@text,'purpose of the financing')]")
	WebElement purposeOfLoan;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-purposeLoan-list-0-onPress']")
	WebElement ios_purposeOfLoan_debtConsolidation;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-purposeLoan-list-0-onPress'] | //android.widget.TextView[@text='Debt consolidation']//parent::android.view.ViewGroup")
	WebElement purposeOfLoan_debtConsolidation;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-retireDate-touchable']")
	WebElement ios_retireDatePlan;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'plan to retire')] | //android.widget.TextView[@text='متى تخطط للتقاعد؟']")
	WebElement retireDatePlan;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-retireDate-list-0-onPress']")
	WebElement ios_retireDatePlan_10To20;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-retireDate-list-0-onPress'] | //android.widget.TextView[@text='In 10 to 20 Years']")
	WebElement retireDatePlan_10To20;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-retireDate-list-1-onPress']")
	WebElement ios_retireDatePlan_moreThan20;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-retireDate-list-1-onPress'] | //android.widget.TextView[@text='In 20 years or more']")
	WebElement retireDatePlan_moreThan20;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-retireDate-list-2-onPress']")
	WebElement ios_retireDatePlan_with10;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-retireDate-list-2-onPress'] | //android.widget.TextView[@text='Within 10 Years']")
	WebElement retireDatePlan_with10;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-lifestyleExpense-touchable']")
	WebElement ios_monthlyLifeStyleExpense;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'your lifestyle expenses')]//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'ما مبلغ نفقات أسلوب حياتك')]//following-sibling::android.widget.EditText")
	WebElement monthlyLifeStyleExpense;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-billsUtilities-touchable']")
	WebElement ios_monthlyUtilities;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'bills and utilities')]//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'ما مبلغ الفواتير وخدمات المرافق الخاصة بك')]//following-sibling::android.widget.EditText")
	WebElement monthlyUtilities;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-additionalLoans-touchable']")
	WebElement ios_monthlyOtherFinancing;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-additionalLoans-icon']//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'هل لديك أي قروض إضافية')]//following-sibling::android.widget.EditText")
	WebElement monthlyOtherFinancing;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-monthlyExpense-touchable']")
	WebElement ios_monthlyExpenses;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'monthly expenses')]//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'كم هي مصاريفك الشهرية الأخرى')]//following-sibling::android.widget.EditText")
	WebElement monthlyExpenses;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-dependents-touchable']")
	WebElement ios_monthlyDependents;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'dependents do you have')]//following-sibling::android.widget.EditText | //android.widget.TextView[contains(@text,'كم عدد المعالين لديك؟')]//following-sibling::android.widget.EditText")
	WebElement monthlyDependents;

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='See your quote'])[last()] | (//XCUIElementTypeOther[@label='الاطلاع على عرض السعر الخاص بك'])[last()]")
	WebElement ios_seeYourQuoteButton;

	@FindBy(xpath = "//android.widget.TextView[@text='See your quote'] | //android.widget.TextView[@text='الاطلاع على عرض السعر الخاص بك']")
	WebElement seeYourQuoteButton;
	
	
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='Select insurance provider'] | //android.widget.TextView[@text='اختر مزود التأمين']")
	WebElement selectInsuranceProviderButton;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Select insurance provider'])[last()] | (//XCUIElementTypeOther[@label='اختر مزود التأمين'])[last()] ")
	WebElement ios_selectInsuranceProviderButton;
	
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-insurance0-onPress'] | //android.widget.TextView[@text='RAKinsurance'] | //android.widget.TextView[@text='راك للتأمين']")
	WebElement rakInssurrance;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-insurance0-onPress']")
	WebElement ios_rakInssurrance;
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='Read']//parent::android.view.ViewGroup[@resource-id='outlined'] | //android.widget.TextView[@text='Read'] | //android.view.ViewGroup[@resource-id='outlined'] | //android.widget.TextView[@text='شروط وأحكام التأمين']")
	WebElement insurranceTermsAndConditionButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='outlined'] | //XCUIElementTypeOther[label='Read']")
	WebElement ios_insurranceTermsAndConditionButton;
	

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='See loan summary'])[last()] | (//XCUIElementTypeOther[@label='انظر ملخص القرض'])[last()]")
	WebElement ios_seeLoanSummaryButton;

	@FindBy(xpath = "//android.widget.TextView[@text='See loan summary'] | //android.widget.TextView[@text='انظر ملخص القرض']")
	WebElement seeLoanSummaryButton;

	
	
	
	
	
	
	
	



	public YourFinanceQuotePage() {
		PageFactory.initElements(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				this);
	}
	
	public void swipeDown(int startX, int startY, int endX, int endY ) {

		// Swipe until the bottom of the scrollable element
		TouchAction action = new TouchAction(getIOSDriver());
		for (int i = 0; i < 2; i++) { // You can adjust the loop count as needed
			action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(endX, endY)).release().perform();
		}
	}

	public void selectCurrentJobJoiningDate() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_currentJobStartDate);
			swipeDown(290,670,290,740);
			Waits.wait1s();
			click(ios_currentJobStartDateAccepyButton);
		} else {
			click(currentJobStartDate);
			for(int i=0; i<=4;i++) {
				click(previousMonthButton);
			}
			click(firstDateButton);
			Waits.wait2s();
			click(currentJobStartDateAccepyButton);
		}
	}

	public void selectOtherJobTitle(String jobTitle) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_jobTitleInput);
			sendKeysToWebElement(ios_jobTitleSearchInput, jobTitle);
			click(ios_jobTitleOherOption);
		} else {
			click(jobTitleInput);
			Waits.wait1s();
			jobTitleSearchInput.sendKeys(jobTitle);
			Waits.wait1s();
			click(jobTitleOherOption);
		}
	}

	public void selectInstallmentDuration(String duration) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_firstInstallmentDate);
			switch (duration) {
			case "30":
				click(ios_firstInstallmentDate_30Days);
				break;
			case "60":
				click(ios_firstInstallmentDate_60Days);
				break;

			default:
				click(ios_firstInstallmentDate_60Days);
				break;
			}

		} else {
			click(firstInstallmentDate);
			switch (duration) {
			case "30":
				click(firstInstallmentDate_30Days);
				break;
			case "60":
				click(firstInstallmentDate_60Days);
				break;

			default:
				click(firstInstallmentDate_60Days);
				break;
			}
		}
	}

	public void enterMonthlyHouseholdIncome(String householdIncome) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlyHouseholdIncome, householdIncome);
		} else {
			sendKeysToWebElement(monthlyHouseholdIncome, householdIncome);
		}
	}

	public void enterNumberOfMemberEarning(String earningMembers) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_numberOfMemberEarning, earningMembers);
		} else {
			sendKeysToWebElement(numberOfMemberEarning, earningMembers);
		}
	}

	public void enterCashDeposit(String cashDeposit) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlycashDepositInAccount, cashDeposit);
		} else {
			sendKeysToWebElement(monthlycashDepositInAccount, cashDeposit);
		}
	}

	public void selectPurposeOfLoan(String loanPurpose) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_purposeOfLoan);
			switch (loanPurpose) {
			case "Debt consolidation":
				click(ios_purposeOfLoan_debtConsolidation);
				break;

			default:
				click(ios_purposeOfLoan_debtConsolidation);
				break;
			}

		} else {
			click(purposeOfLoan);
			switch (loanPurpose) {
			case "Debt consolidation":
				// Define the coordinates to click
	            int x = 500; // X coordinate
	            int y = 970; // Y coordinate
	            
	            TouchAction touchAction = new TouchAction(getAndroidDriver());
	            touchAction.press(PointOption.point(x, y)).perform();
	            Waits.wait1s();
	            touchAction.press(PointOption.point(x, y)).waitAction().release().perform();
	            Waits.wait1s();
	            try {
	            	click(purposeOfLoan_debtConsolidation);
	            }catch (Exception e) {
					// TODO: handle exception
				}
	            System.out.println("CLICKED");
				break;

			default:
				click(purposeOfLoan_debtConsolidation);
				break;
			}
		}
	}

	public void selectRetirementPlan(String retireDay) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_retireDatePlan);
			switch (retireDay) {
			case "In 10 to 20 Years":
				click(ios_retireDatePlan_10To20);
				break;
			case "In 20 years or more":
				click(ios_retireDatePlan_moreThan20);
				break;
			case "Within 10 Years":
				click(ios_retireDatePlan_with10);
				break;

			default:
				click(ios_retireDatePlan_with10);
				break;
			}

		} else {
			click(retireDatePlan);
			switch (retireDay) {
			case "In 10 to 20 Years":
				click(retireDatePlan_10To20);
				break;
			case "In 20 years or more":
				click(retireDatePlan_moreThan20);
				break;
			case "Within 10 Years":
				click(retireDatePlan_with10);
				break;

			default:
				click(retireDatePlan_with10);
				break;
			}
		}
	}

	public void enterMonthlyLifeStyleExpense(String LifeStyleExpense) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlyLifeStyleExpense, LifeStyleExpense);
		} else {
			sendKeysToWebElement(monthlyLifeStyleExpense, LifeStyleExpense);
		}
	}

	public void enterMonthlyUtilities(String Utilities) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlyUtilities, Utilities);
		} else {
			sendKeysToWebElement(monthlyUtilities, Utilities);
		}
	}

	public void enterMonthlyOtherFinancing(String OtherFinancing) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlyOtherFinancing, OtherFinancing);
		} else {
			sendKeysToWebElement(monthlyOtherFinancing, OtherFinancing);
		}
	}

	public void enterMonthlyExpenses(String Expenses) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlyExpenses, Expenses);
		} else {
			sendKeysToWebElement(monthlyExpenses, Expenses);
		}
	}

	public void enterDependents(String Dependents) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_monthlyDependents, Dependents);
		} else {
			sendKeysToWebElement(monthlyDependents, Dependents);
		}
	}

	public void clickOnSeeYourQuote() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_seeYourQuoteButton);
		} else {
			click(seeYourQuoteButton);

		}
	}
	
	public void selectInsuranceProvider_RakInsurance() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("انظر ملخص القرض");
		}else{
			scrollToText("See loan summary");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_selectInsuranceProviderButton);
			click(ios_rakInssurrance);
		} else {
			click(selectInsuranceProviderButton);
			click(rakInssurrance);

		}
	}
	
	
	public void clickOnReadTermsAndCondition() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("انظر ملخص القرض");
		}else{
			scrollToText("See loan summary");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_insurranceTermsAndConditionButton);
		} else {
			click(insurranceTermsAndConditionButton);

		}
	}
	
	public void clickOnSeeLoanSummaryButton() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("انظر ملخص القرض");
		}else{
			scrollToText("See loan summary");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_seeLoanSummaryButton);
		} else {
			click(seeLoanSummaryButton);

		}
	}
	

}
