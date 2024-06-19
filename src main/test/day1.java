package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest // the scope covers only a module in the xml file
	public void lastExecution()
	{
		System.out.println("I will execute after module scope");
	}
	
	@BeforeMethod
	public void comeBeforeMethod() 
	{
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void comeAfterMethod() 
	{
		System.out.println("I will execute after every method");
	}
	
	


	@Test (groups={"Smoke"}, priority= 1)
	public void Demo() 
	{
		System.out.println("Hello");
		
		
	}
	
	@Test (priority= 2)
	public void BTest()
	{
		System.out.println("Come Around");
	}

}
