package TestNGDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day_01 {


	
	
	
	@Test
	public void demo()
	{
		System.out.println("Hello");
	}

	@AfterTest
	public void LastExecution()
	{
		System.out.println("will execute after test");
	}

	
	@Test
	public void SencondTest()
	{
		System.out.println("bye");
	}
	
}
	
	
	

