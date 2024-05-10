package projectonesource;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import projectonetest.testcase14;

public class rating14testcase {
		
	

		ChromeDriver driver;
		@FindBy(name = "email")
		WebElement usernamemobile;

		@FindBy(id = "continue")
		WebElement continue_button;

		@FindBy(name = "password")
		WebElement pass;

		@FindBy(xpath = "//span[@class='a-button-inner']")
		WebElement signinbutton;
		
		@FindBy(xpath="//a[@href='/gp/css/order-history?ref_=nav_orders_first']")
		WebElement order;
		
		/*
		 * @FindBy(id="a-autoid-1-announce") WebElement orderhistrroy;
		 */

		  @FindBy(linkText="Write a product review") 
		  WebElement orderhistrroy;
		  
		  @FindBy(xpath="//img[@alt='select to rate item four star.']") 
		  WebElement rating;
		  
		  @FindBy(xpath="(//img[@alt='three stars'])[1]")
		  WebElement subrating1;
		  
		  @FindBy(xpath="(//img[@alt='two stars'])[2]")
		  WebElement subrating2;
		 
		  
		  @FindBy(xpath="(//img[@alt='one star'])[3]")
		  WebElement subrating3;
		 
		
		public void email1() {
			usernamemobile.sendKeys("9082062365");
		}

		public void continubutton1() {
			continue_button.click();
		}

		public void pass1() {
			pass.sendKeys("atpbharane88");
		}

		public void login1() {
			signinbutton.click();
		}
		public void orderandreturn() {
			order.click();
		}
		
		public void orderdetails()
		{
			orderhistrroy.click();
			/*
			 * Select s=new Select(orderhistrroy); s.selectByValue("year-2023");
			 * orderhistrroy.sendKeys(Keys.DOWN); orderhistrroy.sendKeys(Keys.DOWN);
			 * orderhistrroy.sendKeys(Keys.ENTER);
			 */


		}
		
		public void ratingproduct()
		{
			rating.click();
		}
		
		public void subrate1()
		{
			subrating1.click();
		}
		public void subrate2()

		{
			subrating2.click();
		}
			
		public void subrate3()
		{
			subrating3.click();
		}
			public rating14testcase(ChromeDriver driver) 
			{
		
			PageFactory.initElements(driver, this);

	}
	}
		

	