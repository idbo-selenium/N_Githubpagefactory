package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmail_LoginTest {

	WebDriver driver;
	Gmail_Login gmail;
	
	@BeforeClass
	public void Init(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
	}
	
	@AfterClass
	public void CleanUp(){
		//driver.close();
	}
	
	@Test(priority = 0)
	public void SignInTest() throws InterruptedException{
		gmail = new Gmail_Login(driver);
		gmail.SignIn("srinivas.v145@gmail.com", "krishvani");
		System.out.println("Successfully SignIn");
	}
	
//	@Test(priority = 1)
//	public void SendMail() throws InterruptedException{
//		gmail = new Gmail_Login(driver);		
//		gmail.SentMail("knskumari@gmail.com","Hello");		
//		System.out.println("Successfully Mail Sent");
//	}
	
	@Test(priority = 1)
	public void SignOutTest() throws InterruptedException{
		gmail = new Gmail_Login(driver);
		gmail.WaitMethod(driver, "/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span");
		gmail.SignOut();
		System.out.println("Successfully SignOut");
	}
}