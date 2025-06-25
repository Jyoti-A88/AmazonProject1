package MavenPackage1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class searchingwithfilterspage
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[5]") WebElement brand;
	@FindBy(xpath="	(//span[@class='a-size-base a-color-base'])[46]") WebElement price2;
	//@FindBy(xpath="	(//span[@class='a-size-base a-color-base'])[74]") WebElement womencategory;
	@FindBy(xpath="	(//span[@class='a-size-base a-color-base'])[99]") WebElement shoematerial;
	
	public void brand()
	{
		wait.until(ExpectedConditions.elementToBeClickable(brand));
		Assert.assertEquals(brand.isDisplayed(), true);
		brand.click();
		
		Reporter.log(brand.getText() +" is selected");
	}

	public void price()
	{
		wait.until(ExpectedConditions.elementToBeClickable( price2));
		Assert.assertEquals(price2.isDisplayed(),true);
		price2.click();
		Reporter.log(price2.getText() +"  price is selected");
	}
	
	/*public void material()
	{
		wait.until(ExpectedConditions.elementToBeClickable(shoematerial));
		 Assert.assertEquals(shoematerial.isDisplayed(),true);
		 shoematerial.click();
				Reporter.log(shoematerial.getText() +" is selected");
	}*/
	
	
	public searchingwithfilterspage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
}
