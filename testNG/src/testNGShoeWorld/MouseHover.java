package testNGShoeWorld;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseHover {

	WebDriver driver;
	Actions mouseHover = null;
	@BeforeClass
	public void Init(){
		System.out.println("Inside Init method");
		driver = new FirefoxDriver();
	}
	
	@AfterClass
	public void CleanUp(){
		System.out.println("Inside CleanUp method");
		driver.close();
	}
		
	public void WaitMethod(WebDriver driver,String xpath){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}	
	
	@Test(dependsOnMethods="ShoeShopee_Navigating")
	public void ShoeShopee_QuickView(){
		System.out.println("Inside ShoeShopee_QuickView method");
		WebElement partyWearSandles = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[1]/div/a[1]/img"));
		mouseHover.moveToElement(partyWearSandles).build().perform();
		WebElement quickViewButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[1]/div/a[2]/span"));
		mouseHover.moveToElement(quickViewButton).click().build().perform();
	}	 
	
	@Test
	public void ShoeShopee_Navigating(){
		System.out.println("Inside ShoeShopee_Navigating method");
		driver.navigate().to("http://182.72.246.195:8088/");
		mouseHover = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		mouseHover.moveToElement(women).build().perform();
		WaitMethod(driver, "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a");
		WebElement casualShoes = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		mouseHover.moveToElement(casualShoes).click().build().perform();		
	}	
	
	@Test(dependsOnMethods="ShoeShopee_QuickView")
	public void ShoeShopee_HandlingIframe() throws InterruptedException{
		System.out.println("Inside ShoeShopee_HandlingIframe method");
		Thread.sleep(4000);
		//Handling IFrame
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe")));
		//Hovering Quick View
		WebElement image1 = driver.findElement(By.id("thumb_52"));
		mouseHover.moveToElement(image1).build().perform();
		Thread.sleep(4000);
		WebElement image2 = driver.findElement(By.id("thumb_53"));
		mouseHover.moveToElement(image2).build().perform();
		Thread.sleep(4000);		
		
		WebElement temp = driver.findElement(By.id("thumbs_list_frame"));
		List<WebElement> list = temp.findElements(By.xpath("/html/body/div/div/div[1]/div[2]/div/ul/li"));
		System.out.println("Size is : "+list.size());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();		
	}	
}