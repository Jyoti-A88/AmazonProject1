package MavenPackage1.AmazonProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class paymentpage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@name='ppw-instrumentRowSelection']") List<WebElement> paymentoptions;
	@FindBy(xpath="//input[contains(@value, 'COD')]") WebElement cashondelivery;
	@FindBy(xpath="(//input[contains(@value, 'SelectableAddCreditCard')]") WebElement cardpayment;
	@FindBy(xpath="	//input[@type='radio' and contains(@value, 'APB')]") WebElement amazonpaybalance;
	@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']") WebElement usethispaymentmethod;
	@FindBy(xpath="//input[contains(@value, 'NetBanking')]") WebElement NetBanking;
	@FindBy(xpath="//input[contains(@value, 'UnifiedPaymentsInterface')]") WebElement UPIapps;
	@FindBy(xpath="//input[contains(@value, 'EMI')]") WebElement EMI;
	@FindBy(xpath="//input[@placeholder='Enter Code']") WebElement Entercodefield;
	@FindBy(xpath="//input[@value='Apply']") WebElement Applybutton;
	
	public void paymentmethods()
	{  
		int paymentoptionssize=paymentoptions.size();
		Reporter.log("Total payment options : " +paymentoptionssize);
		for(int i=0;i<paymentoptionssize;i++)
		{
			 WebElement option = paymentoptions.get(i);
			 wait.until(ExpectedConditions.visibilityOf(option));
			 if (option.isDisplayed() && option.isEnabled()) {
	                option.click();
	                wait.until(ExpectedConditions.elementToBeClickable(option));
	               Reporter.log( "Payment option " +i +" is clickable");
			 }
		}     
		}
	public void couponcode()
	{
		wait.until(ExpectedConditions.visibilityOf(amazonpaybalance));
		amazonpaybalance.click();
		Assert.assertEquals(Entercodefield.isDisplayed(), true);
		Entercodefield.sendKeys("123456");
		Applybutton.click();
		
	}
			 public paymentpage(WebDriver driver)
				{
					this.driver=driver;
					this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
					PageFactory.initElements(driver, this);
				}
	
}
