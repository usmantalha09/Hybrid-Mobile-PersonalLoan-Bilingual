package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;

public class UploadDocumentsPage extends BaseClass {

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Share Emirates ID'])[last()]")
	WebElement ios_shareEmiratesIDButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Share Emirates ID']")
	WebElement shareEmiratesIDButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Upload']")
	WebElement uploadButton;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='undefined-upload-wrapper-0'])[last()]")
	WebElement ios_frontSideUploadEmiratesIDButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Front side']")
	WebElement frontSideUploadEmiratesIDButton;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='undefined-upload-wrapper-1'])[last()]")
	WebElement ios_backSideUploadEmiratesIDButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Back side']")
	WebElement backSideUploadEmiratesIDButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Share passport'])[last()]")
	WebElement ios_sharePassportButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Share passport']")
	WebElement sharePassportButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Passport photo page']")
	WebElement passportPhotoPageButton;

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Scan face'])[last()]")
	WebElement ios_scanFaceButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Scan face']")
	WebElement scanFaceButton;

	public UploadDocumentsPage() {
		PageFactory.initElements(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				this);
	}

	public void clickOnShareEmiratesIDButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_shareEmiratesIDButton);
		} else {
			click(shareEmiratesIDButton);
		}
	}
	
	public void clickOnFrontSideUploadEmiratesIDButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_frontSideUploadEmiratesIDButton);
		} else {
			click(frontSideUploadEmiratesIDButton);
		}
	}
	
	public void clickOnBackSideUploadEmiratesIDButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_backSideUploadEmiratesIDButton);
		} else {
			click(backSideUploadEmiratesIDButton);
		}
	}
	
	public void clickOnSharePassportButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_sharePassportButton);
		} else {
			click(sharePassportButton);
		}
	}
	
	
	
	

}
