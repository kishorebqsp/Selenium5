package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		FileInputStream f=new FileInputStream("./Data/excel.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Cell s = wb.getSheet("Sheet1").getRow(1).getCell(5);
				s.setCellValue("fail");
				
				FileOutputStream fs=new FileOutputStream("./Data/excel.xlsx");
				wb.write(fs);
	}

}
