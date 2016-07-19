package testNGDependencyTest;

import org.testng.annotations.Test;

public class DependencySampleClass {

	@Test(dependsOnGroups= {"deploy","db"})
	public void SignIn(){
		System.out.println("DependencySampleClass class SignIn method");
	}
	
	@Test(dependsOnMethods = "SignIn")
	public void SignUp(){
		System.out.println("DependencySampleClass class SignUp method");
	}	
}