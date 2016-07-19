package testNGDependencyTest;

import org.testng.annotations.Test;

@Test(groups = "deploy")
public class Dependency_GroupTest {

	@Test
	public void Dependency_GroupTestMethod1(){
		System.out.println("Dependency_GroupTest class Depedency_GroupTestMethod1");
	}
	
	@Test(dependsOnMethods = "Dependency_GroupTestMethod1")
	public void Dependency_GroupTestMethod2(){
		System.out.println("Dependency_GroupTest class Dependency_GroupTestMethod2");
	}
}