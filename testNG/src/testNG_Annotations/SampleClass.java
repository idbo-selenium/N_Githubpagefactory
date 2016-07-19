package testNG_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleClass {

	@BeforeClass
	public void BeforeClass(){
		System.out.println("TestNG Before class Annotation");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("TestNG After class Annotation");
	} 
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("TestNG Before Test Annotation");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("TestNG After Test Annotation");
	}	
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("TestNG Before Method Annotation");
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("TestNG After Method Annotation");
	}
	
	@Test
	public void Test1(){
		System.out.println("TestNG Test1 method using Test Annotation");
	}
	
	@Test
	public void Test2(){
		System.out.println("TestNG Test2 method using Test Annotation");
	}
	
	@Test
	public void Test3(){
		System.out.println("TestNG Test3 method using Test Annotation");
	}
	
	@Test
	public void Test4(){
		System.out.println("TestNG Test4 method using Test Annotation");
	}
}