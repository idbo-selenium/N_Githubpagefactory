package testNG_Log_Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNG_Listener extends TestListenerAdapter {
	
	@Override
	public void onTestStart(ITestResult tr){
		log("Its Starting");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr){
		log("Test "+tr.getName()+" Passed");
		log("Priority of this method is "+tr.getMethod().getPriority());	
		System.out.println("---------------------");
	}
	
	@Override
	public void onTestFailure(ITestResult tr){
		log("Test "+tr.getName()+" Failed");
		log("Priority of this method is "+tr.getMethod().getPriority());
		System.out.println("---------------------");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr){
		log("Test "+tr.getName()+" Skipped");
		log("Priority of this method is "+tr.getMethod().getPriority());
		System.out.println("---------------------");
	}
	
	private void log(String methodName) {
		System.out.println(methodName);		
	}
}