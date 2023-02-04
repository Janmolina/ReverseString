package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssigmentCheckboxesExcersice {
	
	//pending  excercices -->67
	
	public static void main (String[]args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();	
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

	Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	

}
}