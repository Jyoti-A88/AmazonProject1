package MavenPackage1.AmazonProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.IRetryanalyserPage;
import utilityPackage.ListenerLogicforTestcases;
@Listeners(ListenerLogicforTestcases.class)
public class TC15_withoutlogin extends Baseclass{
	
	@Test(retryAnalyzer = IRetryanalyserPage.class)
	public void withoutloginreachcartpage() throws InterruptedException
	{
	searchproductpage searchproduct=new searchproductpage(driver);
	searchproduct.seacrhproduct("Toys for 3 year kid");
	addtocartpage product=new addtocartpage(driver);
	product.addtocart();
	removeitemfromcartpage deleteitem=new removeitemfromcartpage(driver);
	deleteitem.cartcontainer1();
	checkoutpage cout=new checkoutpage(driver);
	cout.proceedbutton1();
	
	}
}
