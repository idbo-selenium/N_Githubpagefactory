package testNGDependencyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(groups="navigate")
public class Trello_Navigate {

	public static WebDriver driver;
	@Test
	public void Init(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://trello.com/login");
	}	
}