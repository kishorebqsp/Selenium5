package Scripts;


import org.testng.annotations.Test;

import Genericlib.Basetest;
import Genericlib.Excelsheet;
import Pom.Loginpage;

public class Invalidlogin extends Basetest{
@Test
public void invalidtestcase()
{
	
		String email = Excelsheet.excel(excelpath,"Sheet3",1,0);
		String pass = Excelsheet.excel(excelpath,"Sheet3",1,1);

		Loginpage l=new Loginpage(driver);
		l.signinbtn();
		l.emailadddresstxtbox(email);
		l.passwordtxtbox(pass);
		l.loginbtn();
	}

}
