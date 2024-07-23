package redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase_12loginlogout {
	ChromeDriver driver;

	@Test
	public void loginandlogout() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaAs6navmuBY2JgvN70gC5qGvClxiyi-0KQpdXloY3IZ8401onCWOHBoCmgwQAvD_BwE");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		//driver.navigate().refresh();
		Sourceeasytrip trip=new Sourceeasytrip(driver);
		trip.signbutton(driver);
	Thread.sleep(1000);
		trip.customerlogin();
		Thread.sleep(1000);
		trip.emailone();
		trip.conti();
		Thread.sleep(1000);
		/*
		 * testoneway way=new testoneway(driver); way.from(driver); Thread.sleep(2000);
		 * way.top(driver); Thread.sleep(2000); way.mumbai(); way.delhi();
		 * //way.datetrip(); way.depature(driver); Thread.sleep(3000);
		 * way.searchbutton(driver);
		 */
	
		//driver.navigate().to("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaAs6navmuBY2JgvN70gC5qGvClxiyi-0KQpdXloY3IZ8401onCWOHBoCmgwQAvD_BwE");
	
		loginandlogout_12 logout = new loginandlogout_12(driver);
        logout.profile1();
       // logout.logoutbutton(driver);
        //logout.logout();
        
	}
}
