package Scripts;


import org.testng.annotations.Test;

import Genericlib.Basetest;
import Genericlib.Excelsheet;
import Pom.Detailspage;
import Pom.Dresspage;
import Pom.Homepage;
import Pom.Loginpage;

public class Validlogin extends Basetest{
@Test
public void validlogintestcase()
{
	String email = Excelsheet.excel(excelpath,"Sheet1",1,0);
	String pass = Excelsheet.excel(excelpath,"Sheet1",1,1);
	String item = Excelsheet.excel(excelpath,"Sheet1",1,2);
	Loginpage l=new Loginpage(driver);
	l.signinbtn();
	l.emailadddresstxtbox(email);
	l.passwordtxtbox(pass);
	l.loginbtn();
	Homepage h=new Homepage(driver);
	h.searchtxtbox(item);
	h.serachbutton();
	Dresspage d=new Dresspage(driver);
	d.dressselected();
	Detailspage de=new Detailspage(driver);
	de.addtocart();
	de.closebtn();
	
	}

}
