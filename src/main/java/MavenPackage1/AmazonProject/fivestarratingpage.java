package MavenPackage1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class fivestarratingpage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//a[@id='nav_prefetch_yourorders']") WebElement yourorder;
	@FindBy(xpath="//select[@name='timeFilter']") WebElement selectorders;
	@FindBy(xpath="(//a[@class='a-button-text'])[3]") WebElement writereview;
	@FindBy(xpath="(//span[.='Clear'])[1]") WebElement clear;
	@FindBy(xpath="//img[@alt='select to rate item five star.']") WebElement starrating;
	@FindBy(xpath="//textarea[@id='reviewText']") WebElement writereviewtext;
	@FindBy(xpath="//input[@id='reviewTitle']") WebElement reviewtitle;
	@FindBy(xpath="(//input[@type='submit'])[2]") WebElement submit;
	
	public void yourorder1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(yourorder));		
		yourorder.click();
		Assert.assertEquals(driver.getTitle(), "Your Orders");
		Reporter.log("Verified the page title is : " +driver.getTitle() );
	}
	public void ordersdropdown() {
		Select s1=new Select( selectorders);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='timeFilter']")));
		s1.selectByVisibleText("2025");
		Assert.assertEquals(s1.getFirstSelectedOption().getText(), "2025", "Year 2025 was not selected");
		
	}
	public void writereveiw1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(writereview));
		Assert.assertEquals(writereview.isEnabled(),true );
		writereview.click();
	}
	public void clearoption()
	{
		wait.until(ExpectedConditions.titleContains("Review"));
		Assert.assertEquals(clear.isDisplayed(),true );
		clear.click();	
	}
	
	public void fivestarrating()
	{
		wait.until(ExpectedConditions.elementToBeClickable(starrating));		
		starrating.click();
		//Assert.assertEquals(starrating.isEnabled(), true);
		Reporter.log("Click on 5star rating");
	}
	public void writereviewtext1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(writereviewtext));
		
		writereviewtext.sendKeys("Excellent");
		//Reporter.log(driver.getTitle());
	}
	public void writereviewtitle1()
	{
		wait.until(ExpectedConditions.elementToBeClickable( reviewtitle));
		
		 reviewtitle.sendKeys("Value for money");
		//Reporter.log(driver.getTitle());
	}
	
	public void submitbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		
		submit.click();
		//Reporter.log(driver.getTitle());
	}
	
	public fivestarratingpage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}


}
