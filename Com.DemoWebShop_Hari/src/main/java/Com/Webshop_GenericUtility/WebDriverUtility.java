package Com.Webshop_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void webPageScreenshot(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Temp = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File(FrameworkConstants.ScreenshotPath);
		FileHandler.copy(Temp, Dest);

	}

	public void selectByvisibleText(WebElement dropdownElement, String text) {

		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText(text);
	}

	public void JavaScriptScrollTillEelement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void JavaScriptClick(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	
	public void javaScriptPopupaccept(WebDriver driver) {
		driver.switchTo().alert().accept();

	}
}
