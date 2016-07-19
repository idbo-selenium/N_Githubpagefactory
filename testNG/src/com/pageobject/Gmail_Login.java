package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {

	WebDriver driver;
	
	@FindBy(id = "Email")
	WebElement username;
	
	@FindBy(id = "next")
	WebElement nextButton;
	
	@FindBy(id = "Passwd")
	WebElement password;
	
	@FindBy(id = "signIn")
	WebElement signIn;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
	WebElement profile;
	
	@FindBy(id = "gb_71")
	WebElement signOut;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")
	WebElement composeButton;
	
	@FindBy(id = ":og")
	WebElement toAddress;
	
	@FindBy(xpath = "/html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")
	WebElement subject;
	
	public void WaitMethod_ID(WebDriver driver,String id){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	public void WaitMethod(WebDriver driver,String xpath){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public Gmail_Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String usernameValue){
		username.sendKeys(usernameValue);
	}
	
	public void NextButtonClick(){
		nextButton.click();
	}
	
	public void setPassword(String passwordValue){
		password.sendKeys(passwordValue);
	}
	
	public void SignInClick(){
		signIn.click();
	}
	
	public void ComposeButtonClick(){
		composeButton.click();
	}
	
//	public void setToaddress(String toAddressValue){
//		toAddress.sendKeys(toAddressValue);
//	}
//	
//	public void setSubject(String subjectValue){
//		subject.sendKeys(subjectValue);
//	}
	
	public void ProfileClick(){
		profile.click();
	}
	
	public void SignOutClick(){
		signOut.click();
	}
	
	public void SignIn(String user,String pass) throws InterruptedException{
		this.setUsername(user);
		this.NextButtonClick();
		//waiting for search password textbox 
		WaitMethod_ID(driver, "Passwd");
		this.setPassword(pass);
		this.SignInClick();
	}
	
//	public void SentMail(String to,String subject) throws InterruptedException{
//		//waiting for search compose button
//		WaitMethod(driver, "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div");
//		this.ComposeButtonClick();
//		//waiting for search "to" address for sending mail
//		//WaitMethod_ID(driver, ":o5");
//		//this.setToaddress(to);
//		Thread.sleep(9000);
//		this.setSubject(subject);		
//	}	
	
	public void SignOut(){
		this.ProfileClick();
		this.SignOutClick();
	}
}