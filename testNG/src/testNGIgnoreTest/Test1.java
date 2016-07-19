package testNGIgnoreTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	String message = "Manisha ";	
	TestSuite test = new TestSuite(message);
	
	@Test
	public void Test1_TestMethod(){
		System.out.println("Test1_TestMethod Method");
		Assert.assertTrue(message.equalsIgnoreCase(test.PrintMessage()));		
	}	
}