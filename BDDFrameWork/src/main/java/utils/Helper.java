 package utils;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Helper {
 
	
	public static void hoverOver (WebElement element ) {
		
		
		
	}
	
	public static Properties readfile(String path) throws FileNotFoundException, IOException {
		FileInputStream fi = new FileInputStream(new File(path));
		Properties p = new Properties();
		p.load(fi);
		return p;
	}

}
