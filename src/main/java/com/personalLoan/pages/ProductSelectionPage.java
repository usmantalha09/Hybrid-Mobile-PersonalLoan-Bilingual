package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;



public class ProductSelectionPage extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='What are you interested in?'] | //android.widget.TextView[@text='ما الذي تهتم به؟']")
	WebElement productSelectionPageTitle;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='title']")
	WebElement ios_productSelectionPageTitle;
	

	public ProductSelectionPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}
	
	public boolean verifyProductSelectionPageTitleIsDisplaying(){
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_productSelectionPageTitle,30);
	        return isElementDisplayed(ios_productSelectionPageTitle);
		}else {
			waitForElementVisibility(productSelectionPageTitle,30);
	        return isElementDisplayed(productSelectionPageTitle);
		}
    	
    }
	
	
}
