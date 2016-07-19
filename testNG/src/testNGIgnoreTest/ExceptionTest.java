package testNGIgnoreTest;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions=ArithmeticException.class)
	public void Test(){
		System.out.println("Inside Test Method");		
	    int b = 1/0;
	    System.out.println("B value : "+b);
	    System.out.println("out of Test Method");
	}	
}