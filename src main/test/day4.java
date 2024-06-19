package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(dataProvider="getData")
	public void Bloan(String username, String password)
	{
		System.out.println("We would be here");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void testFailure()
	{
		System.out.println("I am the test failure");
		Assert.assertTrue(false);
	}
	
	
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination: User name, password, good credit history
		//2nd combination: User name, password, no credit history
		//3rd combination: Fraudulent credit history
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//columns in a row are values for a particular combination(row)
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpasssword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpasssword";
		return data;
	}

}
