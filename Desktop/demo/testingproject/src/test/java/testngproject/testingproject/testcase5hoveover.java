package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test(enabled=true)
public class testcase5hoveover {
	ChromeDriver driver;
	public void test5()
	{
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
        driver.manage().window().maximize();
        WebElement d=driver.findElement(By.xpath("//div[@data-id='97c0b5f']"));
        Actions s=new Actions(driver);
        s.moveToElement(d).perform();
       WebElement n= driver.findElement(By   .cssSelector("#main > div > div.has_eae_slider.elementor-element.elementor-element-4001fbd.e-flex.e-con-boxed.e-con.e-parent > div > div.has_eae_slider.elementor-element.elementor-element-479ad3a.e-con-full.e-flex.e-con.e-child > div.has_eae_slider.elementor-element.elementor-element-97c0b5f.e-con-full.e-flex.e-con.e-child > div.has_eae_slider.elementor-element.elementor-element-1857001.e-con-full.e-flex.e-con.e-child > div > div > div > div > span > div:nth-child()1)"));
      n.click();
	}

}
