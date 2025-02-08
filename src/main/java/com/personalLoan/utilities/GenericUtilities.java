package com.personalLoan.utilities;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;

import com.personalLoan.base.BaseClass;
import com.personalLoan.base.PropertiesReader;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import net.coobird.thumbnailator.Thumbnails;

public class GenericUtilities extends Constant {

	public static String screenshotPath;
	public static String screenshotName;

	public void runApplicationInBackground(int DurationInSeconds) {

		if (platformName.equalsIgnoreCase("ios")) {
			BaseClass.getIOSDriver().runAppInBackground(Duration.ofSeconds(DurationInSeconds));
		} else {
			BaseClass.getAndroidDriver().runAppInBackground(Duration.ofSeconds(DurationInSeconds));
		}
	}

	public void terminateApplication(String packageName) {
		if (platformName.equalsIgnoreCase("ios")) {
			BaseClass.getIOSDriver().terminateApp(packageName);
		} else {
			BaseClass.getAndroidDriver().terminateApp(packageName);
		}
	}

	public void activateApplication(String packageName) {
		if (platformName.equalsIgnoreCase("ios")) {
			BaseClass.getIOSDriver().activateApp(packageName);
		} else {
			BaseClass.getAndroidDriver().activateApp(packageName);
		}
	}

	public static String removeDollarandSpaces(String amount) {
		printString("Amount :  " + amount);
		if (amount.contains("$")) {
			amount = amount.replace("$", "").trim();
			printString("Remove Dollar :  " + amount);
		}
		if (amount.contains(",")) {
			amount = amount.replace(",", "").trim();
			printString("Remove Dollar :  " + amount);
		}

		return amount.trim();
	}

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) (platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver
				: BaseClass.androidDriver)).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "/target/surefire-reports/html/" + screenshotName));

	}

	private static String[][] convertToArray(List<List<Object>> data) {
		String[][] array = new String[data.size()][];

		int i = 0;
		for (List<Object> row : data) {
			array[i++] = row.toArray(new String[row.size()]);
		}
		return array;
	}

	//// Universal Methods///

	public static void waitForElementVisibility(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement by, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.getIOSDriver()
						: BaseClass.getAndroidDriver(),
				timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static void waitForElementInvisibility(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(
				platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.iosDriver : BaseClass.androidDriver,
				timeoutInSeconds);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void click(WebElement element) {
		try {
			waitForElementVisibility(element, Integer.parseInt(PropertiesReader.getPropertyValue("visibilityTime")));
			waitForElementToBeClickable(element, Integer.parseInt(PropertiesReader.getPropertyValue("clickableTime")));
			element.click();
		} catch (Exception e) {
			element.click();
		}
	}
	

	public void sendKeysToWebElement(WebElement element, String keys) {
		waitForElementVisibility(element, defaultTimeForVisibility);
		element.click();
		element.clear();
		element.sendKeys(keys);
		Waits.wait1s();
		if (platformName.equalsIgnoreCase("ios")) {
			try {
				BaseClass.getIOSDriver().hideKeyboard();
				System.out.print("hideKeyboard in IOS is not working moving to exception");
			} catch (Exception e) {
				try {
					BaseClass.getIOSDriver().findElement(By.xpath("//XCUIElementTypeButton[@label='Done']")).click();
				}catch (Exception e1) {
					TouchAction touchAction = new TouchAction(BaseClass.getIOSDriver());
					touchAction.tap(PointOption.point(700, 10)).perform();
				}


			}

		} else {
			BaseClass.getAndroidDriver().hideKeyboard();
		}
	}

	public void appRunInBackGround() {
		(platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.getIOSDriver() : BaseClass.getAndroidDriver())
				.runAppInBackground(Duration.ofSeconds(1));
	}

	public void killApplication() {
		(platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.getIOSDriver() : BaseClass.getAndroidDriver())
				.closeApp();
		(platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.getIOSDriver() : BaseClass.getAndroidDriver())
				.quit();
	}

	public void launchApplication() {
		(platformName.toLowerCase().equalsIgnoreCase("ios") ? BaseClass.getIOSDriver() : BaseClass.getAndroidDriver())
				.launchApp();
	}

	public static void printString(String message) {
		try {
			System.out.println(message);
		} catch (Exception e) {
			System.err.println(e.getMessage() + "\n\n" + e.getStackTrace());
		}
	}

	public String getElementText(WebElement element) {
		return element.getText();
	}

	public boolean isElementSelected(WebElement element) {
		boolean isSelected = element.isSelected();
		return isSelected;
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}

	public String randomString(int len) {
		String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public static String generateRandomNumberWithGivenNumberOfDigits(int number) {
		String randomNumber = "123456789";
		StringBuilder sb = new StringBuilder(number);
		for (int i = 0; i < number; i++) {
			int index = (int) (randomNumber.length() * Math.random());
			sb.append(randomNumber.charAt(index));
		}
		return sb.toString();
	}

	public static String generateRandomStringWithGivenNumberOfDigits(int number) {
		String randomNumber = "qwertyuioplkjhgfdsazxcvbnm";
		StringBuilder sb = new StringBuilder(number);
		for (int i = 0; i < number; i++) {
			int index = (int) (randomNumber.length() * Math.random());
			sb.append(randomNumber.charAt(index));
		}
		return sb.toString();
	}

	public static String getUniquePassword() {
		SimpleDateFormat formatter = new SimpleDateFormat("mmss");
		Date date = new Date();
		String unique = formatter.format(date).toString();
		String passString = "Pass" + unique + "#";
		return passString;
	}

	public static String getDate(int days, String Format, String Time_Zone) throws ParseException {

		DateFormat dateFormat = new SimpleDateFormat(Format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
		Date date = new Date();
		String DF = dateFormat.format(date);

		Calendar c = Calendar.getInstance();
		c.setTime(dateFormat.parse(DF));
		c.add(Calendar.DATE, days);
		String formattedDate = dateFormat.format(c.getTime());

		printString("date : " + formattedDate);
		return formattedDate;

	}

	public static ArrayList<String> getDateList(int maxdays, String Format, String Time_Zone) throws ParseException {
		ArrayList<String> dates = new ArrayList<>();
		for (int i = 0; i <= maxdays; i++) {
			DateFormat dateFormat = new SimpleDateFormat(Format);
			dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
			Date date = new Date();
			String DF = dateFormat.format(date);
			Calendar c = Calendar.getInstance();
			c.setTime(dateFormat.parse(DF));
			c.add(Calendar.DATE, i);
			String formattedDate = dateFormat.format(c.getTime());
			dates.add(formattedDate);
		}
		return dates;
	}

	public ArrayList<String> getSortedList(ArrayList<String> symbol) {
		Collections.sort(symbol);
		return symbol;
	}

	public ArrayList<Double> getSortedDoubleList(ArrayList<Double> symbol) {
		Collections.sort(symbol);
		return symbol;
	}

	public static String removeSpecialCharacters(String value) {
		return value.replaceAll("[^\\x00-\\x7F]", "");
	}

	public static String removeLastThreeChars(String input) {
		// Check if the input string has at least three characters
		if (input.length() >= 3) {
			// Get the substring excluding the last three characters
			return input.substring(0, input.length() - 3);
		} else {
			// Return an empty string if the input is too short
			return "";
		}
	}

	//////////////////////////////////
	// Android Specific Methods
	/////////////////////////////////
	
	public static void clickAndroidElementUsingJs(AndroidDriver<MobileElement> driver, WebElement element) {
		// Create a JavascriptExecutor instance
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to perform the click
        jsExecutor.executeScript("arguments[0].click();", element);
	}
	
	public static void clickAndroidElementUsingAction(AndroidDriver<MobileElement> driver, WebElement element) {
		// Perform the tap action
	    new TouchAction<>(driver)
	            .tap(TapOptions.tapOptions().withElement(ElementOption.element(element)))
	            .perform();
	}
	
	

	public void scrollToBottom(AndroidDriver driver) {
		// Get device dimensions
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;

		// Set start and end points for swipe
		int startX = width / 2;
		int startY = (int) (height * 0.8);
		int endX = width / 2;
		int endY = (int) (height * 0.2);

		// Swipe until the bottom of the scrollable element
		TouchAction action = new TouchAction(driver);
		for (int i = 0; i < 5; i++) { // You can adjust the loop count as needed
			action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(endX, endY)).release().perform();
		}
	}

	public void scrollToElementUsingJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getAndroidDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scroll", scrollObject);
	}

	public void longPress(AndroidElement ele, String elementLabel) {
		Duration d1 = Duration.between(LocalTime.MAX, LocalTime.NOON);
		new TouchAction(BaseClass.getAndroidDriver())
				.longPress(new LongPressOptions().withElement(ElementOption.element(ele)).withDuration(d1)).release()
				.perform();
	}

	public void scrollToText(String text) {
		if (platformName.equalsIgnoreCase("ios")) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseClass.getIOSDriver();

			// Get the dimensions of the screen
			int screenHeight = BaseClass.getIOSDriver().manage().window().getSize().getHeight();
			int screenWidth = BaseClass.getIOSDriver().manage().window().getSize().getWidth();

			// Calculate start and end points for the scroll
			int startX = screenWidth / 2;
			int startY = screenHeight / 2;
			int endY = 0; // Top of the screen

			HashMap<String, Object> scrollObjectHashMap = new HashMap<>();
			scrollObjectHashMap.put("direction", "up");
			scrollObjectHashMap.put("startX", startX);
			scrollObjectHashMap.put("startY", startY);
			scrollObjectHashMap.put("endX", startX);
			scrollObjectHashMap.put("endY", endY);
			scrollObjectHashMap.put("predicateString", "label == '" + text + "'");
			jsExecutor.executeScript("mobile: swipe", scrollObjectHashMap);

		} else {
			String str1 = "new UiScrollable(new UiSelector().scrollable(true).";
			String str2 = "instance(0)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))";
			String user_scroll = str1.concat(str2);
			BaseClass.getAndroidDriver().findElementByAndroidUIAutomator(user_scroll);
			BaseClass.getAndroidDriver().findElementByAndroidUIAutomator(user_scroll);
		}

	}

	public void scrollTo(String selector) {
		String selectorString = String.format(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + selector + ")");
		BaseClass.getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(selectorString));
	}

	public void scrollHorizontalList(String text) {
		MobileElement element = (MobileElement) BaseClass.getAndroidDriver().findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()"
						+ ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
	}

	public void doublelick(WebElement element) {
		try {
			Actions actions = new Actions(BaseClass.getAndroidDriver());
			actions.doubleClick(element).perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void swipeDownCount(int num) {
		for (int i = 0; i < num; i++) {
			TouchAction action = new TouchAction(BaseClass.getAndroidDriver());
			PointOption p1 = new PointOption();
			Dimension dimensions = BaseClass.getAndroidDriver().manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			Double screenWidth = dimensions.getWidth() * .5;
			int width = screenWidth.intValue();
			int h1 = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.99;
			int h2 = screenHeightEnd.intValue();
			action.press(PointOption.point(width, h1))
					.waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
					.moveTo(PointOption.point(width, h2)).release().perform();
		}

	}

	public void scrollToTextUsingUiScrollable(String elementText) {
		BaseClass.getAndroidDriver()
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\"" + elementText + "\"));");
	}

	public AndroidKey getAndroidKey(char character) {

		switch (character) {
		case 'a':
			return AndroidKey.A;
		case 'b':
			return AndroidKey.B;
		case 'c':
			return AndroidKey.C;
		case 'd':
			return AndroidKey.D;
		case 'e':
			return AndroidKey.E;
		case 'f':
			return AndroidKey.F;
		case 'g':
			return AndroidKey.G;
		case 'h':
			return AndroidKey.H;
		case 'i':
			return AndroidKey.I;
		case 'j':
			return AndroidKey.J;
		case 'k':
			return AndroidKey.K;
		case 'l':
			return AndroidKey.L;
		case 'm':
			return AndroidKey.M;
		case 'n':
			return AndroidKey.N;
		case 'o':
			return AndroidKey.O;
		case 'p':
			return AndroidKey.P;
		case 'q':
			return AndroidKey.Q;
		case 'r':
			return AndroidKey.R;
		case 's':
			return AndroidKey.S;
		case 't':
			return AndroidKey.T;
		case 'u':
			return AndroidKey.U;
		case 'v':
			return AndroidKey.V;
		case 'w':
			return AndroidKey.W;
		case 'x':
			return AndroidKey.X;
		case 'y':
			return AndroidKey.Y;
		case 'z':
			return AndroidKey.Z;
		case '0':
			return AndroidKey.DIGIT_0;
		case '1':
			return AndroidKey.DIGIT_1;
		case '2':
			return AndroidKey.DIGIT_2;
		case '3':
			return AndroidKey.DIGIT_3;
		case '4':
			return AndroidKey.DIGIT_4;
		case '5':
			return AndroidKey.DIGIT_5;
		case '6':
			return AndroidKey.DIGIT_6;
		case '7':
			return AndroidKey.DIGIT_7;
		case '8':
			return AndroidKey.DIGIT_8;
		case '9':
			return AndroidKey.DIGIT_9;
		case ' ':
			return AndroidKey.SPACE;
		// Add cases for other characters as needed
		default:
			// If the character is not mapped to any AndroidKey, you can choose a default
			// key or throw an exception
			throw new IllegalArgumentException("Character " + character + " is not supported.");
		}
	}

	//////////////////////////////////
	// IOS Specific Methods
	/////////////////////////////////
	public static void scrollDownToEnd(IOSDriver<MobileElement> driver) {
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "up");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("mobile: swipe", params);

	}

	public static boolean isEndOfPage(IOSDriver<MobileElement> driver) {
		Dimension size = driver.manage().window().getSize();
		MobileElement element = driver.findElementByClassName("XCUIElementTypeScrollView");
		int initialHeight = element.getSize().height;

		new TouchAction<>(driver).press(PointOption.point(10, size.height / 2))
				.moveTo(PointOption.point(10, size.height / 4)).release().perform();

		int finalHeight = element.getSize().height;
		return initialHeight == finalHeight;
	}

	public void SendKeysToElementWithKeyBoard(WebElement ele, String val) {
		click(ele);
		BaseClass.getIOSDriver().getKeyboard().sendKeys(val);
	}

	public static String getCurrentTestName(ITestContext context) {
		ITestNGMethod method = context.getAllTestMethods()[context.getAllTestMethods().length - 1];
		return method.getMethodName();
	}

	public static File compressImage(File inputFile, String outputFilePath) throws IOException {
		File outputFile = new File(outputFilePath);
		Thumbnails.of(inputFile).scale(1) // Keep the original size
				.outputQuality(0.1) // Adjust the quality (0.5 = 50% quality)
				.toFile(outputFile);
		return outputFile;
	}

	public void terminateAndRelanuchAndroidApp() {
		String packageName = BaseClass.getAndroidDriver().getCurrentPackage();
		// Terminate the app
		BaseClass.getAndroidDriver().terminateApp(packageName);
		// Relaunch the app
		BaseClass.getAndroidDriver().activateApp(packageName);
	}

	public void terminateAndRelanuchIOSApp() {
		String bundleId = BaseClass.getIOSDriver().getCapabilities().getCapability("bundleId").toString();
		System.out.println("Bundle ID: " + bundleId);
		// Terminate the app
		BaseClass.getIOSDriver().terminateApp(bundleId);

		// Relaunch the app
		BaseClass.getIOSDriver().activateApp(bundleId);
	}

	public void terminateAndRelaunchApplication() {
		if (platformName.toLowerCase().equalsIgnoreCase("ios")) {
			terminateAndRelanuchIOSApp();
		} else {
			terminateAndRelanuchAndroidApp();
		}
	}

}
