package MiscellaneousTopicsSeleniumWebdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class handleScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//video 109
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jande\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://google.com");
		
				
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// we need to see in our local machine the screenshot
		FileUtils.copyFile(src,new File("C:\\Users\\jande\\screenshot.png"));
		
		
		// first has to download  jars of apachi poi , then I unziped  and add in my external Jars  
       //https://commons.apache.org/proper/commons-io/download_io.cgi
       //Binaries//commons-io-2.11.0-bin.zip
		
		// 1. go to the project properties /Javabuildpath/addexternaljars/unzipedfile/importallthejars/ok
		//"C:\\Users\\jande\\ -- >located in my local machine and my users files
		// and then I added the whole sinxtax ("C:\\Users\\jande\\screenshot.png"));
		
		
		
       

	}

}
