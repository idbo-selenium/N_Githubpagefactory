package com.pagefactory.ShoeWorld;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@BeforeTest
	public void Init(){
		HomePage.GoTo();
	}
	
	@Test
	public void ShoeWorld(){		
		Assert.assertTrue("ShoeFactory".equals(HomePage.IsAt()));
		HomePage.SearchItem("Formal Shoes");
		HomePage.SearchButtonClick();
	}	
	
	@AfterTest
	public void CleanUp(){
		Browser.CloseBrowser();
	}	
}