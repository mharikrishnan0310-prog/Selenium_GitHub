package Com.Webshop_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUitlity {
	
	public String readDatafromPropertyFile(String key) throws IOException {
		
	FileInputStream fis = new FileInputStream(FrameworkConstants.propertyFilePath);
	 Properties pro = new Properties();
	 pro.load(fis);
	 String value = pro.getProperty(key);
	 return value;
	}

	public String readDatafromExcelFile(String SheetName, int RowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(FrameworkConstants.excelFilePath);
		 Workbook wb = WorkbookFactory.create(fis);
		 String value = wb.getSheet(SheetName).getRow(RowNum).getCell(cellNum).getStringCellValue();
		 return value;
		 
	}
}
