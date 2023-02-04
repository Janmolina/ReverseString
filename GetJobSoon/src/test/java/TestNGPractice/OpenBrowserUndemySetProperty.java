package TestNGPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserUndemySetProperty {

	public static void main(String[] args) {
		
		//INVOQUE BROWSER
		
		//2.WebDriver is an interface --> WebDriver implements  methods + class methods
		//WebDriver driver = new ChromeDriver();
		//1.We need to create and object first to access to the method
		//ChromeDriver driver= new ChromeDriver();
		
		//Chromedriver.exe--. invoque Chrome Browser
		
		//webdriver.chrome.driver-->value path
		// in case you do with System.setProperty
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();	
	
	driver.get("https://www.onthemarket.com/");
	
		
		
		

	}

}


