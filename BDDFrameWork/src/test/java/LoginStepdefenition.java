import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefenition {
	
	
WebDriver dr;
@Test
@Given("^open browser$")
public void open_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "/Users/kawcharali/Downloads/chromedriver");
   dr= new ChromeDriver(); 
}

@Test
@Given("^go to facebook\\.com$")

public void go_to_facebook_com() throws Throwable {
 dr.get("https:facebook.com");
   
}

@When("^user type valid userID  in username text box$")
public void user_type_valid_userID_in_username_text_box() throws Throwable {
   dr.findElement(By.xpath("//*[@id=\"u_0_2_Kg\"]/div[1]/div[1]")).sendKeys("userID");
    
}

@When("^user type valid password  in password text box$")
public void user_type_valid_password_in_password_text_box() throws Throwable {
	dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("userPassword");
    
}

@When("^user click on log in button$")
public void user_click_on_log_in_button() throws Throwable {
	dr.findElement(By.xpath("//*[@id=\"u_0_5_1D\"]")).click();
}

@Then("^user should see his profilePage$")
public void user_should_see_his_profilePage() throws Throwable {
    if (dr.findElement(By.id("")).isDisplayed()) {
    	
    	System.out.println("logged in");
    }
    
}



@When("^user type \"([^\"]*)\"  in username text box$")
public void user_type_in_username_text_box(String arg1) throws Throwable {
	   dr.findElement(By.xpath("//*[@id=\"u_0_2_Kg\"]/div[1]/div[1]")).sendKeys("arg1");
}

@When("^user type \"([^\"]*)\"  in password text box$")
public void user_type_in_password_text_box(String arg1) throws Throwable {
	dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(arg1);
}

@Then("^user should not see his profilePage$")
public void user_should_not_see_his_profilePage() throws Throwable {
	
}

}
