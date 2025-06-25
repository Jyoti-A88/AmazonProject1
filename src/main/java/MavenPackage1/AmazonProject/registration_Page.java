package MavenPackage1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class registration_Page {
	WebDriver driver;
	WebDriverWait wait;
	SoftAssert s1=new SoftAssert();
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") WebElement accountandlist;
	@FindBy(xpath="//a[@class='nav-a']") WebElement starthere;
	@FindBy(name="email") WebElement mailid;
	
	@FindBy(className="a-button-input") WebElement continuebutton;
	@FindBy(className="a-button-input") WebElement proceedbutton;
	@FindBy(id="ap_phone_number") WebElement mobilenum;
	@FindBy(id="ap_customer_name") WebElement username;
	@FindBy(id="ap_password") WebElement password;
	
	@FindBy(id="continue") WebElement verifymob;
	@FindBy(id="auth-create-account-btn") WebElement createaccount;
	@FindBy(xpath="//input[@name='code']") WebElement otp;
	@FindBy(id="cvf-submit-otp-button") WebElement verifyotp;
	
	public void hoverover(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(accountandlist));
		s1.assertEquals(accountandlist.isDisplayed(), true);
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	public void regstarthere()
	{
		wait.until(ExpectedConditions.elementToBeClickable(starthere));
		starthere.click();
	}
	public void regmail()
	{
		wait.until(ExpectedConditions.visibilityOf( mailid));
		 mailid.sendKeys("abc123@gamil.com");;
	}
	public void regcontbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
		continuebutton.click();
	}
	public void regprocbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(proceedbutton));
		 proceedbutton.click();
	}
	public void regmobilenum()
	{
		wait.until(ExpectedConditions.visibilityOf( mobilenum));
		 mobilenum.sendKeys("12345678");;
	}
	public void regusername()
	{
		wait.until(ExpectedConditions.visibilityOf( username));
		username.sendKeys("ABC");;
	}
	public void regpwd()
	{
		wait.until(ExpectedConditions.visibilityOf(  password));
		 password.sendKeys("123456");;
	}
	public void regverifymob()
	{
		wait.until(ExpectedConditions.elementToBeClickable(verifymob));
		verifymob.click();
	}
	public void regcreateaccount()
	{
		wait.until(ExpectedConditions.elementToBeClickable(createaccount));
		createaccount.click();
	}
	public void regotp()
	{
		wait.until(ExpectedConditions.visibilityOf( otp));
		otp.sendKeys("123456");;
	}
	public void regverifyotp()
	{
		wait.until(ExpectedConditions.elementToBeClickable(verifyotp));
		verifyotp.click();
	}
	
	public registration_Page(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
