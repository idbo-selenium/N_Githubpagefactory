package testNGIgnoreTest;

import org.testng.annotations.Test;

public class GroupTest {

	@Test (groups={"functiontest","checktest"})
	public void PrintMessage(){
		System.out.println("Inside PrintMessage");
	}
	
	@Test (groups = "functiontest")
	public void SalutationMessage(){
		System.out.println("Inside SalutationMessage");
	}
	
	@Test(groups = "checktest")
	public void ExitMessage(){
		System.out.println("Inside ExitMessage");
	}
}