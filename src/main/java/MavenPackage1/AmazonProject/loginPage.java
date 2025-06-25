package MavenPackage1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class loginPage 
{
	WebDriver driver;
	WebDriverWait wait;
	SoftAssert s1=new SoftAssert();
	//@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") WebElement accountandlist;
	@FindBy(xpath="//span[@class='nav-action-inner']") WebElement signin;
	@FindBy(id="ap_email_login") WebElement username;
	@FindBy(id="continue") WebElement contnuebutton;
	@FindBy(id="ap_password") WebElement userpwd;
	@FindBy(id="signInSubmit") WebElement signbutton;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") WebElement profilename;
	@FindBy(xpath="(//h4[@class='a-alert-heading'])[1]") WebElement alertmessage;
	
	public void sigin1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		s1.assertEquals(signin.isDisplayed(), true);
		signin.click();
		Reporter.log(driver.getTitle());
	}
	
	public void usermail(String un)
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		s1.assertEquals(driver.getTitle().contains("www.amazon.in/ap/signin?)"),driver.getTitle());
		username.sendKeys(un);
		Reporter.log("User Name:"+un);
		
	}
	
	
	public void contnuebutton1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(contnuebutton));
		s1.assertEquals(contnuebutton.isEnabled(), true);
		contnuebutton.click();
	}
	
	public void userpassword(String pwd)
	{
		wait.until(ExpectedConditions.visibilityOf(userpwd));
		s1.assertEquals(userpwd.isEnabled(),true);
		userpwd.sendKeys(pwd);
		Reporter.log("User Entered Password");
	}
	
	public void login()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signbutton));
		s1.assertEquals(signbutton.isDisplayed(), true);
		signbutton.click();
	String ActualTitle= profilename.getText();
	String Expected="Hello, Jyoti";
	s1.assertEquals(ActualTitle,Expected );
		Reporter.log("Login successful with User Name:" +ActualTitle);
	}
	public void invalilogin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signbutton));
		s1.assertEquals(signbutton.isDisplayed(), true);
		signbutton.click();
	String ActualTitle= alertmessage.getText();
	String Expected="There was a problem";
	s1.assertEquals(ActualTitle,Expected );
		Reporter.log("Login with invalid credentials:" +ActualTitle);
	}
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
