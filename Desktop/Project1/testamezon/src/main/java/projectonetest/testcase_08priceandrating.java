package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.priceandrating_08;

public class testcase_08priceandrating extends lunchquitprojectone
{
	@Test
	@Parameters("broswer")
	public void priceandrate(String nameofbroswer) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		priceandrating_08 price=new priceandrating_08(driver);
		price.searchpro();
		Thread.sleep(1000);

		//price.prices();
		Thread.sleep(1000);
		price.ratingfour(driver);
		driver.close();
		
	}

}
