package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	public WebDriver driver;
	@BeforeMethod
	public void opnapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void loginfb()
	{
		driver.findElement(By.name("firstname")).sendKeys("bjbjbnbbfj");
		driver.findElement(By.name("reg_email__")).sendKeys("45465456465789");
		String t = driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
	}
@AfterMethod
public void closeapp()
{
	driver.close();
}
}
