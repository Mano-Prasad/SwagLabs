package com.swagLabs.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.swagLabs.utilities.Utility;

public class Testbase {

	public static WebDriver driver ;
	
	public static File f;
	
	FileInputStream fis;
	
	public Properties pro;
	
	
	public Testbase()
	{
		try
		{
			f = new File(".\\src\\main\\java\\com\\swagLabs\\configuration\\config.properties");
		
			fis = new FileInputStream(f);
			
			pro = new Properties();
			
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void initBrowser() 
	{
		String browsername = pro.getProperty("browserName");	
		
		if(browsername.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		
		else
		{
			System.out.println("Givn broser is invalid");
		}
		
		driver.get(pro.getProperty("appURL"));
		
		Utility.maxWin();
		
		Utility.implicitly_wait(30);
		
	}

	
	
}
