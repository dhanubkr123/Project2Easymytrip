package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.searchprouct_05;

public class testacse05_searchproudct extends lunchquitprojectone
 {

	@Test
	@Parameters ("broswer")

	public void serachingtheproduct(String nameofbrowser)throws InterruptedException{

		
		  
		  ChromeDriver driver=new ChromeDriver(); 
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		searchprouct_05 sear = new searchprouct_05(driver);
		sear.searchpro();
		driver.close();

	}

}
