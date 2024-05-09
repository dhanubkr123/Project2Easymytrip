package prathamesh.pratham;

import org.testng.annotations.Test;

public class enableannotation {

	
	@Test
	public void enabletestcas()
	{
		System.out.println("testone");
	}
	@Test
	public void testtwo()
	{
		System.out.println("testwo");
	}
	
	@Test(enabled=false)
	public void testthre()
	{
		System.out.println("test three");
	
	
	}
}
