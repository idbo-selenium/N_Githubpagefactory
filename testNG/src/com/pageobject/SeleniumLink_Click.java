package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SeleniumLink_Click {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div/h3/a")
	WebElement link;
	//Actions hover = null;
	public void Link_Click(){
//		hover = new Actions(driver);
//		hover.moveToElement(link).click().build().perform();
		link.click();
	}
	
	public void FirstLinkClick(){
		this.Link_Click();
	}
}