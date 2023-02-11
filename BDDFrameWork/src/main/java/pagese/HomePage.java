package pagese;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Helper;

public class HomePage {
	
	@FindBy (xpath = "expath of man manue") WebElement MenManuebar;
	public void hoverOveronMen () {
		Helper.hoverOver(null);
	}
	
	

}
