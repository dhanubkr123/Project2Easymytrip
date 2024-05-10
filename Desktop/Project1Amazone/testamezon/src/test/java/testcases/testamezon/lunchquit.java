package testcases.testamezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class lunchquit {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("broswer")
	public void precondi(String nameofbroswer)
	{
		if(nameofbroswer.equals("Chrome"));
		{
			driver=new ChromeDriver();
		}
		/*
		 * if(nameofbroswer.equals("Firefox")); { driver=new FirefoxDriver(); }
		 * if(nameofbroswer.equals("Edge")); { driver=new EdgeDriver(); }
		 */
	}
	
	@AfterMethod
	public void postcon()
	{
		driver.quit();
	}

}
