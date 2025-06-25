package MavenPackage1.AmazonProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.IRetryanalyserPage;
import utilityPackage.ListenerLogicforTestcases;
import utilityPackage.TestData;
@Listeners(ListenerLogicforTestcases.class)
public class TC08_sortproduct extends Baseclass {
	@Test(retryAnalyzer = IRetryanalyserPage.class)
	public void sortproducts() throws InterruptedException, EncryptedDocumentException, IOException
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
	sortproductpage  sort=new sortproductpage (driver);
	sort.priceLH();
	Thread.sleep(5000);
	sort.priceHL();
	Thread.sleep(5000);
	sort.selectrating();
	Thread.sleep(5000);
	sort.selectbestseller();
	}

}
