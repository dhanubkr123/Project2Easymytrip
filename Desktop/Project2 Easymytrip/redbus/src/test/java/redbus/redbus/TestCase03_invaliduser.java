package redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase03_invaliduser {
	ChromeDriver driver;
	@Test(retryAnalyzer=redbus.redbus.retrytestcase.class)
	
	public void invalidcrendetial() throws InterruptedException
	{
		
        ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaAs6navmuBY2JgvN70gC5qGvClxiyi-0KQpdXloY3IZ8401onCWOHBoCmgwQAvD_BwE");


		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	
	Invaliduser_3 user=new Invaliduser_3(driver);
	
	user.signbutton(driver);
	Thread.sleep(1000);
	user.customerlogin();
	Thread.sleep(1000);
	user.emailone();
	user.conti(driver);
	}
}

