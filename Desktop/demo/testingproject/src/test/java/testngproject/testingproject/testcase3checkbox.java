package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class testcase3checkbox {
	ChromeDriver driver;

	public void testcas3checkb() {

		driver = new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		WebElement checkb = driver.findElement(By.xpath("//input[@type='checkbox']"));

		boolean ans = checkb.isSelected();
		System.out.println(ans);

		if (ans == true) {
			checkb.click();
		}

	}

}
