package com.swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swagLabs.base.Testbase;

public class LoginPage extends Testbase 
{
	@FindBy(css = ".login_logo")
	WebElement div_login_logo;
	
	@FindBy(id = "user-name")
	public WebElement input_username_textbox;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement input_password_textbox;
	
	@FindBy(id = "login-button")
	public WebElement input_login_button;
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	public WebElement button_Open_Menu;
	
	@FindBy(linkText = "Logout")
	public WebElement a_logout_link;
	
	public LoginPage()
	{
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifyTitle()
	{
		
		return driver.getTitle();
	}
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean verify_logo_isDisplay()
	{
		return div_login_logo.isDisplayed();
	}
	
	public String verifyLogin()
	{
		input_username_textbox.sendKeys(pro.getProperty("userName"));
		
		input_password_textbox.sendKeys(pro.getProperty("password"));
		
		input_login_button.click();
		
		String loginpage_title = verifyTitle();
		
		button_Open_Menu.click();
		
		a_logout_link.click();
		
		return loginpage_title;
		
		
	}
 
}
