//question -3 annotation

package prathamesh.pratham;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotaioncase1 {
	
	@Test
	public void testcase1()
	{
		System.out.println("testone");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("testtwo");
	}
	
	@BeforeSuite
		public void beforeone()
		{
			System.out.println("beforesuite1");
		}
	@BeforeClass
	public void beforeclassone()
	{
		System.out.println("beforeclassone");
	}
	@AfterMethod
	public void aftermethodone()
	{
		System.out.println("aftermethod");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclasstest");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("aftresuite");
	}
	}


