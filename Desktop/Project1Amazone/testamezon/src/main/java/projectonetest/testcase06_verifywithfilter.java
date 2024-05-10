package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.searchprouct_05;
import projectonesource.verifysearchfilter_06;

public class testcase06_verifywithfilter  extends lunchquitprojectone {
	@Test
	@Parameters ("broswer")
	public void veriftfilter(String nameofbrowser)throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	verifysearchfilter_06 featureone=new verifysearchfilter_06(driver);
	        featureone.searchpro();
			featureone.categoery();	
			Thread.sleep(2000);
			featureone.priceshoe(driver);
			driver.close();
	}
	

}
