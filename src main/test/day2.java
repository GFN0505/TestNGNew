package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Test (groups={"Smoke"})
	public void ploan()
	{
		System.out.println("We are here");
	}
	
	@Parameters({"URL", "APIkey"})
	@Test 
	public void Gloan(String urlname, String key)
	{
		System.out.println("We don come");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeTest
	public void preTest() 
	{
		System.out.println("I will execute before module scope");
	}

}
