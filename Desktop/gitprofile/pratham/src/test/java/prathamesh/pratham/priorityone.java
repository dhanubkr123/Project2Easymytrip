//3 @test method class have same priproty

package prathamesh.pratham;

import org.testng.annotations.Test;

public class priorityone 
{
	

	
	@Test
	public void testone()
	{


System.out.println("display testone");
	}
	
	@Test(priority=10)
	public void testtwo()
	{
		System.out.println("test two");
	}
@Test(priority=10)

	public void loginAmezon()
	{
System.out.println("test three");

}


}
