import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class itestlisner implements ITestListener 
{
	
	WebDriver driver;
	
	public void onteststart(ITestResult result)
	{
		ITestListener.super.onTestStart(result);
		Reporter.log("testcase start");


	}


	@Override
	public void onTestSuccess(ITestResult result) {


		ITestListener.super.onTestSuccess(result);
		Reporter.log("testcase passed");
		
		 if (driver instanceof TakesScreenshot) {
		  TakesScreenshot td=(TakesScreenshot) driver; 
		  File source=td.getScreenshotAs(OutputType.FILE);
		  File destination=new File(
		  "C:\\Users\\HP\\eclipse-workspace\\testingproject\\listnerscreen\\listners",".jpeg");
          try {
			FileHandler.copy(source, destination);
			}
          catch (IOException e) {
			
			e.printStackTrace();
		}


         
         }
	}



	


	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("testcase is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("test case is skipped");
	}

	/*
	 * @Override public void onTestFailedButWithinSuccessPercentage(ITestResult
	 * result) { // TODO Auto-generated method stub
	 * ITestListener.super.onTestFailedButWithinSuccessPercentage(result); }
	 */
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("test case failed becasue of timeout");
	}

	/*
	 * @Override public void onStart(ITestContext context) { // TODO Auto-generated
	 * method stub ITestListener.super.onStart(context); }
	 */
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("excution done");
	}

}
