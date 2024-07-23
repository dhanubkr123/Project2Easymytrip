package redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase14_roundtrip {
	
	
	@Test
	public void  roundtripfunctinality() throws InterruptedException
	{
		

		ChromeDriver driver = new ChromeDriver();
	//@Test(enabled=true)
		driver.get(
				"https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaMcQ0KxU_0OltPgVnlR0EYCglVcXe7lVTCt1drH5DtXG_TR9aeEiwBoCJhIQAvD_BwE");

		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    roundtrip_05 rtrip=new roundtrip_05(driver);
		   rtrip.from(driver);
		   Thread.sleep(1000);
		   rtrip.top(driver);
		   Thread.sleep(1000);
		    rtrip.mumbai();
		    Thread.sleep(1000);
		   rtrip.delhi();
		   Thread.sleep(1000);
		   rtrip.depature(driver);
		   Thread.sleep(1000);
		   rtrip.returntrip(driver);
		   Thread.sleep(1000);
		   rtrip.exact(driver);
		   rtrip.searchbutton(driver);
		   Thread.sleep(5000);


	}

}
