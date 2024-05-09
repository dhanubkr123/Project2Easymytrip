//Assignment 129:-"Write 2 Annotations together in TestNG"4 annotaion usieng

package prathamesh.pratham;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class diffrentannotion {

	@Test
	public void one()
	{
		System.out.println("test method");
	}
	@BeforeSuite
	public void two()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void three()
	{
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void four()
	{
		System.out.println("before method");
	}
	
}
