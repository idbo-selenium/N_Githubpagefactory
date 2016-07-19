package com.pagefactory.ShoeWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	String formalShoes = "Formal Shoes";
	
	public static void GoTo() {
		// TODO Auto-generated method stub
		Browser.OpenBrowser();
		Browser.driver.navigate().to("http://182.72.246.195:8088/");
	}

	public static String IsAt() {
		// TODO Auto-generated method stub
		return Browser.driver.getTitle();
	}
	
	@FindBy(id = "search_query_top")
	static WebElement searchBox;
	
	@FindBy(name = "submit_search")
	WebElement searchButton;

//	public void setSearchBox(String searchValue){
//		searchBox.sendKeys(searchValue);
//	}
	
	public static void SearchItem(String shoeType) {
		// TODO Auto-generated method stub
		Browser.driver.findElement(By.id("search_query_top")).sendKeys(shoeType);
		//searchBox.sendKeys(shoeType);
	}

	public static void SearchButtonClick() {
		// TODO Auto-generated method stub
		Browser.driver.findElement(By.name("submit_search")).click();
	}
}