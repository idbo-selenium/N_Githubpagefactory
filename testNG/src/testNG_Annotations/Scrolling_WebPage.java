package testNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling_WebPage {

	WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void BeforeClass(){
		System.out.println("Scrolling_WebPage Before Class Method");
		driver = new FirefoxDriver();
	}
	
	@AfterClass(alwaysRun = true)
	public void AfterClass(){
		System.out.println("Scrolling_WebPage After Class Method");
		driver.quit();
	}
	
//	@Test(priority = 2)
//	public void Scrolling_Test() throws InterruptedException{
//		System.out.println("Scrolling_WebPage Test Method");
//		//https://www.linkedin.com/ site
////		driver.navigate().to("https://www.linkedin.com/");
////		Thread.sleep(2000);
////		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
////		Thread.sleep(2000);
//		
//		//Scrolling google search for selenium tutorial using Coordinates
//		driver.navigate().to("https://www.google.co.in/");
//		driver.findElement(By.id("lst-ib")).sendKeys("selenium tutorial");
//		Actions action = new Actions(driver);		
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(2000);		
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div[3]/div[2]/div/h3/a")).click();
//		Thread.sleep(4000);
//		System.out.println("Sucessfully Scroll down");
//	}
//	
//	@Test(priority = 1)
//	public void openBrowserwithGivenDimension(){
//		driver.navigate().to("http://docs.seleniumhq.org/");
//		System.out.println(driver.manage().window().getSize());
//		Dimension d = new Dimension(420,600);
//		driver.manage().window().setSize(d);
//		System.out.println(driver.manage().window().getSize());
//	}
	
	@Test
	public void GetAttribute(){
		driver.navigate().to("https://www.google.co.in/");
//		String searchBox_AttributeName = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]")).getAttribute("name");
//		System.out.println("Search box name using Attribute : "+searchBox_AttributeName);
//		String searchBox_AttributeID = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]")).getAttribute("id");
//		System.out.println("Search box id using Attribute : "+searchBox_AttributeID);
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]"));
		System.out.println("Getting name of Search box using getAttribute method : "+searchBox.getAttribute("name"));
		
		System.out.println("Getting id of Search box using getAttribute method : "+searchBox.getAttribute("ID"));
		
		System.out.println("Getting class of Search box using getAttribute method : "+searchBox.getAttribute("class"));
		
		System.out.println("Getting autocomplete of Search box using getAttribute method : "+searchBox.getAttribute("autocomplete"));
		
		System.out.println("Getting aria-autocomplete of Search box using getAttribute method : "+searchBox.getAttribute("aria-autocomplete"));
		
		System.out.println("Getting style of Search box using getAttribute method : "+searchBox.getAttribute("style"));
		
		System.out.println("Getting Height from CSS Values of Search box using getCssValue method : "+searchBox.getCssValue("height"));
		
		System.out.println("Getting font-size from CSS Values of Search box using getCssValue method : "+searchBox.getCssValue("font-size"));
	}	
}