package testNGDependencyTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testNG_Annotations.NewTab_Opening;

@Test(groups = "Login")
public class Trello_Login {	
	
	@Test(dependsOnGroups="navigate")
	public void Enter_Username(){
		Trello_Navigate.driver.findElement(By.id("user")).sendKeys("knskumari");
	}
	
	@Test(dependsOnMethods="Enter_Username")
	public void Enter_Password(){
		Trello_Navigate.driver.findElement(By.id("password")).sendKeys("pass@word1");
	}
	
	@Test(dependsOnMethods="Enter_Password")
	public void Login_Click(){
		Trello_Navigate.driver.findElement(By.id("login")).click();
		NewTab_Opening.ExplicitWaitForAnElementToVeVissible(Trello_Navigate.driver, "/html/body/div[3]/div[1]/div[4]/a[2]/span[2]");
	}	
}