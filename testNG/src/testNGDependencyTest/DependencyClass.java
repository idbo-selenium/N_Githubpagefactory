package testNGDependencyTest;

import org.testng.annotations.Test;

public class DependencyClass {

	@Test(groups="db",dependsOnGroups= "deploy")
	public void Init(){
		System.out.println("DependencyClass class Init method");
	}
	
	@Test(groups="db")
	public void CleanUp(){
		System.out.println("DependencyClass class CleanUp method");
		//throw new RuntimeException();
	}	
}