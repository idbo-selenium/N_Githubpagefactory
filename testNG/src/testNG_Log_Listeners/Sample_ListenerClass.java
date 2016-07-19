package testNG_Log_Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_Log_Listeners.Sample_ListenersClass_Interface.class)
public class Sample_ListenerClass {

	WebDriver driver;
	public void WaitMethod(WebDriver driver,String xpath){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	@Test(priority=0)
	public void Navigating_Browser(){
		//System.out.println("This is Navigating_Browser");
		driver = new FirefoxDriver();
		driver.navigate().to("https://trello.com/login");
	}
	
	@Test(dependsOnMethods="Navigating_Browser",priority=1)
	public void Login_Trello(){		
		//System.out.println("This is Login_Trello Method");
		driver.findElement(By.id("user")).sendKeys("knskumari");
		driver.findElement(By.id("password")).sendKeys("pass@word1");
		driver.findElement(By.id("login")).click();
	}
	
	@Test(dependsOnMethods="Login_Trello",priority=2)
	public void Logout_Trello(){
		//System.out.println("This is Logout_Trello Method");
		WaitMethod(driver, "/html/body/div[3]/div[1]/div[4]/a[2]/span[2]");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")).click();
	}	
	@Test(dependsOnMethods= "Logout_Trello",priority=3)
	public void Close_Browser(){
		//System.out.println("This is Close_Browser Method");
		driver.close();
	}
	
	@Test(priority=4)
	public void Division(){
		//System.out.println("This is Division Method");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]")).click();
	}
	
	@Test(dependsOnMethods="Division")
	public void DependencyMethod(){
		//System.out.println("This is DependencyMethod");
	}	
}