package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		// video 60
		// adding ASSERTIONS
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// will return false
		
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//will check the checkbox 
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
	// will return true
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
	//count the number of check boxes --> 
	//first you need to fin the common locators in this case is type='check box', means if you wants to count all the check boxes
	// example Family friends, senior citizen, Indian Armed forces, student, Unaccompanied Minor
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	
		
	
	
				
	
}
}
	