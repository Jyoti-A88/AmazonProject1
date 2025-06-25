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
import org.testng.asserts.SoftAssert;

public class productdetailpage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="(//img[@class='s-image'])[2]") WebElement product1;
	@FindBy(xpath="(//i[contains(@class, 'a-icon-star-mini')])[1]") WebElement rating;
	@FindBy(xpath="//span[@class='a-size-small a-color-base'][1]") WebElement ratingtext;
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]") WebElement price;
	@FindBy(xpath=" //h3[@class='product-facts-title'][1]") WebElement description;
	
	public void firstproduct()
	{
		wait.until(ExpectedConditions.elementToBeClickable(product1));
		Assert.assertEquals(product1.isDisplayed(), true);
		product1.click();
	}
	
	public void ratings()
	{
	
		wait.until(ExpectedConditions.visibilityOf(rating));
		Boolean ratDisp=rating.isDisplayed();
		Assert.assertEquals(ratDisp, true);
		Reporter.log("Rating of product is : "	+ratingtext.getText());
		/*if(ratDisp==true) {
			Reporter.log("Rating is Displayed"	+rating.getText());
		}
		else {
			Reporter.log("Rating not is Displayed");
		}*/
		}
		
		
	public void prodprice()
	{
		wait.until(ExpectedConditions.visibilityOf(price));
		Boolean priceDisp=price.isDisplayed();
		Assert.assertEquals(priceDisp, true);
		Reporter.log("Selected Product Price is : "	+price.getText());
		
	}
	public void prodDescription()
	{
		wait.until(ExpectedConditions.visibilityOf(description));
		Boolean descriptionDisp=description.isDisplayed();
		Assert.assertEquals(descriptionDisp, true);
		Reporter.log("Product description displayed : "	+description.getText());
		/*if(descriptionDisp==true) {
			System.out.println("Product description is Displayed");
			Reporter.log(price.getText());
		}
		else {
			System.out.println("Product description is not Displayed");
		}*/
	}

	public productdetailpage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
