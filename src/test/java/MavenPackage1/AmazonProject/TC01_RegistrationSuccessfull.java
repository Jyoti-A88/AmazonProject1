package MavenPackage1.AmazonProject;

import org.testng.annotations.Test;

public class TC01_RegistrationSuccessfull extends Baseclass
{
@Test
public void registration()
{
	registration_Page reg=new registration_Page(driver);
	reg.hoverover(driver);
	reg.regstarthere();
	reg.regmail();
	reg.regcontbutton();
	reg.regprocbutton();
	reg.regmobilenum();
	reg.regusername();
	reg.regpwd();
	reg.regverifymob();
	reg.regcreateaccount();
	reg.regotp();
	reg.regverifyotp();
}


}
