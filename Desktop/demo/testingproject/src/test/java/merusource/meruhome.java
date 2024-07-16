package merusource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class meruhome {

ChromeDriver driver;
	
/*
 * @FindBy(xpath="(//span[@class='item_text'])[1]") WebElement about ;
 * 
 /* 
 * @FindBy(xpath="(//span[text()='Purpose & Vision'])[1]") WebElement purpose;
 */
		
		@FindBy(xpath="(//a[@href='https://mahindralogistics.com/'])[1]")
		WebElement home;
		
		@FindBy(xpath="(//a[@href='https://tracking.mahindralogistics.com/'])[1]")
		WebElement track;
		
		@FindBy(xpath="//h4[text()='Pincodes served']")
		WebElement pincode;
      
		
		
		/*
		 * public void openabout () { Actions as=new Actions(driver);
		 * as.moveToElement(about).perform(); as.click();
		 * 
		 * }
		 */
		
		public void clickhomepage()
		{
			home.click();
		}
		
		/*
		 * public void purpose_visoion() { Select s=new Select(purpose); //
		 * s.selectByValue("menu-item-12170"); s.selectByIndex(1); s.getClass();
		 * 
		 * }
		 */
		
		
		public void tarckorder()
		{
			track.click();
		}
		
		
		public void pincodecheck()
		{
			pincode.click();
		}
		public meruhome(ChromeDriver driver) {
			PageFactory.initElements(driver, this);
		}
	

}
