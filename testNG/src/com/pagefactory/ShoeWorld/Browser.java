package com.pagefactory.ShoeWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver;
	
	public static void OpenBrowser(){
		driver = new FirefoxDriver();
	}
	
	public static void CloseBrowser(){
		driver.close();
	}	
}