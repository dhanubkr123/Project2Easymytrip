package prathamesh.pratham;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example7 {
	@Test
	public void testone()
	{
		System.out.println("testfirst");
	}
	
	@Test
	 public void testtwo()
	 {
		System.out.println("testsecond");
	 }


	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermetodo");
	}
}
