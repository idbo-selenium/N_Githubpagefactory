package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;                                           
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	GoogleSearch_Selenium google;
	SeleniumLink_Click link_click;
	
	@BeforeClass
	public void Init(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in/");
	}
	
	@AfterClass
	public void CleanUp(){
		//driver.close();
	}	
	
	@Test
	public void Searching(){
		google = new GoogleSearch_Selenium(driver);
		link_click = new SeleniumLink_Click();
		System.out.println("Navigated");
		google.Search("selenium");
		System.out.println("Search Selenium");
		//link_click.FirstLinkClick();
		System.out.println("Click on SeleniumHQ");
	}
	@Test(dependsOnMethods = "Searching")
	public void Search() throws InterruptedException {		
		Thread.sleep(4000);
		link_click.FirstLinkClick();
		//driver.findElement(By.xpath("/html/body/div/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div/h3/a")).click();
		//Actions hover = new Actions(driver);
		//hover.moveToElement(driver.findElement(By.linkText("Downloads - Selenium"))).click().build().perform();
	}
}