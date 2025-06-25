package MavenPackage1.AmazonProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.IRetryanalyserPage;
import utilityPackage.ListenerLogicforTestcases;
import utilityPackage.TestData;
@Listeners(ListenerLogicforTestcases.class)
public class TC06_filters extends Baseclass
{
	@Test(retryAnalyzer = IRetryanalyserPage.class)
	public void searchwithfilters() throws EncryptedDocumentException, IOException
	{
	registration_Page reg=new registration_Page(driver);
	reg.hoverover(driver);
	loginPage login=new loginPage(driver);
	login.sigin1();
	login.usermail(TestData.Numericdata("Project1", 1, 0));
	login.contnuebutton1();
	login.userpassword(TestData.Numericdata("Project1", 1, 1));
	login.login();
	searchproductpage searchproduct=new searchproductpage(driver);
	searchproduct.seacrhproduct("Shoes");
	searchingwithfilterspage filters=new searchingwithfilterspage(driver);
	filters.brand();
	filters.price();
	//filters.material();
	}
}
