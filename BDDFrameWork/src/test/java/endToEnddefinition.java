import org.junit.Before;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagese.BaseClass;

public class endToEnddefinition {
	
	BaseClass b;
	WebElement dr;  
	
	
	@cucumber.api.java.Before
	@Given("^go to facebook\\.com$")

	public void go_to_facebook_com() throws Throwable {
	 dr.get("https:facebook.com");
	   
	}

		
		@Given("^go to url$")
		public void go_to_url() throws Throwable {
		    
		}

		@When("^hover over on men manue$")
		public void hover_over_on_men_manue() throws Throwable {
		    
		}

		@When("^click on new arrivels$")
		public void click_on_new_arrivels() throws Throwable {
		    
		}

		@When("^click on shirt options$")
		public void click_on_shirt_options() throws Throwable {
		    
		}

		@When("^click on any shirt$")
		public void click_on_any_shirt() throws Throwable {
		    
		}

		@Then("^user should see sussessful message$")
		public void user_should_see_sussessful_message() throws Throwable {
		    
		}


	}



