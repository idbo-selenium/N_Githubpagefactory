package testNG_Annotations;

import java.util.ArrayList;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NewTab_Opening {

	public static void ExplicitWaitForAnElementToVeVissible(WebDriver driver,String xpath){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void Init(){
		driver = new FirefoxDriver();
		System.out.println("");
	}
	@AfterClass(alwaysRun = true)
	public void Cleanup(){
		driver.quit();
	}
	
//	@Test
//	public void Opening_NewTab(){
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.co.in/");
//		System.out.println("Tab 1 URL is : "+driver.getCurrentUrl());
//		
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"t");
//		driver.get("https://www.seleniumeasy.com/selenium-webdriver-tutorials");
//		System.out.println("Tab 2 URL is : "+driver.getCurrentUrl());
//		
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"\t");
//		System.out.println("Old Tab URL is : " +driver.getCurrentUrl());
//		driver.switchTo().defaultContent(); 
//		driver.close();		
//	}	
	
	@Test
	public void Tabs_SwitchTo(){
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Tab 1 URL is : "+driver.getCurrentUrl());		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"t");
		driver.get("https://www.seleniumeasy.com");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println("Tab 2 URL is : "+driver.getCurrentUrl());
		//driver.close();
	}
}