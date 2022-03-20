package TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import PageObjects.Home;
import Utilities.Base;
import Utilities.CommonMethods;
/**
 * Test class Home Page
 *
 * @author Neethu Paul
 */
public class HomeTC extends Base {

	Home homeObj = new Home();
	CommonMethods commonMethodsObj = new CommonMethods();

	
	@Test
	public void HomeImageIcon_Validation() throws IOException {
		try {

			Boolean ImageStatus = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
					+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0",
					homeObj.HomeImageIcon());

			Assert.assertTrue("The home image is not available in home page", ImageStatus);
			test.log(Status.PASS, "The home image is available in home page");			

		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}
	}
}
