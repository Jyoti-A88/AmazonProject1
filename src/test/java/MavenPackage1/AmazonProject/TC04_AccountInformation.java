package MavenPackage1.AmazonProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenerLogicforTestcases;
import utilityPackage.TestData;
@Listeners(ListenerLogicforTestcases.class)
public class TC04_AccountInformation extends Baseclass {
	@Test()
	public void editaccountdetails() throws EncryptedDocumentException, IOException
	{
	registration_Page reg=new registration_Page(driver);
	reg.hoverover(driver);
	loginPage login=new loginPage(driver);
	login.sigin1();
	login.usermail(TestData.Numericdata("Project1", 1, 0));
	login.contnuebutton1();
	login.userpassword(TestData.Numericdata("Project1", 1, 1));
	login.login();
	reg.hoverover(driver);
	editaccountdetailspage edit=new editaccountdetailspage(driver);
	edit.youraccount1();
	edit.loginandsecurity1();
	edit.editname1();
	edit.changename1("Jyoti");
	edit.savechanges1();
	
	}
}


