package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_Login {

	WebDriver driver;
	@FindBy(id = "login_field")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(name = "commit")
	WebElement submit;
	
	@FindBy(xpath = "/html/body/div[2]/div/ul[2]/li[3]/a/img")
	WebElement profile;
	
	@FindBy(xpath = "/html/body/div[2]/div/ul[2]/li[3]/div/div/form/button")
	WebElement signOut;
	
	public void WaitMethod(WebDriver driver,String xpath){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public GitHub_Login(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String usernameValue){
		username.sendKeys(usernameValue);
	}
	
	public void setPassword(String passwordValue){
		password.sendKeys(passwordValue);
	}
	
	public void submitClick(){
		submit.click();
	}
	
	public void ProfileClick(){
		profile.click();
	}
	
	public void SignOutClick(){
		signOut.click();
	}
	
	public void SignIn(String user,String pass){
		WaitMethod(driver, "/html/body/div[4]/div[1]/div/form/div[4]/input[1]");
		this.setUsername(user);
		this.setPassword(pass);
		this.submitClick();
	}
	
	public void SignOut(){
		WaitMethod(driver, "/html/body/div[2]/div/ul[2]/li[3]/a/img");
		this.ProfileClick();
		WaitMethod(driver, "/html/body/div[2]/div/ul[2]/li[3]/div/div/form/button");
		this.SignOutClick();
	}	
}