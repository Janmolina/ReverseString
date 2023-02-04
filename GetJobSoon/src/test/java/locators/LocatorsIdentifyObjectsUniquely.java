package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdentifyObjectsUniquely {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//video 57
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		////*[@value='MAA']
		////*[@value='BLR']
		
		
		// located first the box 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		// selecting the cities
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='MAA']")).click();
		
		// from and To Dropdowns  we have two columns thats why i put [2] in ordet to select the second columm 
		
		//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		
		//NOTE:(PARENT CHILD RELATIONSHIP XPATH --> in order to do Unique xpath in dropdown  you have to do PArentchild xpath relationship
		// that will help you to find uniquely without index

		
		////input[@value='Google Search']
		
	//	--> Parent --> to Child
		////div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']
		
		
	}

}
