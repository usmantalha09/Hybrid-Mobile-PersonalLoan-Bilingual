package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;

public class LandingPage extends BaseClass {

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Apply for a product button'] | //android.widget.TextView[@text=\"التقدم بطلب للحصول على منتج\"]")
	WebElement applyForProductButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='Apply for a product button'] | (//XCUIElementTypeOther[@name=\"التقدم بطلب للحصول على منتج button\"])[last()]")
	WebElement ios_applyForProductButton;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Welcome to RAKBANK']")
	WebElement ios_welcomeToRakBankTitle;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Welcome to RAKBANK']")
	WebElement welcomeToRakBankTitle;

	@FindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'العربية')])[last()]")
	WebElement ios_toArabicLangButton;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'العربية')]")
	WebElement toArabicLangButton;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='ENG']")
	WebElement ios_toEnglishLangButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ENG']")
	WebElement toEnglishLangButton;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='مرحباً بكم في راك بنك']")
	WebElement ios_welcomeToRakbankInArabicText;
	
	@FindBy(xpath = "//android.widget.TextView[@text='مرحباً بكم في راك بنك']")
	WebElement welcomeToRakbankInArabicText;

	@FindBy(xpath = "//XCUIElementTypeOther[contains(@name,'التقدم بطلب للحصول على منتج')]")
	WebElement ios_applyForProductInArabicButton;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='التقدم بطلب للحصول على منتج button']")
	WebElement applyForProductInArabicButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	WebElement confirmButton;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Confirm button'])[last()]")
	WebElement ios_confirmButton;

	public LandingPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}

	public void clickOnApplyForProductButton() {
			if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
				click(ios_applyForProductButton);
			}else {
				click(applyForProductButton);
			}
		
	}
	
	
	public void clickOnToArabicLangButton() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_toArabicLangButton);
		}else {
			click(toArabicLangButton);
		}
		try {
			if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
				click(ios_confirmButton);
			}else {
				click(confirmButton);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clickOnToEnglishLangButton() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_toEnglishLangButton);
		}else {
			click(toEnglishLangButton);
		}
	}

	public Boolean verifyWelcomeToRakBankDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_welcomeToRakBankTitle, defaultTimeForVisibility);
			return isElementDisplayed(ios_welcomeToRakBankTitle);
		}else {
			waitForElementVisibility(welcomeToRakBankTitle, defaultTimeForVisibility);
			return isElementDisplayed(welcomeToRakBankTitle);
		}
	}

	public Boolean verifyWelcomeToRakBankInArabicDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_welcomeToRakbankInArabicText, defaultTimeForVisibility);
			return isElementDisplayed(ios_welcomeToRakbankInArabicText);
		}else {
			waitForElementVisibility(welcomeToRakbankInArabicText, defaultTimeForVisibility);
			return isElementDisplayed(welcomeToRakbankInArabicText);
		}
	}

	public Boolean verifyApplyForProductInArabicButtonIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_applyForProductInArabicButton, defaultTimeForVisibility);
			return isElementDisplayed(ios_applyForProductInArabicButton);
		}else {
			waitForElementVisibility(applyForProductInArabicButton, defaultTimeForVisibility);
			return isElementDisplayed(applyForProductInArabicButton);
		}
		
	}

	

}
