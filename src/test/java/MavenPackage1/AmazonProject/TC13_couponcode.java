package MavenPackage1.AmazonProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.IRetryanalyserPage;
import utilityPackage.ListenerLogicforTestcases;
import utilityPackage.TestData;
@Listeners(ListenerLogicforTestcases.class)
public class TC13_couponcode extends Baseclass{
	
	@Test(retryAnalyzer = IRetryanalyserPage.class)
	public void couponcode() throws InterruptedException, EncryptedDocumentException, IOException
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
	searchproduct.seacrhproduct("Toys");
	addtocartpage product=new addtocartpage(driver);
	product.addtocart();
	Thread.sleep(3000);
	product.cartcount();
	removeitemfromcartpage deleteitem=new removeitemfromcartpage(driver);
	deleteitem.cartcontainer1();
	checkoutpage cout=new checkoutpage(driver);
	cout.proceedbutton1();
	//cout.addaddress1();
	paymentpage payment=new paymentpage(driver);
	payment.couponcode();
	}
}
