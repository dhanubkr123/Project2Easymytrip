//132 assignmnet--"WAP for DataProvider with Facebook login with 5 set of data"

package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fbdataprovider {
	@DataProvider(name="login_data")
	public Object[][] method1()
	{
		Object data[][]=new Object[5][2];
		data[0][0]="baikardhanashri@gmail.com";
		data[0][1]="dhnau";
		data[1][0]="baikardhanashri@gmail.com";
		data[1][1]="dhanubkr@931";
		data[2][0]="bbbbb@gmail.com";
		data[2][1]="dhanu";
		data[3][0]="baikardhanashri@gmail.com";
		data[3][1]="hjjj";
		data[4][0]="tffhghgj@gamil.com";
		data[4][1]="dhnaubkr@93";
		
		return data;
	}
	
	@Test(dataProvider="login_data")
	public void login_to_fb(String un,String pws)
	{   
		
		//System.out.println(un+pws);
		
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
		  driver.findElement(By.id("email")).sendKeys(un);
		  driver.findElement(By.id("pass")).sendKeys(pws);
		  driver.findElement(By.xpath("//button[@value='1']")).click();
		 
	}
}


