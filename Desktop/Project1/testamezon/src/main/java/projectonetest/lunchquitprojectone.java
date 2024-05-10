package projectonetest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class lunchquitprojectone {
	
	WebDriver driver;
        @BeforeMethod
		@Parameters("broswer")
		public void precondi(String nameofbroswer)throws InterruptedException {
        	
			if (nameofbroswer.equals("Chrome"));
			{
				driver=new ChromeDriver();

			}
			  if(nameofbroswer.equals("edge")) 
			  { 
				  driver=new EdgeDriver();
		
			  }
			 
			
			if(nameofbroswer.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
		}

		@AfterMethod
		public void post_condition() throws IOException, InterruptedException 
		{

			TakesScreenshot ta = (TakesScreenshot) driver;

			File Source = ta.getScreenshotAs(OutputType.FILE);
			File destination = new
			// File("C:\\Users\\HP\\eclipse-workspace\\seleniumthree\\screen\\testone1"+Math.random()+".png");
			File("C:\\Users\\HP\\eclipse-workspace\\testamezon\\screenshotprojectone" + timestamp() + ".png");
			FileHandler.copy(Source, destination);
			Thread.sleep(2000);
			driver.quit();

		}

		public String timestamp() {

			return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		}
	}


