package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;

public class BankingPreferencesPage extends BaseClass {

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='title']")
	WebElement ios_bankingPreferencesPageTitle;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'banking preference')] | //android.widget.TextView[@text=\"ما الخدمات المصرفية التي تفضلها؟\"]")
	WebElement bankingPreferencesPageTitle;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined1-onPress']")
	WebElement ios_rakbankButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Accounts and products based on conventional banking.'] | //android.widget.TextView[@text=\"الحسابات والمنتجات البنكية التقليدية\"]")
	WebElement rakbankButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined0-onPress']")
	WebElement ios_rakbankIslamicButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Accounts and products based on the principles of Sharia.'] | //android.widget.TextView[@text=\"الحسابات والمنتجات المتوافقة مع مبادئ الشريعة الإسلامية\"]")
	WebElement rakbankIslamicButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='leftIcon']")
	WebElement ios_leftBackIcon;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='leftIcon']")
	WebElement leftBackIcon;

	public BankingPreferencesPage() {
		PageFactory.initElements(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				this);
	}

	public Boolean verifyBankingPreferencesPageTitleIsDisplaying() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_bankingPreferencesPageTitle, defaultTimeForVisibility);
			return isElementDisplayed(ios_bankingPreferencesPageTitle);
		} else {
			waitForElementVisibility(bankingPreferencesPageTitle, defaultTimeForVisibility);
			return isElementDisplayed(bankingPreferencesPageTitle);
		}

	}
	
	public Boolean verifyRakbankButtonIsDisplaying() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_rakbankButton, defaultTimeForVisibility);
			return isElementDisplayed(ios_rakbankButton);
		} else {
			waitForElementVisibility(rakbankButton, defaultTimeForVisibility);
			return isElementDisplayed(rakbankButton);
		}

	}
	
	public Boolean verifyRakbankIslamicButtonIsDisplaying() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_rakbankIslamicButton, defaultTimeForVisibility);
			return isElementDisplayed(ios_rakbankIslamicButton);
		} else {
			waitForElementVisibility(rakbankIslamicButton, defaultTimeForVisibility);
			return isElementDisplayed(rakbankIslamicButton);
		}

	}

	public void clickOnRakbankButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_rakbankButton);
		} else {
			click(rakbankButton);
		}

	}

	public void clickOnRakbankIslamicButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_rakbankIslamicButton);
		} else {
			click(rakbankIslamicButton);
		}

	}

	public void clickOnLeftBackIcon() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_leftBackIcon);
		} else {
			click(leftBackIcon);
		}
	}
}
