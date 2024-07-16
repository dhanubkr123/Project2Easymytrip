package darttest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dartsource.Dartlogin;

public class testcaselogin {
	
	
	@Test
	public void login_dart()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Dartlogin da=new Dartlogin(driver);
		da.logingro();
		da.grousername();
		da.gropass();
		da.signintogro();
		}

}
