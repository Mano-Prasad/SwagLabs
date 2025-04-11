package com.swagLabs.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.swagLabs.base.Testbase;

public class Utility extends Testbase
{
	
	public static void maxWin()
	{
		driver.manage().window().maximize();
	}
	
	public static void minWin()
	{
		driver.manage().window().minimize();
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	
	public static void implicitly_wait(int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void closeWin()
	{
		driver.close();
	}
	
	public static void alert_popup_Okbtn()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void alert_popup_Cancelbtn()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void alert_popup_sendkeys(String val)
	{
		driver.switchTo().alert().sendKeys(val);
	}

	
	public static String alert_popup_getText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void takingScreenshot(String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		f = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(f, new File(".\\Screenshots\\"+ filename + ".png"));
	}
	
	public static void iframe_index(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void iframe_idorname(String idorname)
	{
		driver.switchTo().frame(idorname);
	}
	
	public static void iframe_webelement(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public static void default_content()
	{
		driver.switchTo().defaultContent();
	}
}
