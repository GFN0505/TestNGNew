package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This test is successful for listeners");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("This test failed, i will take a screenshot, the failed test is " + result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
}
