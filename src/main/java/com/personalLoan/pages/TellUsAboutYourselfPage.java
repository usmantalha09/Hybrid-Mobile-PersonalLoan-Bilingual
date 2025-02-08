package com.personalLoan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.utilities.Waits;

import io.appium.java_client.android.nativekey.KeyEvent;

public class TellUsAboutYourselfPage extends BaseClass {

	@FindBy(xpath = "//XCUIElementTypeOther[@name='leftIcon']")
	WebElement ios_leftBackIcon;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='leftIcon']")
	WebElement leftBackIcon;

	@FindBy(xpath = "//XCUIElementTypeOther[contains(@name,'fullName')]")
	WebElement ios_fullNameInput;

	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'fullName')]//android.widget.EditText")
	WebElement fullNameInput;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-fullName-error']/XCUIElementTypeStaticText")
	WebElement ios_BlankNameError;

	@FindBy(xpath = "//android.widget.TextView[@text='Please enter your full name'] | //android.widget.TextView[@text='يرجى إدخال اسمك الكامل.']")
	WebElement BlankNameError;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-mobileNumber-touchable']")
	WebElement ios_mobileNumberInput;

	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'mobileNumber')]//following-sibling::android.widget.EditText")
	WebElement mobileNumberInput;

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Continue'])[last()] | (//XCUIElementTypeOther[@label='استمرار'])[last()]")
	WebElement ios_continueButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Continue'] | //android.widget.TextView[@text='استمرار']")
	WebElement continueButton;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'continue')])[last()] | (//XCUIElementTypeOther[contains(@label,'استمرار')])[last()]")
	WebElement ios_letsContinueButton;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'continue')] | //android.widget.TextView[contains(@text,'استمرار')]")
	WebElement letsContinueButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@label='Email address']| //XCUIElementTypeOther[@name='undefined-email-touchable']")
	WebElement ios_emailAddressInput;

	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'email')]//following-sibling::android.widget.EditText")
	WebElement emailAddressInput;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-nationality-touchable']")
	WebElement ios_nationalityDropdown;

	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'nationality-touchable')]//following-sibling::android.widget.EditText")
	WebElement nationalityDropdown;

	@FindBy(xpath = "//android.widget.TextView[@text='Expat']")
	WebElement nationalityExpatOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-0-onPress']")
	WebElement ios_nationalityExpatOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-1-onPress']")
	WebElement ios_nationalityUAENationalOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='UAE National']")
	WebElement nationalityUAENationalOption;

	@FindBy(xpath = "//XCUIElementTypeOther[contains(@name,'employmentStatus')]")
	WebElement ios_employmentStatusDropdown;

	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText")
	WebElement employmentStatusDropdown;

	@FindBy(xpath = "//android.widget.TextView[@text='Salaried']")
	WebElement employmentStatusSalariedOption;

	@FindBy(xpath = "//android.widget.TextView[@text='Pensioner']")
	WebElement employmentStatusPensionerOption;

	@FindBy(xpath = "//android.widget.TextView[@text='Salaried with a pension']")
	WebElement employmentStatusSalariedWithPensionerOption;

	@FindBy(xpath = "//android.widget.TextView[@text='Self-employed']")
	WebElement employmentStatusSelfEmployedOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-0-onPress']")
	WebElement ios_expatEmploymentStatusSalariedOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-1-onPress']")
	WebElement ios_expatEmploymentStatusSelfEmployedOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-1-onPress']")
	WebElement ios_uaeNationalEmploymentStatusSalariedOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-3-onPress']")
	WebElement ios_uaeNationalEmploymentStatusSelfEmployedOption;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-0-onPress']")
	WebElement ios_uaeNationalemploymentStatusPensionerOption;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-list-2-onPress']")
	WebElement ios_uaeNationalemploymentStatusSalariedWithPensionerOption;

	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-mobileNumber-error']/XCUIElementTypeStaticText")
	WebElement ios_BlankMobileError;

	@FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid phone number'] | //android.widget.TextView[@text='يرجى إدخال رقم هاتف ساري.']")
	WebElement BlankMobileError;

	@FindBy(xpath = "//XCUIElementTypeOther[contains(@name,'employerName-input')]")
	WebElement ios_employerNameDropdown;

	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'employerName')]//following-sibling::android.widget.EditText")
	WebElement employerNameDropdown;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-email-error']/XCUIElementTypeStaticText")
	WebElement ios_emailinlineErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid email address'] | //android.widget.TextView[@text='يرجى إدخال عنوان بريد إلكتروني ساري.']")
	WebElement emailinlineErrorMessage;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-employerName-input-main-touchable']")
	WebElement ios_employerNameInput;
	
	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'employerName')]//following-sibling::android.widget.EditText")
	WebElement employerNameInput;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-salary-touchable']")
	WebElement ios_employeeSalaryInput;
	
	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'salary')]//following-sibling::android.widget.EditText")
	WebElement employeeSalaryInput;
	
	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'employerName-search')]//following-sibling::android.widget.EditText")
	WebElement employmentnameSearch;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-employerName-search-input-container']")
	WebElement ios_employmentnameSearch;
	
	@FindBy(xpath = "//android.widget.TextView[@text='LOCAL GOVERNMENT - DXB - OTHER']")
	WebElement employmentnameSearchLocalGovernmentOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-employerName-list-item-0-onPress']")
	WebElement ios_employmentnameSearchLocalGovernmentOption;

	@FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'pensioner')]//following-sibling::android.widget.EditText")
	WebElement employeePensionInput;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-pensioner-touchable']")
	WebElement ios_employeePensionInput;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@label='Start over'] | //XCUIElementTypeOther[@label='البدء من جديد']")	
	
	WebElement ios_startOverButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Start over'] | //android.widget.TextView[@text='البدء من جديد'] ")
	WebElement startOverButton;
	
	
	
	///////////////

	@FindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'inputValue') and @text='-'])[1]")
	WebElement otpFirstInput;

