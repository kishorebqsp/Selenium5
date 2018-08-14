package Genericlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Selfie {
	public static String getphoto(WebDriver driver,String folder,String testcasename)
	{
		String path="";
		try {
		Date d=new Date();
		String date = d.toString().replace(":","-");
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
 path = folder+testcasename+date+".png";
		FileUtils.copyFile(src,new File(path));
		}
		catch(Exception e)
		{
			Reporter.log("photo should be taken");
		}
		
		return path;
	}

}
