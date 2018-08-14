package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Loginpage extends Basepage {
	@FindBy(linkText="Sign in")
	private WebElement signbtn;
	
	@FindBy(id="email")
	private WebElement emailaddress;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void signinbtn()
	{
		signbtn.click();
	}
	public void emailadddresstxtbox(String email)
	{
		emailaddress.sendKeys(email);
	}
	public void passwordtxtbox(String pass)
	{
		password.sendKeys(pass);
	}
	public void loginbtn()
	{
		login.click();
	}
}
