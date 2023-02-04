package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// video 55
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		////*[@value='MAA']
		////*[@value='BLR']
		
		
		// located first the box 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		// selecting the cities
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		// from and To Dropdowns  we have two columns thats why i put [2] in ordet to select the second columm 
		
		
	}

}
