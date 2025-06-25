package utilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLogicforTestcases implements ITestListener
{
	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Listener:Test is Pass");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		 String className = result.getTestClass().getName();
		    //String methodName = result.getMethod().getMethodName();
		   // String fileName = className + "_" + methodName + " PASS.png";
		 String fileName = className + "  PASS.png";
		    File destination = new File("E:\\Screenshot\\pass\\" + fileName);
		//File Destination=new File("E:\\Screenshot\\pass\\" +classname+ ".png");
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Listener:Test is Fail");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		 String className = result.getTestClass().getName();
		    //String methodName = result.getMethod().getMethodName();
		    //String fileName = className + "_" + methodName + " FAIL.png";
		    String fileName = className + " FAIL.png";
		    File destination = new File("E:\\Screenshot\\Fail\\" + fileName);
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
