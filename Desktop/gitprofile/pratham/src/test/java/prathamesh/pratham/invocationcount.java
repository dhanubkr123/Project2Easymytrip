//Assigmnt 128-invoccation count 

package prathamesh.pratham;

import org.testng.annotations.Test;

public class invocationcount {

	
	@Test(invocationCount=10)
	public void incount()
	{
		System.out.println("this first test case");
	}
	
	@Test
	public void incount2()
	{
		System.out.println("this second test cases");
	}
	
	@Test
	public void incount3()
	{
		System.out.println("this thrs test case");
		
		
	}
	}


