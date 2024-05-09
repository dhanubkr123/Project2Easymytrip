package prathamesh.pratham;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example8 {
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
	
	@Test
	 public void testthree()
	 {
		System.out.println("testsecond");
	 }
	@AfterSuite
	public void aftersuiteone()
	{
		System.out.println("aftersuite");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftemethod");
	}
}
