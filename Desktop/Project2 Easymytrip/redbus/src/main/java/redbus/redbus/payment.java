package redbus.redbus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class payment {


	@FindBy(id="titleAdult0")
	WebElement title1;
	
	@FindBy(name="txtFNAdult0")
	WebElement fname;
	
	@FindBy(id="txtLNAdult0")
	WebElement lname;
	
	@FindBy(id="txtCPhone")
	WebElement mo;
	
	@FindBy(id="spnTransaction")
	WebElement co;
		@FindBy(xpath="//span[@class='co1 addonstp']")
         WebElement co1;
		
		@FindBy(xpath="//*[@id=\"spnTransaction\"]")
        WebElement co2;
		
		@FindBy(xpath="//*[@id=\"BOM_DEL3-B\"]")
		WebElement seat;
		public void t1(ChromeDriver driver)
		{
			title1.click();
			Select s=new Select(title1);
			s.selectByVisibleText("MS");
			
		}
		public void first1()
		{
			fname.sendKeys("stest");

		}
		public void lastname1()
		{
			lname.sendKeys("Automatio");
		}
		
		public void mobile1()
		{
			mo.sendKeys("9921457513");
		}
		public void cobooking1(ChromeDriver driver)
		{
			
			Actions s=new Actions(driver);
			s.doubleClick(co).perform();
			//co.click();
			//driver.switchTo().alert().dismiss();
		}
		
		public void contibutton2(ChromeDriver driver)
		{
		
			
			  Actions s=new Actions(driver); s.doubleClick(co1).perform();


			 
			//co1.click();
			//co1.click();
			Assert.assertEquals("EMTNCF", "EMTNCF");
		}
		
		
		public void co3()
		{
		co2.click();
		}
		
		public void selectseat()
		{
			seat.click();
		}
		
		
	
	
	
	public payment(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
