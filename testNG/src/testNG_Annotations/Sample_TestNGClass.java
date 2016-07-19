package testNG_Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample_TestNGClass {

   @Test
   public void testAdd() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
      System.out.println("Sample_TestNGClass testAdd method");
   }
   
   @Test
   public void testSub(){
	   System.out.println("Sample_TestNGClass testSub method");
   }
}