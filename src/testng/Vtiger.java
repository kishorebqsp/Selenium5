package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Vtiger {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		String t = driver.getTitle();
		//Assert.assertEquals(t,"Dashboard123");
	SoftAssert s=new SoftAssert();
	s.assertEquals(t,"Dashboard123");
		Reporter.log(t,true);
		
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
		s.assertAll();
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
