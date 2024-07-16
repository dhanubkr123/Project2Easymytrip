package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampledataprovider {
	@DataProvider(name="data1")
	
		public Object methodforverfy()
		{
		return new Object[][]  { {"dhanu"},{"sahil"},{"patahm"},{"avnsig"}};
	} 
	
	@Test(dataProvider="data1")
public void testcase(String names)
{
	names.concat("is indian");
}


}
