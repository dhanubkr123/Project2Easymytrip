import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporterlog {

	
	@Test
	public void testcase()
	
	{
		System.out.println("testcsae 1");
	Reporter.log("Test case one");
	}
	@Test
	public void testcase2()
	
	{
		System.out.println("testcsae 2");
	Reporter.log("Test case two");
	}
	@Test
	public void testcase3()
	
	{
		System.out.println("testcsae 3");
	Reporter.log("Test case three");
	}
	@Test
	public void testcase4()
	
	{
		System.out.println("testcsae 4");
	Reporter.log("Test case four");
	}
	
	
	
	
}
