package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruLogin {

	WebDriver driver;
	
	@FindBy(name = "uid")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(className = "barone")
	WebElement titleText;
	
	@FindBy(name = "btnLogin")
	WebElement login;
	
	public GuruLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String strUsername){
		userName.sendKeys(strUsername);
	}
	
	public void setPassword(String strPassword){
		password.sendKeys(strPassword);
	}
	
	public void ClickLogin(){
		login.click();
	}
	
	public String getLoginTitle(){
		return titleText.getText();
	}
	
	public void loginGuru(String strUser,String strPass){
		this.setUsername(strUser);
		this.setPassword(strPass);
		this.ClickLogin();
	}	
}