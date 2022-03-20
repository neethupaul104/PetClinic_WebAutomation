package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.Base;
import Utilities.CommonMethods;

/**
 * Home Page elements class
 *
 * @author Neethu Paul
 */

public class Home extends Base {

	CommonMethods commonMethodsObj = new CommonMethods();	
	
	public WebElement HomeImageIcon() {
		WebElement HomeImageIcon = driver.findElement(By.xpath("//img[@class=\"img-responsive\"]"));
		return HomeImageIcon;
	}

}
