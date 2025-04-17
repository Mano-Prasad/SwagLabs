package com.swagLabs.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.swagLabs.base.Testbase;
import com.swagLabs.pages.LoginPage;
import com.swagLabs.utilities.Utility;

public class TC_001 extends Testbase
{
	LoginPage lp;
	
	@BeforeTest
	public void setUp()
	{
		initBrowser();
		lp =new LoginPage();
	}
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actual_Title = lp.verifyTitle();
		
		Assert.assertEquals(actual_Title, "Swag Labs");
	}
	
	
	@Test(priority = 2)
	public void validateUrl()
	{
		String actual_Url = lp.verifyUrl();
		
		Assert.assertEquals(actual_Url, "https://www.saucedemo.com/v1/");
	}
	
	
	@Test(priority = 3)
	public void validate_loginLogo()
	{
		boolean flag = lp.verify_logo_isDisplay();
		
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 4)
	public void validate_login()
	{
		String actual_login_title = lp.verifyLogin();
		
		Assert.assertEquals(actual_login_title, "Swag Labs");
	}
	
	@AfterTest
	public void tearDown()
	{
		Utility.closeWin();
	}

}
