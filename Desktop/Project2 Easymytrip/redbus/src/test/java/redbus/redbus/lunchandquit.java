package redbus.redbus;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class lunchandquit  extends Listenerclass 
{
	//ChromeDriver driver;
	
	@BeforeMethod
	@Parameters("broswer")
	public void precondi(String nameofbroswer)throws InterruptedException
	{
		if(nameofbroswer.equals("Chrome"));
		{
			driver=new ChromeDriver();
		}
	}
			
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//  //driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=Cj0KCQjw3ZayBhDRARIsAPWzx8pU8ZbjH7A-Ygl-4j6tKCKq1TPZqZearunppZulQ0ZW6stR26XULLEaAoCnEALw_wcB"); }
		
		/*
		 * if(nameofbroswer.equals("Firefox")); { driver=new FirefoxDriver(); }
		 * if(nameofbroswer.equals("Edge")); { driver=new EdgeDriver(); }
		 */
	
	
	@AfterMethod
	public void postcon() throws IOException, InterruptedException
	{
		/*
		 * TakesScreenshot ta = (TakesScreenshot) driver; File Source =
		 * ta.getScreenshotAs(OutputType.FILE); File destination = new File
		 * ("C:\\Users\\HP\\eclipse-workspace\\redbus\\esaytripscreenshot\\news" +
		 * Math.random() + ".jpg");
		 * //("C:\\Users\\HP\\eclipse-workspace\\redbus\\esaytripscreenshot\\t" +
		 * timestamp() + ".jpg");
		 * 
		 * FileHandler.copy(Source, destination); Thread.sleep(3000); driver.quit();
		 */
				}

		//	private String timestamp() {

				
				//return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()); 

				
			}
		
		
	


