package redbus.redbus;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_15paymentpage {
	
	@Test(retryAnalyzer=redbus.redbus.retrytestcase.class)
	public void paymentfunctinality()throws InterruptedException
	{

			ChromeDriver driver = new ChromeDriver();
			// @Test(enabled=true)
			// driver.get("https://www.ixigo.com/flights?utm_source=google&utm_medium=paid_search_google&utm_campaign=ixigo_brand&gad_source=1&gclid=CjwKCAjw0YGyBhByEiwAQmBEWhLnNGniGPihZAfV58Fz9RuEvqSU_dZTJnTcVje5G0Tgm23iUgRBGBoCx1MQAvD_BwE&loginVisible=true");
			driver.get(
					"https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaMcQ0KxU_0OltPgVnlR0EYCglVcXe7lVTCt1drH5DtXG_TR9aeEiwBoCJhIQAvD_BwE");

			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			testoneway way = new testoneway(driver);
			way.from(driver);
			Thread.sleep(1000);
			way.top(driver);
			Thread.sleep(1000);
			way.mumbai();
			way.delhi();
			// way.datetrip();
			way.depature(driver);
			Thread.sleep(1000);
			way.searchbutton(driver);
			Thread.sleep(1000);

			otherdeatils_11 d = new otherdeatils_11(driver);
			d.booking();
			d.radioone();
			Thread.sleep(1000);
			d.emailid();
			d.contibutton();
			
			payment p=new payment(driver);
			p.first1();
			p.t1(driver);
			p.lastname1();
			p.mobile1();
			p.cobooking1(driver);
			Thread.sleep(1000);
			p.contibutton2(driver);
			Thread.sleep(1000);

			
			
			
		}

	}


