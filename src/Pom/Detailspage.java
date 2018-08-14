package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Detailspage extends Basepage{
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//span[@title='Close window']")
	private WebElement close;
	
	public Detailspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
}
	public void addtocart()
	{
		cart.click();
}
	public void closebtn()
	{
		close.click();
}
}