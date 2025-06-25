package MavenPackage1.AmazonProject;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilityPackage.ListenerLogicforTestcases;
import utilityPackage.TestData;

public class Baseclass 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	//public void launchbrowser(String nameofbrowser) throws EncryptedDocumentException, IOException
	public void launchbrowser() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		  ListenerLogicforTestcases.driver = driver;
		/*if(nameofbrowser.equals("Chrome"))
		{
			driver=new ChromeDriver();	
			Reporter.log("Chrome browser is launched");
		}
		if(nameofbrowser.equals("Edge"))
		{
			driver=new EdgeDriver();	
			Reporter.log("Edge browser is launched");
		}
		if(nameofbrowser.equals("FireFox"))
		{
			driver=new FirefoxDriver()	;
			Reporter.log("Firefox browser is launched");
		}*/
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(TestData.stringdata("Project1", 4, 1));
		driver.manage().window().maximize();
		
		do
		{
			driver.navigate().refresh();
			//driver.findElement(By.xpath("//button[.='Continue shopping']")).click();
		}
		while(driver.getTitle().contains("Online Shoping site in India"));
		ListenerLogicforTestcases.driver = driver;
		}
		
	
	
	@AfterMethod
	public void quitbrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
