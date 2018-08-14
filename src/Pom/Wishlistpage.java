package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Wishlistpage extends Basepage {
	@FindBy(id="name")
	private WebElement nametb;
	
	@FindBy(id="submitWishlist")
	private WebElement save;
	

	@FindBy(linkText="Sign out")
	private WebElement signout;
	public Wishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void nametxtbox(String name)
{
	nametb.sendKeys(name);
}
public void savebtn()
{
	save.click();
}
public void signoutbtn()
{
	signout.click();
}
}
