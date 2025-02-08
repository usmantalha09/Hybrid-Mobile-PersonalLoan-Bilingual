package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;



public class LetsGoPage extends BaseClass {

	@FindBy(xpath = "(//XCUIElementTypeOther[@label=\"Let’s go\"])[last()] | (//XCUIElementTypeOther[@label='البدء'])[last()]")
	WebElement ios_letsGoButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Let’s go\"] | //android.widget.TextView[@text='البدء']")
	WebElement letsGoButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='leftIcon']")
	WebElement ios_leftBackIcon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='leftIcon']")
	WebElement leftBackIcon;
	
	
	//IOS elements are required
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='headerTitle']//android.widget.TextView[@text='Personal Loan'] | //android.widget.TextView[@text='قرض شخصي']")
	WebElement headerTitle;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'up to 20 times your salary')] | //android.widget.TextView[contains(@text,\"قروض تصل إلى 20 ضعفاً\")]")
	WebElement uptoSalaryLoanDetails;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'as high as AED 4 million')] | //android.widget.TextView[contains(@text,\"لراتبك وتصل إلى 4 ملايين درهم.\")]")
	WebElement maximumLoanDetails;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Defer payments for up to 120 days.')] | //android.widget.TextView[@text='تأجيل الدفعات لمدة تصل إلى 120 يوماً.']")
	WebElement deferPaymentLoanDetails;
	
	
	
	

	public LetsGoPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}

	public void clickOnLetsGoButton() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("البدء");
		}else{
			scrollToText("Let’s go");
		}
		
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_letsGoButton);
		}else {
			click(letsGoButton);
		}
		
	}
	
	public void clickOnLeftBackIcon() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_leftBackIcon);
		}else {
			click(leftBackIcon);
		}
	}

}
