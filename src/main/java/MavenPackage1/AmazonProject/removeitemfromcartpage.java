package MavenPackage1.AmazonProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class removeitemfromcartpage 
{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//div[@id='nav-cart-count-container']") WebElement cartcontainer;
	@FindBy(xpath="//span[@class='a-icon a-icon-small-trash']") WebElement deleteitem;
	
	public void cartcontainer1()
	{
		wait.until(ExpectedConditions.visibilityOf( cartcontainer));
		assertEquals( cartcontainer.isDisplayed(),true);
		cartcontainer.click();
		Reporter.log("Add to cart container is clickable");
	}
	public void deleteitem1()
	{
		wait.until(ExpectedConditions.visibilityOf(deleteitem));
		assertEquals( deleteitem.isDisplayed(),true);
		deleteitem.click();
		Reporter.log("Product is deleted");
	}
	
	
	public removeitemfromcartpage (WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

}
