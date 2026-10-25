package Com.Webshop_GenericUtility;

public interface FrameworkConstants {

	JavaUtility javaUtility = new JavaUtility();
	Object screenshotsPath = null;
	static String propertyFilePath = "./src/test/resources/TestData/commonData.properties";
	static String excelFilePath = "./src/test/resources/TestData/testScriptData.xlsx";

	static String ScreenshotPath = "./screenshot/" + javaUtility.LocalDateAndTime() + ".png";
	static String reportsPath = "./reports/" + javaUtility.LocalDateAndTime() + ".html";

}
