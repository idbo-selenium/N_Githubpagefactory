package testNG_Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample_TestNGListenerClass {

	WebDriver driver;
	@Test(priority = 1)
	public void Navigate_Google(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/");
		driver.close();
	}
	
	@Test(priority = 2)
	public void Navigate_ToolSQA(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/");
		driver.close();
	}
	
	@Test(priority = 0)
	@Parameters("name")
	public void ParameterAnnotation_Class(String name){
		System.out.println("Parameter name is : "+name);		
	}
}