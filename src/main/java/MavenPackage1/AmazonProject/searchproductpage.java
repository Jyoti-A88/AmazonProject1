package MavenPackage1.AmazonProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class searchproductpage
{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement search;
	
	public void seacrhproduct(String productname)
	{
		wait.until(ExpectedConditions.visibilityOf(search));
		assertEquals(search.getAriaRole().contains("search"),true);
		search.sendKeys(productname+Keys.ENTER);
		Reporter.log("Searchbar is visible and able to search "+productname);
	}
	
	public searchproductpage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

}
