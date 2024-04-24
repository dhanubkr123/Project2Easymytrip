package Dhanashri.seleniumthree;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchquit 
{
	ChromeDriver driver;
@BeforeMethod
public void pre_condition()
{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			String t1 = driver.getTitle();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterMethod
public void post_condition() throws IOException, InterruptedException
{

	
	TakesScreenshot ta = driver;

	File Source = ta.getScreenshotAs(OutputType.FILE);
     File destination=new
 //     File("C:\\Users\\HP\\eclipse-workspace\\seleniumthree\\screen\\testone1"+Math.random()+".png");
    		  File("C:\\Users\\HP\\eclipse-workspace\\seleniumthree\\screen\\testone1"+timestamp()+".png");
    		 FileHandler.copy(Source, destination);
	 Thread.sleep(2000);
	driver.quit();
	 
}


	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}

