package MavenPackage1.AmazonProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class sortproductpage 
{
WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="//select[@id='s-result-sort-select']") WebElement filteroptions;
/*@FindBy(id="s-result-sort-select_1") WebElement selectbypriceLH;
@FindBy(id="s-result-sort-select_2") WebElement selectbypriceHL;
@FindBy(id="s-result-sort-select_3") WebElement selectbyrating;
@FindBy(id="s-result-sort-select_5") WebElement selectbybestseller;*/



public void priceLH() {
    wait.until(ExpectedConditions.visibilityOf(filteroptions));
    Select s1 = new Select(filteroptions);
    s1.selectByVisibleText("Price: Low to High");
    assertEquals(s1.getFirstSelectedOption().getText(), "Price: Low to High");

    Reporter.log("Price: Low to High is selected");
}

public void priceHL() {
    wait.until(ExpectedConditions.visibilityOf(filteroptions));
    Select s1 = new Select(filteroptions);
    s1.selectByVisibleText("Price: High to Low");

    assertEquals(s1.getFirstSelectedOption().getText(), "Price: High to Low");

    Reporter.log("Price: High to Low is selected");
}

public void selectrating() {
    wait.until(ExpectedConditions.visibilityOf(filteroptions));
    Select s1 = new Select(filteroptions);
    s1.selectByVisibleText("Avg. Customer Review");

    assertEquals(s1.getFirstSelectedOption().getText(), "Avg. Customer Review");

    Reporter.log("Avg. Customer Review is selected");
}

public void selectbestseller() {
    wait.until(ExpectedConditions.visibilityOf(filteroptions));
    Select s1 = new Select(filteroptions);
    s1.selectByVisibleText("Best Sellers");

    assertEquals(s1.getFirstSelectedOption().getText(), "Best Sellers");

    Reporter.log("Best Sellers is selected");
}
public sortproductpage(WebDriver driver) {
	this.driver=driver;
	this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	PageFactory.initElements(driver, this);
}
}
