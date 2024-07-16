package testngproject.testingproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lunchandclose {

ChromeDriver driver;
@BeforeMethod
public void precondition()
{   
	driver=new ChromeDriver();
    driver.get("https://grotechminds.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
	
}
@AfterMethod
public void postconditon() throws IOException, InterruptedException
{
	TakesScreenshot ta = driver;

	File Source = ta.getScreenshotAs(OutputType.FILE);
     File destination=new
      File("C:\\Users\\HP\\eclipse-workspace\\testingproject\\growscreen\\newscreenshot"+Math.random()+".png");
	 FileHandler.copy(Source, destination);
	 Thread.sleep(2000);
	driver.quit();
	



	}

}
