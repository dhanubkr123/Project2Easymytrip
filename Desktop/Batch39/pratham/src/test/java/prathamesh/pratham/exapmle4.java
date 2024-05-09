//Q4) on testng
/*Class with below annottaions
Test
beforeclass
Aftersuite
Aftermethod*/


package prathamesh.pratham;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class exapmle4 {
	
	@Test
	public void testone()
	{
	System.out.println("testone");	
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@AfterSuite
	public void aftertsuiteoe()
	{
		System.out.println("aftersuiteonw");
	}
	@AfterMethod
	public void aftermethodone()
	{
		System.out.println("aftermethodone");
	}
	

}
