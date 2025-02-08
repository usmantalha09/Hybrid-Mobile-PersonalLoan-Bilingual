package com.personalLoan.base;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import org.testng.asserts.SoftAssert;
import com.personalLoan.listeners.ExtentListeners;
import com.personalLoan.utilities.GenericUtilities;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.ios.IOSDriver;

public class BaseClass extends GenericUtilities {

	public static AndroidDriver<MobileElement> androidDriver;
	public static IOSDriver<MobileElement> iosDriver;

	public static void initReport() {
		extentReport = ExtentListeners.testReport.get();
		softAssert = new SoftAssert();
	}

	public static void initConfiguration() {

		if (extentReport == null) {
			initReport();
		}
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {

			// IOS driver
			IOSDriverInstance();
		} else if (platformName.toLowerCase().equalsIgnoreCase("android")) {
			
			// Android driver
			AndroidDriverInstance();
		} else {
			throw new SkipException("Unknown driver type");
		}
	}

	public static IOSDriver<MobileElement> IOSDriverInstance() {
		try {
			if (runOnLocal) {
				String buildPath = System.getProperty("user.dir") + "/src/test/resources/executables/Digital_App_"
						+ buildNumber + ".ipa";
				final String URL_STRING = "http://127.0.0.1:4723/wd/hub	";
				url = new URL(URL_STRING);
				capabilities = new DesiredCapabilities();
				capabilities.setCapability("deviceName", "iPhone 12 Pro");
				capabilities.setCapability("platformVersion", "15");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
				capabilities.setCapability(MobileCapabilityType.APP, buildPath);
				capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
				capabilities.setCapability("autoAcceptAlerts", "true");
				capabilities.setCapability("autoGrantPermissions", "true");
				capabilities.setCapability("systemPort", "8201");
				capabilities.setCapability("wdaStartupRetries", "4");
				capabilities.setCapability("iosInstallPause", "8000");
				capabilities.setCapability("wdaStartupRetryInterval", "20000");
				// capabilities.setCapability("udid", "device UDID");
				capabilities.setCapability("usePrebuiltWDA", "true");
				iosDriver = new IOSDriver<MobileElement>(url, capabilities);
				printString("Running on Local Machine");

			} else {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("os_version", "16");
				capabilities.setCapability("device", iosDeviceName);
				capabilities.setCapability("app", iosApplication);
				capabilities.setCapability("project", "Rakbank Personal Loan App");
				capabilities.setCapability("build", "IOS Tests Run on " + ExtentListeners.currentDateString);
				capabilities.setCapability("browserstack.idleTimeout", "600000");
				capabilities.setCapability("browserstack.debug", "true");
				capabilities.setCapability("autoAcceptAlerts", "true");
				iosDriver = new IOSDriver<MobileElement>(
						new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"),
						capabilities);
				printString("Running on BrowserStack");
			}
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			System.err.println(e.getMessage() + "\n\n" + e.getStackTrace());
		}
		System.out.println("IOS Application Started");
		return iosDriver;

	}

	public static AndroidDriver<MobileElement> AndroidDriverInstance() {
		try {
			String buildPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
					+ File.separator + "resources" + File.separator + "executables" + File.separator + "Digital_App_"
					+ buildNumber + ".apk";
			final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
			url = new URL(URL_STRING);
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 12000);
			capabilities.setCapability(MobileCapabilityType.APP, buildPath);
			capabilities.setCapability("ignoreUnimportantViews", true);
			capabilities.setCapability("disableAndroidWatchers", true);
			capabilities.setCapability("newCommandTimeout", 0);
			capabilities.setCapability("automationName", "uiautomator2");
			capabilities.setCapability("autoGrantPermissions", "true");
			capabilities.setCapability("appPackage", "com.rak");
			capabilities.setCapability("appActivity", "com.rak.SplashActivity");
			capabilities.setCapability("noReset", false);
			androidDriver = new AndroidDriver<MobileElement>(url, capabilities);
			androidDriver.manage().timeouts().implicitlyWait(
					Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")), TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			System.err.println(e.getMessage() + "\n\n" + e.getStackTrace());
		}
		System.out.println("Android Application Started");
		return androidDriver;
	}

	public static AndroidDriver<MobileElement> getAndroidDriver() {
		return androidDriver;
	}

	public static IOSDriver<MobileElement> getIOSDriver() {
		return iosDriver;
	}

	
	@AfterTest
	public void tearDown() {
		// driver.quit();
	}


}
