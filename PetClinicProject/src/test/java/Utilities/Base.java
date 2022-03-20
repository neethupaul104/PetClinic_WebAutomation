package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * Base class for Pet Clinic Project
 *
 * @author Neethu Paul
 */
public class Base {

	public static WebDriver driver;

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports ext;
	public static ExtentTest test;
	public static Properties prop = new Properties();
	public static FileInputStream file;

	@BeforeClass
	public static void InitialSetup() throws IOException {
		// Driver initialization and Browser launch
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/");
		System.out.println("Browser Launched");

		// properties for constants
		file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Constants\\Constant.properties");
		prop.load(file);

		// Extent report
		String ReportName = new SimpleDateFormat("MM-dd-yyyy_HH-SSS").format(new GregorianCalendar().getTime());
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "//Extent-Reports/" + "ExtentReports" + ReportName + ".html");
		ext = new ExtentReports();
		ext.attachReporter(htmlReporter);
		
	}

	public static WebDriver driver() {
		return driver;
	}
	

	@AfterClass
	public static void QuitBrowser() {
		driver.quit();
		ext.flush();
		System.out.println("Driver Quit");
	}
}