//	@FindBy(xpath = "//android.widget.TextView[@text='Get estimate']")
//	WebElement getEstimateButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='View documents']")
//	WebElement viewDocumentButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Share Emirates ID']")
//	WebElement shareEmieatesIDButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Upload']")
//	WebElement uploadButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Front side']")
//	WebElement frontSideUploadEmiratesIDButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Back side']")
//	WebElement backSideUploadEmiratesIDButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Submit']")
//	WebElement submitButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Share passport']")
//	WebElement sharePassportButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Passport photo page']")
//	WebElement passportPhotoPageButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text='Scan face']")
//	WebElement scanFaceButton;
//
//	@FindBy(xpath = "//android.widget.TextView[@text=\"I'm ready\"]")
//	WebElement iMReadyButton;
	/////////////////////////////////////////////////////////////////////

	public TellUsAboutYourselfPage() {
		PageFactory.initElements(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				this);
	}

	public void clickOnLeftBackIcon() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_leftBackIcon);
		} else {
			click(leftBackIcon);
		}
	}

	public boolean verifyTellUsPageIsDisplaying() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_fullNameInput, 30);
			return isElementDisplayed(ios_fullNameInput);
		} else {
			waitForElementVisibility(fullNameInput, 30);
			return isElementDisplayed(fullNameInput);
		}

	}

	public void enterFullName(String name) {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_fullNameInput, name);

		} else {
			sendKeysToWebElement(fullNameInput, name);
		}

	}

	public void enterMobileNumber(String mobile) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_mobileNumberInput, mobile);
			ios_mobileNumberInput.sendKeys(Keys.RETURN);
		} else {
			click(mobileNumberInput);
			char[] list = mobile.toCharArray();
			for (char val : list) {
				getAndroidDriver().pressKey(new KeyEvent(getAndroidKey(val)));
			}
		}

	}

	public void clickOnContinueButton() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_continueButton);
		} else {
			click(continueButton);
		}

	}
	
	public void clickOnLetsContinueButton() {
		Waits.wait2s();
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_letsContinueButton);
		} else {
			click(letsContinueButton);
		}

	}
	
	
	
	public void clickOnContinueComebackJourneyButton() {
		Waits.wait3s();
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			ios_continueButton.click();
//			click(ios_continueButton);
		} else {
			click(continueButton);
		}

	}

	public void enterEmailAddress(String email) {
		Waits.wait6s();
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			
			click(ios_emailAddressInput);
			sendKeysToWebElement(ios_emailAddressInput, email);
		} else {
			emailAddressInput.clear();
			sendKeysToWebElement(emailAddressInput, email);
		}

	}

	public void selectExpatNationality() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_nationalityDropdown);
			click(ios_nationalityExpatOption);
		} else {
			try {
				nationalityDropdown.click();
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'nationality-touchable')]//following-sibling::android.widget.EditText"))
						.click();
			}
			click(nationalityExpatOption);
		}
	}

	public void selectUAENationality() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_nationalityDropdown);
			click(ios_nationalityUAENationalOption);
		} else {
			try {
				nationalityDropdown.click();
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'nationality-touchable')]//following-sibling::android.widget.EditText")).click();
			}
			click(nationalityUAENationalOption);
		}
	}

	public void selectExpatSalariedEmploymentStatus() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employmentStatusDropdown);
			click(ios_expatEmploymentStatusSalariedOption);
		} else {
			try {
				click(employmentStatusDropdown);
				click(employmentStatusSalariedOption);
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText')]"))
						.click();
				click(employmentStatusSalariedOption);
			}
		}

	}
	
	public void selectExpatSelfEmployedEmploymentStatus() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employmentStatusDropdown);
			click(ios_expatEmploymentStatusSelfEmployedOption);
		} else {
			try {
				click(employmentStatusDropdown);
				click(employmentStatusSelfEmployedOption);
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText')]"))
						.click();
				click(employmentStatusSelfEmployedOption);
			}
		}

	}
	
	
	public void selectUAENationalSalariedEmploymentStatus() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employmentStatusDropdown);
			click(ios_uaeNationalEmploymentStatusSalariedOption);
		} else {
			try {
				click(employmentStatusDropdown);
				click(employmentStatusSalariedOption);
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText')]"))
						.click();
				click(employmentStatusSalariedOption);
			}
		}

	}

	public void selectUAENationalPensionerEmploymentStatus() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employmentStatusDropdown);
			click(ios_uaeNationalemploymentStatusPensionerOption);
		} else {
			try {
				click(employmentStatusDropdown);
				click(employmentStatusPensionerOption);
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText')]"))
						.click();
				click(employmentStatusPensionerOption);
			}
		}

	}

	public void selectUAENationalSelfEmployeedEmploymentStatus() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employmentStatusDropdown);
			click(ios_uaeNationalEmploymentStatusSelfEmployedOption);
		} else {
			try {
				click(employmentStatusDropdown);
				click(employmentStatusSelfEmployedOption);
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText')]"))
						.click();
				click(employmentStatusSelfEmployedOption);
			}
		}

	}
	
	public void selectUAENationalSalariedWithPensionerEmploymentStatus() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employmentStatusDropdown);
			click(ios_uaeNationalemploymentStatusSalariedWithPensionerOption);
		} else {
			try {
				click(employmentStatusDropdown);
				click(employmentStatusSalariedWithPensionerOption);
			} catch (Exception e) {
				getAndroidDriver().findElement(By.xpath(
						"//android.view.ViewGroup[contains(@resource-id,'employmentStatus')]//following-sibling::android.widget.EditText')]"))
						.click();
				click(employmentStatusSalariedWithPensionerOption);
			}
		}

	}
	
	public void clickOnEmployerNameDropdown(String name) {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			
			click(ios_employerNameDropdown);
		} else {
			click(employerNameInput);
		}

	}
	
	

	public boolean verifyinvalidEmailInlineError() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_emailinlineErrorMessage, 30);
			return isElementDisplayed(ios_emailinlineErrorMessage);
		}else {
			waitForElementVisibility(emailinlineErrorMessage, 30);
			return isElementDisplayed(emailinlineErrorMessage);
		}
		
	}

	public void SearchAndSelectEmployer(String name) {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employerNameInput);
			sendKeysToWebElement(ios_employmentnameSearch, name);
			click(ios_employmentnameSearchLocalGovernmentOption);
		}else {
			try {
				employerNameInput.click();
				employmentnameSearch.click();
				char[] list = name.toLowerCase().toCharArray();
				for (char val : list) {
					getAndroidDriver().pressKey(new KeyEvent(getAndroidKey(val)));
				}
	

			} catch (Exception e) {
				e.printStackTrace();
				click(employerNameInput);
				sendKeysToWebElement(employmentnameSearch, name);	

			}
			click(employmentnameSearchLocalGovernmentOption);
		}
		
	}
	
	public void enterSalary(String salary) {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employeeSalaryInput);
			sendKeysToWebElement(ios_employeeSalaryInput, salary);
		} else {
			employeeSalaryInput.clear();
			sendKeysToWebElement(employeeSalaryInput, salary);
		}

	}
	
	public void enterPension(String pension) {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_employeePensionInput);
			sendKeysToWebElement(ios_employeePensionInput, pension);
		} else {
			employeePensionInput.clear();
			sendKeysToWebElement(employeePensionInput, pension);
		}

	}
	
	public boolean verifyContinueButtonIsDisabled() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			return ios_continueButton.getAttribute("clickable").toLowerCase().equalsIgnoreCase("false");
		} else {
			return continueButton.getAttribute("clickable").toLowerCase().equalsIgnoreCase("false");
			
		}
	}
	
	public boolean verifyContinueButtonIsEnabled() {
		if(ExtentListeners.currentTestMethodName.contains("InArabic")) {
			scrollToText("استمرار");
		}else{
			scrollToText("Continue");
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			return ios_continueButton.getAttribute("clickable").toLowerCase().equalsIgnoreCase("true");
		} else {
			return continueButton.getAttribute("clickable").toLowerCase().equalsIgnoreCase("true");
			
		}
	}
	
	
	public boolean verifyFullNameFieldIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_fullNameInput, 30);
			return isElementDisplayed(ios_fullNameInput);
		}else {
			waitForElementVisibility(fullNameInput, 30);
			return isElementDisplayed(fullNameInput);
		}
		
	}
	
	public boolean verifyMobileNumberFieldIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_mobileNumberInput, 30);
			return isElementDisplayed(ios_mobileNumberInput);
		}else {
			waitForElementVisibility(mobileNumberInput, 30);
			return isElementDisplayed(mobileNumberInput);
		}
		
	}
	
	public void clickOnFullNameInput() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_fullNameInput);
		} else {
			click(fullNameInput);
		}

	}
	
	public void clickOnMobileNumberInput() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_mobileNumberInput);
		} else {
			click(mobileNumberInput);
		}

	}
	
	public boolean verifyBlankFullNameFieldErrorMessageIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_BlankNameError, 30);
			return isElementDisplayed(ios_BlankNameError);
		}else {
			waitForElementVisibility(BlankNameError, 30);
			return isElementDisplayed(BlankNameError);
		}
		
	}
	
	public boolean verifyBlankMobileNumberFieldErrorMessageIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_BlankMobileError, 30);
			return isElementDisplayed(ios_BlankMobileError);
		}else {
			waitForElementVisibility(BlankMobileError, 30);
			return isElementDisplayed(BlankMobileError);
		}
		
	}
	
	public boolean verifyEmailFieldIsDisplaying() {
		Waits.wait5s();
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			return isElementDisplayed(ios_emailAddressInput);
		} else {
			return isElementDisplayed(emailAddressInput);
		}

	}
	
	public void removeMobileNumberFromField() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			for(int i = 1; i<=9; i++) {
				ios_mobileNumberInput.sendKeys(Keys.BACK_SPACE);
			}
			
		} else {
			click(mobileNumberInput);
			mobileNumberInput.clear();
		}

	}
	public boolean verifyStartOverJourneyPopupIsDisplaying() {
		if(platformName.toLowerCase().equalsIgnoreCase("ios")) {
			waitForElementVisibility(ios_startOverButton, 30);
			return isElementDisplayed(ios_startOverButton);
		}else {
			waitForElementVisibility(startOverButton, 30);
			return isElementDisplayed(startOverButton);
		}
	}


}
