package com.swagLabs.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.swagLabs.base.Testbase;

public class Utility extends Testbase {

	public static void maxWin() {
		driver.manage().window().maximize();
	}

	public static void minWin() {
		driver.manage().window().minimize();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void implicitly_wait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static void closeWin() {
		driver.close();
	}

	public static void alert_popup_Okbtn() {
		driver.switchTo().alert().accept();
	}

	public static void alert_popup_Cancelbtn() {
		driver.switchTo().alert().dismiss();
	}

	public static void alert_popup_sendkeys(String val) {
		driver.switchTo().alert().sendKeys(val);
	}

	public static String alert_popup_getText() {
		return driver.switchTo().alert().getText();
	}

	public static void takingScreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		f = ts.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(f, new File(".\\Screenshots\\" + filename + ".png"));
	}

	public static void iframe_index(int index) {
		driver.switchTo().frame(index);
	}

	public static void iframe_idorname(String idorname) {
		driver.switchTo().frame(idorname);
	}

	public static void iframe_webelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void default_content() {
		driver.switchTo().defaultContent();
	}

	public static void dropDown_SelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void dropDown_SelectByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	public static void dropDown_SelectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void dropDown_deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public static void dropDown_deSelectByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.deselectByIndex(value);
	}

	public static void dropDown_deSelectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);
	}

	public static WebElement dropDown_SelectByFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public static void dropDown_SelectByContainsVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByContainsVisibleText(text);
	}

	public static void dropDown_getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		Iterator<WebElement> iteratorOptions = allSelectedOptions.iterator();
		while (iteratorOptions.hasNext()) {
			WebElement options = iteratorOptions.next();
			System.out.println(options);	
		}
	}
	
	public static void dropDown_getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		ListIterator<WebElement> iterator = options.listIterator();
		while (iterator.hasNext()) {
			String text = iterator.next().getText();
			System.out.println(text);
		}
	}

}
