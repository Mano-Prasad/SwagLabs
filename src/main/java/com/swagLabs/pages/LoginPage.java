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
	WebElement input_username_textbox;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement input_password_textbox;
	
	@FindBy(id = "login-button")
	WebElement input_login_button;
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	WebElement button_Open_Menu;
	
	@FindBy(linkText = "Logout")
	WebElement a_logout_link;
	
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
 
}
