package TestNGDemo.pageobjects;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage () {
		
		// initilization 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		//Page Factory
		
		// what attibute you will like to find ID
		// what is the value --> userEmail
		
		// is only focus in action and elements
		@FindBy(id="userEmail")
		webElement userEmail;
		
		@FindBy(id="userEmail")
		webElement userEmail;
		
		
		
		
	}
	

}
