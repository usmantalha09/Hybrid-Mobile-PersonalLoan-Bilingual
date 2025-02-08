package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;


public class ViewDocumentsPage extends BaseClass {
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@label='View documents'])[last()] | (//XCUIElementTypeOther[@label='عرض المستندات'])[last()]")
	WebElement ios_viewDocumentButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='View documents'] | //android.widget.TextView[@text=\"عرض المستندات\"]")
	WebElement viewDocumentButton;

	public ViewDocumentsPage() {
		PageFactory.initElements(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver, this);
	}
	
	
	public void clickOnViewDocumentButton() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("عرض المستندات");
		}else{
			scrollToText("View documents");
		}
		
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_viewDocumentButton);
		}else {
			click(viewDocumentButton);
		}
	}


}
