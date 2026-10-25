package Com.Webshop_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.DemoWebshop_POM.Home_Page;
import Com.DemoWebshop_POM.Login_Page;
import Com.DemoWebshop_POM.Welcome_page;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public FileUitlity fileUtility = new FileUitlity();
	public Welcome_page welcomePage;
	public Login_Page loginPage;
	public Home_Page homePage;
	public WebDriverUtility webDriverUtility = new WebDriverUtility();

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite-----DataBase Connection");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-----Reports Generation");
		spark = new ExtentSparkReporter(FrameworkConstants.reportsPath);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("DemoWebshop");

	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("Before Suite-----Launch Browser");

		String browser = fileUtility.readDatafromPropertyFile("browserName");
		String url = fileUtility.readDatafromPropertyFile("url");

		// String browser = System.getProperty("browserName");
		// String url = System.getProperty("baseurl");

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("runnning test on Chrome Browser");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Running test on Edge Broswer");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.out.println("Running test on Firefox Broswer");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct browser name: " + browser);
		}

		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("Before Method-----Log in to App");

		welcomePage = new Welcome_page(driver);
		welcomePage.getLoginBtn().click();

		loginPage = new Login_Page(driver);
		loginPage.getEmailTextFiled().sendKeys(fileUtility.readDatafromPropertyFile("username"));
		loginPage.getPasswordtextField().sendKeys(fileUtility.readDatafromPropertyFile("password"));
		loginPage.getLoginButton().click();

		homePage = new Home_Page(driver);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method-----Log out from App");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass-----Close browser");
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest-----Reports End");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite-----Database connection closed");

	}

}
