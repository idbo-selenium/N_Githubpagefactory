package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitHub_Test {

	WebDriver driver;
	GitHub_Login github;
	
	@BeforeTest
	public void Init(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://github.com/login");
	}
	
	@AfterTest
	public void CleanUp(){
		driver.close();
	}
	
	@Test
	public void GitHub_Login(){
		System.out.println("Inside GitHub_Login method");
		github = new GitHub_Login(driver);
		github.SignIn("nirmalakumari", "pass@word1");
		System.out.println("Succesfully SignIn");
		github.SignOut();
		System.out.println("Successfully SignOut");
	}
}