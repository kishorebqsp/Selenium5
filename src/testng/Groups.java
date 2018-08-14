package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
	@Test
	public void inbox()
	{
		Reporter.log("inbox",true);
	}
	@Test
	public void sentitem()
	{
		Reporter.log("sentitem",true);
	}
	@Test(groups= {"draft"})
	public void draft()
	{
		Reporter.log("draft",true);
	}

}
