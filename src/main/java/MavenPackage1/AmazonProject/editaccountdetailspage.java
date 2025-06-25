package MavenPackage1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class editaccountdetailspage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//span[.='Your Account']") WebElement youraccount;
	@FindBy(xpath="//span[.='Edit login, name, and mobile number']") WebElement loginandsecurity;
	@FindBy(id="NAME_BUTTON") WebElement editname;
	@FindBy(id="ap_customer_name") WebElement changename;
	@FindBy(id="cnep_1C_submit_button") WebElement savechanges;
	@FindBy(xpath="//div[@id='SUCCESS_MESSAGES']") WebElement successmessage;
	
	public void youraccount1()
	{
		wait.until(ExpectedConditions.visibilityOf(youraccount));
		youraccount.click();
		Assert.assertEquals(driver.getTitle(), "Your Account");
		Reporter.log("Verified the page title is : " +driver.getTitle() );
	}
	public void loginandsecurity1()
	{
		wait.until(ExpectedConditions.titleContains("Your Account"));
		Assert.assertEquals(loginandsecurity.isDisplayed(), true);
		loginandsecurity.click();
	}
	public void  editname1()
	{
		wait.until(ExpectedConditions.titleContains("Login and Security"));
		Assert.assertNotNull(editname);
		 editname.click();
	}
	public void  changename1(String name)
	{
		wait.until(ExpectedConditions.visibilityOf( changename));
		changename.sendKeys(Keys.CONTROL+"a");
		changename.sendKeys(Keys.BACK_SPACE);
		Assert.assertNotNull(changename);
		changename.sendKeys(name);
	}
	public void  savechanges1()
	{
		wait.until(ExpectedConditions.visibilityOf(savechanges));
		savechanges.click();
		String Successmsg= successmessage.getText();
		Assert.assertEquals(Successmsg, "Name updated.");
		Reporter.log("In Accounct "+Successmsg +" successfully");
		
	}
	public editaccountdetailspage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
