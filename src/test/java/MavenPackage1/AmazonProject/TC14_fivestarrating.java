package MavenPackage1.AmazonProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.IRetryanalyserPage;
import utilityPackage.ListenerLogicforTestcases;
import utilityPackage.TestData;
@Listeners(ListenerLogicforTestcases.class)
public class TC14_fivestarrating extends Baseclass {
	@Test(retryAnalyzer = IRetryanalyserPage.class)
	public void fivestarrating() throws EncryptedDocumentException, IOException, InterruptedException
	{
	registration_Page reg=new registration_Page(driver);
	reg.hoverover(driver);
	loginPage login=new loginPage(driver);
	login.sigin1();
	login.usermail(TestData.stringdata("Project1", 2, 0));
	login.contnuebutton1();
	login.userpassword(TestData.Numericdata("Project1", 2, 1));
	login.login();
	reg.hoverover(driver);
	 fivestarratingpage rating=new  fivestarratingpage(driver);
	 rating.yourorder1();
	 rating.ordersdropdown();
	 rating.writereveiw1();
	 //rating.clearoption();
	 rating.fivestarrating();
	 //rating.writereviewtext1();
	 //rating.writereviewtitle1();
	 //rating.submitbutton();
	
	}
}
