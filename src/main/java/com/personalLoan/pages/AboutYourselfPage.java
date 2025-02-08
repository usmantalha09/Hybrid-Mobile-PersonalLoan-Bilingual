package com.personalLoan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.personalLoan.base.BaseClass;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.utilities.GenericUtilities;
import com.personalLoan.utilities.Waits;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AboutYourselfPage extends BaseClass {

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-enterIban-touchable']")
	WebElement ios_enterIban;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-enterIban-icon']//following-sibling::android.widget.EditText")
	WebElement enterIban;

	@FindBy(xpath = "(//XCUIElementTypeOther[@label='Verify salary'])[last()] | (//XCUIElementTypeOther[@label='التحقق من الراتب'])[last()]")
	WebElement ios_VerifySalaryButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Verify salary'] | //android.widget.TextView[@text='التحقق من الراتب']")
	WebElement VerifySalaryButton;


	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-villaName-touchable']")
	WebElement ios_villaName;

	@FindBy(xpath = "//android.widget.TextView[@text='Building or villa name']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='اسم المبنى أو الفيلا']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement villaName;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-villaNo-touchable']")
	WebElement ios_villaNo;

	@FindBy(xpath = "//android.widget.TextView[@text='Building or villa number']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='رقم المبنى أو الفيلا']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement villaNo;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-streetName-touchable']")
	WebElement ios_streetName;

	@FindBy(xpath = "//android.widget.TextView[@text='Street or area name']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='اسم الشارع أو المنطقة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement streetName;

	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-city-input-main-touchable']")
	WebElement ios_cityInput;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-city-input-main-touchable'] | //android.widget.TextView[@text='المدينة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement cityInput;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-city-input-main-list-0-onPress']")
	WebElement ios_firstCity;

	@FindBy(xpath = "//android.widget.TextView[@text='Dubai']")
	WebElement firstCity;
	

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-poBox-touchable']")
	WebElement ios_poBox;

	@FindBy(xpath = "//android.widget.TextView[@text='P.O. Box']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='صندوق البريد']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement poBox;


	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-homeCountry-input-main-touchable']")
	WebElement ios_homeCountryInput;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-homeCountry-input-main-touchable'] | //android.widget.TextView[@text='الموطن']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement homeCountryInput;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='undefined-homeCountry-search-input-container']")
	WebElement ios_homeCountrySearchInput;

	@FindBy(xpath = "//android.widget.EditText[@text='Enter at least 4 characters'] | //android.widget.EditText[@text=\"يرجى إدخال 4 أحرف على الأقل\"]")
	WebElement homeCountrySearchInput;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-jobTitle-list-item-0-onPress']")
	WebElement ios_homeCountryFirstOption;

	@FindBy(xpath = "//android.widget.TextView[@text='United Arab Emirates']")
	WebElement homeCountryFirstOption;

	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-houseName-touchable']")
	WebElement ios_houseName;

	@FindBy(xpath = "//android.widget.TextView[@text='House or apartment name']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='اسم المنزل أو الشقة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement houseName;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-houseNo-touchable']")
	WebElement ios_houseNo;

	@FindBy(xpath = "//android.widget.TextView[@text='House or apartment number']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='رقم المنزل أو الشقة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement houseNo;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-areaName-touchable']")
	WebElement ios_areaName;

	@FindBy(xpath = "//android.widget.TextView[@text='Street or area name']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='اسم الشارع أو المنطقة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement areaName;	
	

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-cityTown-input-main-touchable']")
	WebElement ios_cityTownInput;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-cityTown-input-main-touchable'] | //android.widget.TextView[@text='المدينة أو البلدة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement cityTownInput;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='undefined-cityTown-search-input-container']")
	WebElement ios_cityTownSearchInput;

	@FindBy(xpath = "//android.widget.EditText[@text='Enter at least 4 characters'] | //android.widget.EditText[@text=\"يرجى إدخال 4 أحرف على الأقل\"]")
	WebElement cityTownSearchInput;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-jobTitle-list-item-0-onPress']")
	WebElement ios_cityTownFirstOption;

	@FindBy(xpath = "//android.widget.TextView[@text='Dubai'] | //android.widget.TextView[@text='DUBAI']")
	WebElement cityTownFirstOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-postalCode-touchable']")
	WebElement ios_postalCode;

	@FindBy(xpath = "//android.widget.TextView[@text='Postal or zip code']//following-sibling::android.widget.EditText | //android.widget.TextView[@text='الرمز البريدي أو رمز المنطقة']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement postalCode;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-mobileNumber-touchable']")
	WebElement ios_mobileNumber;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Enter mobile number')]//following-sibling::android.widget.EditText | //android.widget.TextView[@text='يرجى إدخال رقم الهاتف المحمول (بما في ذلك رمز الدولة)']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement mobileNumber;
	
	//Citizenship and Tax Details
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-nationality-input-main-touchable']")
	WebElement ios_birthCountryInput;

	@FindBy(xpath = "//android.widget.TextView[@text=\"What’s your country of birth?\"] | //android.widget.TextView[@text='ما هي دولة ميلادك؟']//parent::android.view.ViewGroup//android.widget.EditText")
	WebElement birthCountryInput;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='undefined-nationality-search-input-container']")
	WebElement ios_birthCountrySearchInput;

	@FindBy(xpath = "//android.widget.EditText[@text='Enter at least 4 characters'] | //android.widget.EditText[@text=\"يرجى إدخال 4 أحرف على الأقل\"]")
	WebElement birthCountrySearchInput;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-jobTitle-list-item-0-onPress']")
	WebElement ios_birthCountryFirstOption;

	@FindBy(xpath = "//android.widget.TextView[@text='United Arab Emirates']")
	WebElement birthCountryFirstOption;
	
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-dualNationality-item1']")
	WebElement ios_dualNationalityNoOption;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-dualNationality-item1']")
	WebElement dualNationalityNoOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-usCitizenGreenCard-item1']")
	WebElement ios_USCitizenNoOption;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='undefined-usCitizenGreenCard-item1']")
	WebElement USCitizenNoOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-usRelation-item-0-label']")
	WebElement ios_UsRelationYesOption;

	@FindBy(xpath = "//android.widget.TextView[@resource-id='undefined-usRelation-item-0-label']")
	WebElement UsRelationYesOption;
	
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-uaeTaxResident-item-0-label']")
	WebElement ios_uaeTaxResidentYesOption;

	@FindBy(xpath = "//android.widget.TextView[@resource-id='undefined-uaeTaxResident-item-0-label']")
	WebElement uaeTaxResidentYesOption;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='undefined-taxPayableInOtherCntry-item-1-label']")
	WebElement ios_taxPayableInOtherCntryNoOption;

	@FindBy(xpath = "//android.widget.TextView[@resource-id='undefined-taxPayableInOtherCntry-item-1-label']")
	WebElement taxPayableInOtherCntryNoOption;
	
	

	
	

	

	
	



	public AboutYourselfPage() {
		PageFactory.initElements(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				this);
	}



	public void enterIban(String iban) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_enterIban, iban);
		} else {
			sendKeysToWebElement(enterIban, iban);
		}
	}
	
	public void clickOnVerifySalaryButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_VerifySalaryButton);
		} else {
			click(VerifySalaryButton);

		}
	}	

	public void enterVillaName(String Name) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_villaName, Name);
		} else {
			sendKeysToWebElement(villaName, Name);
		}
	}
	
	
	public void enterVillaNumber(String Number) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_villaNo, Number);
		} else {
			sendKeysToWebElement(villaNo, Number);
		}
	}
	
	public void enterStreetName(String Number) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_streetName, Number);
		} else {
			sendKeysToWebElement(streetName, Number);
		}
	}
	
	public void selectCity() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_cityInput);
			click(ios_firstCity);
		} else {
			click(cityInput);
			click(firstCity);
		}
	}
	
	public void enterPoBox(String Number) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_poBox, Number);
		} else {
			sendKeysToWebElement(poBox, Number);
		}
	}
	
	
	public void selectHomeCountry(String country) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_homeCountryInput);
			homeCountrySearchInput.sendKeys(country);
			click(ios_homeCountryFirstOption);
		} else {
			click(homeCountryInput);
			homeCountrySearchInput.sendKeys(country);
			click(homeCountryFirstOption);
		}
	}
	
	public void selectBirthCountry(String country) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_birthCountryInput);
			birthCountrySearchInput.sendKeys(country);
			click(ios_birthCountryFirstOption);
		} else {
			click(birthCountryInput);
			birthCountrySearchInput.sendKeys(country);
			click(birthCountryFirstOption);
		}
	}

	public void enterHouseNameInput(String val) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_houseName, val);
		} else {
			sendKeysToWebElement(houseName, val);
		}
	}
	
	public void enterHouseNoInput(String val) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_houseNo, val);
		} else {
			sendKeysToWebElement(houseNo, val);
		}
	}
	
	public void enterAreaNameInput(String val) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_areaName, val);
		} else {
			sendKeysToWebElement(areaName, val);
		}
	}
	
	public void selectCityTown(String city) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_cityTownInput);
			cityTownSearchInput.sendKeys(city);
			click(ios_cityTownFirstOption);
		} else {
			click(cityTownInput);
			cityTownSearchInput.sendKeys(city);
			click(cityTownFirstOption);
		}
	}
	
	public void enterPostalCodeInput(String val) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_postalCode, val);
		} else {
			sendKeysToWebElement(postalCode, val);
		}
	}
	
	public void enterMobileNumberInput(String val) {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			sendKeysToWebElement(ios_mobileNumber, val);
		} else {
			sendKeysToWebElement(mobileNumber, val);
		}
	}

	public void clickOnDualNationality_NoRadioButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_dualNationalityNoOption);
		} else {
			click(dualNationalityNoOption);
		}
	}
	
	public void clickOnUSCitizen_NoRadioButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_USCitizenNoOption);
		} else {
			click(USCitizenNoOption);
		}
	}
	
	public void clickOnUSRelation_YesRadioButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_UsRelationYesOption);
		} else {
			click(UsRelationYesOption);
		}
	}
	
	public void clickOnUaeTaxResident_YesRadioButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_uaeTaxResidentYesOption);
		} else {
			click(uaeTaxResidentYesOption);
		}
	}
	
	public void clickOntaxPayableInOtherCntry_NoRadioButton() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			click(ios_taxPayableInOtherCntryNoOption);
		} else {
			click(taxPayableInOtherCntryNoOption);
		}
	}


}
