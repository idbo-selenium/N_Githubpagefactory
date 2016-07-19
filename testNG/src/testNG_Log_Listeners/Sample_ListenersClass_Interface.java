package testNG_Log_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample_ListenersClass_Interface implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {				
	}

	@Override
	public void onStart(ITestContext arg0) {			
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {		
	}

	@Override
	public void onTestFailure(ITestResult result) {		
		System.out.println("Testcase failed and Details are :"+result.getMethod());
	}

	@Override
	public void onTestSkipped(ITestResult result) {		
		System.out.println("Testcase Skipped and Details are : "+result.getMethod());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase Started and Details are : "+result.getMethod());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Successed");
		
	}
}