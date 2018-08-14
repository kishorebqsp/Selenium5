package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Homepage extends Basepage{
	@FindBy(id="search_query_top")
	private WebElement search;
	
	@FindBy(name="submit_search")
	private WebElement searchbtn;
	
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement mywhish;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void searchtxtbox(String item)
{
	search.sendKeys(item);
}
public void serachbutton()
{
	searchbtn.click();
}
public void wishlistbtn()
{
	mywhish.click();
}
}
