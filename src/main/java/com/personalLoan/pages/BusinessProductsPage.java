package com.personalLoan.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;



public class BusinessProductsPage extends BaseClass {
	
	
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='title']")
	WebElement ios_businessPageTitle;
	
	@FindBy(xpath = "//android.widget.TextView[@text='What are you interested in?']")
	WebElement businessPageTitle;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined1-onPress']")
	WebElement ios_personalLoanButton;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id='undefined1-onPress']//android.widget.TextView)[1] | //android.widget.TextView[@text=\"قرض شخصي\"]")
	WebElement personalLoanButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined0-onPress']")
	WebElement ios_creditCardButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Credit card'] | //android.widget.TextView[@text='بطاقة ائتمان']")
	WebElement creditCardButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined2-onPress']")
	WebElement ios_bankAccountButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Bank account'] | //android.widget.TextView[@text='حساب بنكي']")
	WebElement bankAccountButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='leftIcon']")
	WebElement ios_leftBackIcon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='leftIcon']")
	WebElement leftBackIcon;
	
	
	

	public BusinessProductsPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}

	public void clickOnCreditCardButton() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_creditCardButton);
		}else {
			click(creditCardButton);
		}
	}
	
	public void clickOnPersonaLoanButton() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_personalLoanButton);
		}else {
			click(personalLoanButton);
		}
		
	}
	
	public void clickOnBankAccountButton() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_bankAccountButton);
		}else {
			click(bankAccountButton);
		}
	}
	
	public Boolean verifyProductSelectionPageTitleIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_businessPageTitle, defaultTimeForVisibility);
			return isElementDisplayed(ios_businessPageTitle);
		}else {
			waitForElementVisibility(businessPageTitle, defaultTimeForVisibility);
			return isElementDisplayed(businessPageTitle);
		}
	}
	
	public Boolean verifyCreditCardProductButtonIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_creditCardButton, defaultTimeForVisibility);
			return isElementDisplayed(ios_creditCardButton);
		}else {
			waitForElementVisibility(creditCardButton, defaultTimeForVisibility);
			return isElementDisplayed(creditCardButton);
		}
	}
	
	public Boolean verifyPersonalLoanProductButtonIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_personalLoanButton, defaultTimeForVisibility);
			return isElementDisplayed(ios_personalLoanButton);
		}else {
			waitForElementVisibility(personalLoanButton, defaultTimeForVisibility);
			return isElementDisplayed(personalLoanButton);
		}
	}
	
	public Boolean verifyBankAccountProductButtonIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_bankAccountButton, defaultTimeForVisibility);
			return isElementDisplayed(ios_bankAccountButton);
		}else {
			waitForElementVisibility(bankAccountButton, defaultTimeForVisibility);
			return isElementDisplayed(bankAccountButton);
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
