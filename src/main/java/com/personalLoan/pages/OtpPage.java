package com.personalLoan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.utilities.Waits;

import io.appium.java_client.android.nativekey.KeyEvent;


public class OtpPage extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='Enter your OTP'] | //android.widget.TextView[@text='يرجى إدخال كلمة المرور لمرة واحدة']")
	WebElement OtpPageTitle;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='title']")
	WebElement ios_OtpPageTitle;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='leftIcon']")
	WebElement ios_leftBackIcon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='leftIcon']")
	WebElement leftBackIcon;
	
	@FindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'inputValue') and @text='-'])[1]")
	WebElement otpFirstInput;
	
	
	

	public OtpPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}
	

	public boolean verifyOtpPageTitleIsDisplaying(){
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_OtpPageTitle,30);
	        return isElementDisplayed(ios_OtpPageTitle);
		}else {
			waitForElementVisibility(OtpPageTitle,30);
	        return isElementDisplayed(OtpPageTitle);
		}
    	
    }
	
	public void clickOnLeftBackIcon() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_leftBackIcon);
		}else {
			click(leftBackIcon);
		}
	}
	public void enterOTP(String otp) {
		char[] otplist = otp.toCharArray();
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			for(int i = 0 ; i<6; i++) {
				Waits.wait1s();
				WebElement ele = getIOSDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name='undefined-input-box"+i+"-inputValue']"));
				ele.click();
				ele.sendKeys(String.valueOf(otplist[i]));
//				sendKeysToWebElement(ele, String.valueOf(otplist[i]));
			}
		}else {
			try {
				click(otpFirstInput);
			} catch (Exception e) {
				otpFirstInput.click();
			}

			for (char val : otplist) {
				getAndroidDriver().pressKey(new KeyEvent(getAndroidKey(val)));
				Waits.wait1s();
			}
		}
	}

}
