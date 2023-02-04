package TestNGDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day_02 {
	
	@Test
	public void loan()
	{
		System.out.println("loan");
	}

	@BeforeTest 
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
	
}
