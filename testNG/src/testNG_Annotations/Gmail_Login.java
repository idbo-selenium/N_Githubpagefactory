package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmail_Login {

	WebDriver driver;
	
	public void ExplicitWaitForAnElementToVeVissible(WebDriver driver,String xpath){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	@BeforeClass(alwaysRun = true)
	public void Init(){
		driver = new FirefoxDriver();
	}
	
	@AfterClass(alwaysRun = true)
	public void CleanUp(){
		driver.quit();
	}
	
	@Test(groups={"p1","Navigating"})
	public void Navigating_GmailPage(){
		driver.navigate().to("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		System.out.println("Navigating_GmailPage method in Gmail_Login class");
	}
	@Test(groups={"p2","Enter Username"},dependsOnMethods="Navigating_GmailPage")
	public void Enter_Username(){
		driver.findElement(By.id("Email")).sendKeys("srinivas.v145");
		System.out.println("Enter_Username method in Gmail_Login class");
	}
	@Test(groups={"p2","Click Next Button"},dependsOnMethods="Enter_Username")
	public void NextButton_Click(){
		driver.findElement(By.id("next")).click();	
		ExplicitWaitForAnElementToVeVissible(driver,"/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]");
	}	
	@Test(groups={"p3","Enter Password"},dependsOnMethods="NextButton_Click")
	public void Enter_Password(){
		driver.findElement(By.id("Passwd")).sendKeys("krishvani");
	}
	@Test(groups={"p3","Click Login"},dependsOnMethods="Enter_Password")
	public void SignIn_Click(){
		driver.findElement(By.id("signIn")).click();
	}
	@Test(dependsOnMethods="SignIn_Click")
	public void Profile_Click(){
		ExplicitWaitForAnElementToVeVissible(driver,"/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span");
		Assert.assertTrue(driver.getCurrentUrl().equals("https://mail.google.com/mail/u/0/#inbox"));
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	}
	@Test(dependsOnMethods="Profile_Click")
	public void SignOut_Click(){
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/a")).click();
		Assert.assertTrue(driver.getCurrentUrl().equals("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1"));
	}
}