package redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multicity_testcase {
	ChromeDriver driver;

	@Test(retryAnalyzer=redbus.redbus.retrytestcase.class)
	public void multicityfunctinality() throws InterruptedException
	{

	 driver =new ChromeDriver(); driver.get(
			  "https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaAs6navmuBY2JgvN70gC5qGvClxiyi-0KQpdXloY3IZ8401onCWOHBoCmgwQAvD_BwE"
			  ); driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			  
			    testoneway way=new testoneway(driver);
			    way.from(driver);
			    Thread.sleep(1000);
			   way.top(driver);
			   Thread.sleep(1000);
				way.mumbai();
				way.delhi();
				//way.datetrip();
				way.depature(driver);
				Thread.sleep(1000);
				way.searchbutton(driver);
				Thread.sleep(1000);
				multicity m=new multicity(driver);
				m.multicityone();
				Thread.sleep(1000);
				m.mutilocation();
				m.banglour();
				Thread.sleep(1000);
				m.calender_date();
				m.datepick();
				Thread.sleep(1000);
				m.location_update(driver);

}
}
