package MavenPackage1.AmazonProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkoutpage 
{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']") WebElement proceedbutton;
	@FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])[1]") WebElement changeaddress;
	@FindBy(id="add-new-address-desktop-sasp-tango-link") WebElement addnewaddress;
	@FindBy(xpath="//a[@class='a-button-text']") WebElement addaddress;
	@FindBy(id="address-ui-widgets-enterAddressFullName") WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement mobilenum;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement postalcode;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement addressline1;

	@FindBy(id="address-ui-widgets-enterAddressLine2") WebElement addressline2;
	@FindBy(xpath="address-ui-widgets-landmark") WebElement landmark;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement city;
	@FindBy(xpath="//select[@name='address-ui-widgets-enterAddressStateOrRegion']") WebElement statedropdown;
@FindBy(xpath="(//input[@class='a-button-input'])[5]") WebElement useaddress;
	@FindBy(xpath="//input[contains(@value, 'COD')]") WebElement cashondelivery;
	@FindBy(xpath="(//input[contains(@value, 'SelectableAddCreditCard')]") WebElement cardpayment;
	@FindBy(xpath="	//input[@type='radio' and contains(@value, 'APB')]") WebElement amazonpaybalance;

	@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']") WebElement usethispaymentmethod;
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button']") WebElement revieworder;

	
	
	public void proceedbutton1()
	{
		wait.until(ExpectedConditions.visibilityOf( proceedbutton));
		assertEquals( proceedbutton.isDisplayed(),true);
		proceedbutton.click();
		//Reporter.log("Add to cart button is clickable");
	}
	public void addaddress1()
	{	
		wait.until(ExpectedConditions.visibilityOf(changeaddress));
			changeaddress.click();
			wait.until(ExpectedConditions.visibilityOf(addnewaddress));
			addnewaddress.click();
			wait.until(ExpectedConditions.visibilityOf(fullname));
			fullname.sendKeys("Jyoti");
			wait.until(ExpectedConditions.visibilityOf(mobilenum));
			mobilenum.sendKeys("8152999644");
			wait.until(ExpectedConditions.visibilityOf(postalcode));
			postalcode.sendKeys("582209");
			wait.until(ExpectedConditions.visibilityOf(addressline1));
			addressline1.sendKeys("Bazar Street");
			wait.until(ExpectedConditions.visibilityOf(addressline2));
			addressline2.sendKeys("Near Bus Stop");		
			 wait.until(ExpectedConditions.visibilityOf(useaddress));
				useaddress.click();
				//driver.switchTo().alert().dismiss();
			
	}
	public void paymentoption()
	{
		
		/*wait.until(ExpectedConditions.visibilityOf( amazonpaybalance));
		assertEquals(amazonpaybalance.isDisplayed(),true);
		amazonpaybalance.click();
		wait.until(ExpectedConditions.visibilityOf( cardpayment));
		assertEquals( cardpayment.isDisplayed(),true);
		cardpayment.click();*/
		wait.until(ExpectedConditions.visibilityOf( cashondelivery));
		assertEquals( cashondelivery.isDisplayed(),true);
		cashondelivery.click();
		wait.until(ExpectedConditions.visibilityOf( usethispaymentmethod));
		assertEquals( usethispaymentmethod.isDisplayed(),true);
		usethispaymentmethod.click();
		//Reporter.log("Add to cart button is clickable");
	}
	public void revieworder1()
	{
		wait.until(ExpectedConditions.visibilityOf(  revieworder));
		assertEquals(  revieworder.isDisplayed(),true);
		 revieworder.click();
		//Reporter.log("Add to cart button is clickable");
	}
	public checkoutpage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

}
