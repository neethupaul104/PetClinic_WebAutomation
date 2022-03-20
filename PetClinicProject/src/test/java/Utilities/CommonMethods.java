package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Common Methods for PetClinic Project
 *
 * @author Neethu Paul
 */
public class CommonMethods extends Base {

	public String TakeScreenshot(String result) throws IOException {
		Date d = new Date();
		String fname = d.toString().replace(":", "_").replace(" ", "_");
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String fileName_loc = "./Extent-Reports//Screenshot//" + fname + "_" + result + ".jpg";
		try {
			FileUtils.copyFile(SrcFile, new File(fileName_loc));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (fileName_loc);
	}

	public void explicitWaitWeb(WebElement element) throws InterruptedException {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
