package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestNG_Class {

	WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void Init(){
		driver = new FirefoxDriver();
	}
	
	@AfterClass(alwaysRun = true)
	public void CleanUp(){
		driver.quit();
	}
	
	@Test(groups={"p1","Navigating"})
	public void NavigatingToSeleniumEasySite(){
		driver.navigate().to("https://www.seleniumeasy.com/selenium-webdriver-tutorials");
		System.out.println("NavigatingToSeleniumEasySite method");
		Assert.assertTrue(driver.getTitle().equals("List of Selenium Webdriver Tutorials | Selenium Easy"));
	}
	
	@Test(groups={"p2","ClickOnSeleniumIntroduction"},dependsOnMethods = "NavigatingToSeleniumEasySite")
	public void ClickOnSomeLink(){
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[3]/div/article/div/div/div/div/li[3]/a")).click();
		System.out.println("ClickOnSomeLink method");
	}
	
	@Test(groups={"p2","ClickOnSeleniumLink"},dependsOnMethods="ClickOnSomeLink")
	public void ClickOnSelenium(){
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[3]/div/article/div[1]/div[1]/div/div/p[1]/a")).click();
		System.out.println("ClickOnSelenium method");
	}
}