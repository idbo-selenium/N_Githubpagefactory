package testNGDependencyTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Trello_LogOut {

	@Test(dependsOnGroups="Login")
	public void Profile_Click(){
		Trello_Navigate.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]")).click();
	}
	
	@Test(dependsOnMethods="Profile_Click")
	public void LogOut_Click(){
		Trello_Navigate.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")).click();
	}
	
	@Test(dependsOnMethods="LogOut_Click",enabled = false)
	public void CloseBrowser(){
		Trello_Navigate.driver.close();
	}
	@Test
	public void Sample(){
		System.out.println("JUnit test");
	}
}