package MiscellaneousTopicsSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndDeletCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//video 108
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		

		// maximize browser
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("abc");
	
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
