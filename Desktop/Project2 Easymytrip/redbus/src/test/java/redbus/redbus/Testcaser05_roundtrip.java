package redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcaser05_roundtrip {
	
	ChromeDriver driver;
	@ Test(retryAnalyzer=redbus.redbus.retrytestcase.class)
	public void roundtrinfunctinality() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaAs6navmuBY2JgvN70gC5qGvClxiyi-0KQpdXloY3IZ8401onCWOHBoCmgwQAvD_BwE");


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
