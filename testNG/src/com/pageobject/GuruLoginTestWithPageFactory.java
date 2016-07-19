package com.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruLoginTestWithPageFactory {

    WebDriver driver;    
    GuruLogin objLogin;
    
    @BeforeTest    
    public void Init(){ 
        driver = new FirefoxDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.get("http://demo.guru99.com/V4/"); 
    }
    
    @Test    
    public void Guru99_HomePage(){ 
	    objLogin = new GuruLogin(driver);
	 
	    //Verify login page title 
	    String loginPageTitle = objLogin.getLoginTitle(); 
	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	    
	    //login to application 
	    objLogin.loginGuru("mgr123", "mgr123"); 
	    Alert alert=driver.switchTo().alert();
		alert.accept();
    }
    
    @AfterTest
    public void CleanUp(){
    	driver.close();
    }
}