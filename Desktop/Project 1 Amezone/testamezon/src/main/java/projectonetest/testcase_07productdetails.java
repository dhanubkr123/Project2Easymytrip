package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.productdetails_7;
import projectonesource.verifysearchfilter_06;

public class testcase_07productdetails  extends lunchquitprojectone
{
    @Test
	@Parameters("broswer")
	public void productdet(String nameofbroswer) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	productdetails_7 details=new productdetails_7(driver);
	        details.searchpro();
	        Thread.sleep(2000);
	        details.categoery();	
			Thread.sleep(2000);
			details.priceshoe();
			Thread.sleep(2000);
			details.productfirstone();
			driver.close();
	}
	

}



