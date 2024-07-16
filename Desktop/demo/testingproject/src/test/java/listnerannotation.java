import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(itestlisner.class)
public class listnerannotation {
	
	@Test
	public void testcase1() 
	{
		Assert.assertTrue(true); //testcase passed
		
	}
	@Test
	public void testcase5()
	{
		Assert.assertTrue(false);//testcase failed
	}
	@Test
	public void testcase2()
	{
		// testcase pass
	}
	@Test(dependsOnMethods="testcase1")
	
	public void testcase3()//testcase skipped
	{
		
	}
	
	@Test(timeOut=5000)
	public void testcase4() throws InterruptedException
	{
		Thread.sleep(5000);
	}

}
