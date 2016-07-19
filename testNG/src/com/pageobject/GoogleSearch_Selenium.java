package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch_Selenium {

	WebDriver driver;
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(name = "btnG")
	WebElement searchButton;
	
	public GoogleSearch_Selenium(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setSearchBoxValue(String str){
		searchBox.sendKeys(str);
	}
	
	public void SearchButtonClick(){
		searchButton.click();
	}
	
	public void Search(String value){
		this.setSearchBoxValue(value);
		this.SearchButtonClick();
	}
}