package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;


public class GetEstimatePage extends BaseClass {
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Get estimate'])[last()] | (//XCUIElementTypeOther[@label='احصل على تقدير'])[last()]")
	WebElement ios_getEstimateButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Get estimate'] | //android.widget.TextView[@text=\"احصل على تقدير\"]")
	WebElement getEstimateButton;

	public GetEstimatePage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}
	
	
	public void clickOnGetEstimate() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("احصل على تقدير");
		}else{
			scrollToText("Get estimate");
		}
		
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_getEstimateButton);
		}else {
			click(getEstimateButton);
		}
	}


}
