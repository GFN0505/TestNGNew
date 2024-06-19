package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL"})
	@Test
	public void Aloan(String urlname)
	{
		System.out.println("We were here");
		System.out.println(urlname);
	}
	
	@AfterSuite
	public void finalGuy()
	{
		System.out.println("I am the last after suite");
	}
	
	@BeforeSuite
	public void firstGuy()
	{
		System.out.println("I am the First before suite");
	}
}
