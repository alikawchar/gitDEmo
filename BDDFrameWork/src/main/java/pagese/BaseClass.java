package pagese;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver dr;

	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "/Users/kawcharali/Downloads/chromedriver"); 
		dr = new ChromeDriver();
		
	}
    public HomePage GoTourl() { // this mathod will navage u to home page.
    	dr.get("https://www.express.com/");
    	return new HomePage(dr); 
		
	}

}
