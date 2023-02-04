package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	WebDriver driver;

	@Test
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		 driver.manage().window().maximize();
	
	//	 driver.close();
	
		
		 
		 
	}	
	
	

		

	
	
}



