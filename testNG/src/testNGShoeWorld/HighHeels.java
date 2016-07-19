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

public class HighHeels {

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
		//driver.close();
	}
	
	public void WaitMethod(WebDriver driver,String xpath){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
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
	
	@Test(dependsOnMethods="ShoeShopee_Navigating")
	public void SelectSandles(){
		System.out.println("Inside SelectSandles method");
		//high heels hovering
		WebElement sandles = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
		mouseHover.moveToElement(sandles).build().perform();
		
		//quick view button click
		WebElement quickView = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[2]/span"));
		mouseHover.moveToElement(quickView).click().build().perform();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe")));
		
		//li count
		WebElement temp = driver.findElement(By.id("thumbs_list_frame"));
		List<WebElement> list = temp.findElements(By.xpath("/html/body/div/div/div[1]/div[2]/div/ul/li"));
		//ArrayList<WebElement> list = (ArrayList<WebElement>) temp.findElements(By.xpath("/html/body/div/div/div[1]/div[2]/div/ul/li"));
		System.out.println("List is : "+list.size());
	}
	
}
