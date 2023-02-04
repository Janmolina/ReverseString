package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateletcureOnLatetsDropdown {

	 public static void main (String []args) throws InterruptedException {
	
		 // video 53

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();	
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	// WHILE LOOP
	
/*	int i=1;
	while (i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		i++;
	} */
	
	
	// FOR LOOP

	for (int i=1; i<5; i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
	}
	
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	// validation
	
	
	
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	
	System.out.println (driver.findElement(By.id("divpaxinfo")).getText());
	
//while (true) means whatever you write in inside this loop will keep on execute continuosly, until this continue became false
// fist I crate variable int =1;
// then loop 1<5 , 1<4, 1<3, 1<2, 
// then i++, this will become incrementation will continue false and continue with the execution 	driver.findElement(By.id("hrefIncAdt")).click();//4 times
	//i++ (condition), while (i<5) (comparizon), int i=1;(initialization)
	// if you dont put i++ will run infinitive time and will not stop
	
	// can we use while loop isntead loop
}
}
