package Scripts;
import org.testng.annotations.Test;

import Genericlib.Basetest;
import Genericlib.Excelsheet;
import Pom.Homepage;
import Pom.Loginpage;
import Pom.Wishlistpage;

public class Wishlist extends Basetest {
@Test
public void Wishlisttestcase()
{

		String email = Excelsheet.excel(excelpath,"Sheet2",1,0);
		String pass = Excelsheet.excel(excelpath,"Sheet2",1,1);
		String name = Excelsheet.excel(excelpath,"Sheet2",1,2);
		Loginpage l=new Loginpage(driver);
		l.signinbtn();
		l.emailadddresstxtbox(email);
		l.passwordtxtbox(pass);
		l.loginbtn();
		Homepage h=new Homepage(driver);
		h.wishlistbtn();
		Wishlistpage w=new Wishlistpage(driver);
		w.nametxtbox(name);
		w.savebtn();
		w.signoutbtn();

	}

}
