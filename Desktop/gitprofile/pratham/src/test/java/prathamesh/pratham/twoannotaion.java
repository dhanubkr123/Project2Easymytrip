package prathamesh.pratham;

import org.testng.annotations.Test;

public class twoannotaion {
	@Test(priority=3,enabled=true)
	public void testcase1()
	{
		System.out.println("this first testcase");
	}
	
	@Test(priority=-1,invocationCount=10)
	public void testcase2()
	{
		System.out.println("This is second testcase");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("this is third testcase");
	}

}
