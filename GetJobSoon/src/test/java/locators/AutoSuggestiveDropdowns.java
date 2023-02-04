package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	// video 59
		
		//Autosuggestive Drowpdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
	List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//driver.findElements --> list of elements all options the return type of findElements is List of elements how you know that 
	
	// Iterate with for loop
	for (WebElement option: options)
	{
		if (option.getText().equalsIgnoreCase("India"))
		{
			option.click();
			break;
		}
	}
		
	}

	
}
