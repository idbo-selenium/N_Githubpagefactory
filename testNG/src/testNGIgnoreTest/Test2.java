package testNGIgnoreTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	String message = "manisha";
	TestSuite test = new TestSuite(message);
	
	@Test
	public void Test2_TestMethod(){
		System.out.println("Test2_TestMethod Method");
		message = "Hi "+message;
		Assert.assertTrue(test.SalutationMessage().equals(message));
	}	
}