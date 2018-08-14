package Genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant{
	private static final String TestName = null;
	public WebDriver driver;
	static
	{
		System.setProperty(key,value);	
	}
	
	@BeforeMethod
	public void openapp()
	{
	 driver=new ChromeDriver();
	String url = Excelsheet.excel(excelpath,"Sheet1",1,3);
	driver.get(url);
	}
	@AfterMethod
	public void closeapp(ITestResult testresult)
	{
		String name = testresult.getName();
		int status = testresult.getStatus();
		if(status==2)
		{
			Selfie.getphoto(driver,photopath,TestName);
		}
		driver.close();
	}

}
