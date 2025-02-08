package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.utilities.Waits;


public class TermsConditinonPage extends BaseClass {
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Accept and continue'])[last()] | (//XCUIElementTypeOther[@label='قبول واستمرار'])[last()]")
	WebElement ios_termConditionButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Accept and continue'] | //android.widget.TextView[@text=\"قبول واستمرار\"]")
	WebElement termConditionButton;

	public TermsConditinonPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}
	
	
	public void clickOnAcceptTermsConditionButtonWithSingleScroll() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			for(int i = 0; i<=3; i++) {
				scrollDownToEnd(iosDriver);
			}
			click(ios_termConditionButton);
		}else {
			for(int i = 0; i<=3; i++) {
				scrollToBottom(androidDriver);
			}
			click(termConditionButton);
		}
	}
	
	public void clickOnAcceptTermsConditionButtonWithMultipleScroll() {
		Waits.wait5s();
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			for(int i = 0; i<=38; i++) {
				scrollDownToEnd(iosDriver);
			}
			click(ios_termConditionButton);
		}else {
			for(int i = 0; i<=10; i++) {
				scrollToBottom(androidDriver);
			}
			click(termConditionButton);
		}
	}


}
