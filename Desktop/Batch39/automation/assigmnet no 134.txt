//Assignmnet no-134 Asseryion method
package dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asssertion {

	@Test
	public void testcase1() {
		int a = 100;
		boolean b = true;
		long l = 876556;
		String s = "testing";
		Object a1[] = { 1, 2, 3 };
		Object a2[] = { 1, 2, 3 };

		Assert.assertEquals(false, false);
		Assert.assertEquals(true, true, "i m tester");
		Assert.assertEquals(122, 122);
		Assert.assertEquals(121, 121, "testing");
		Assert.assertEquals(2345, 2345);
		Assert.assertEquals(2345, 2345, "selenium");
		Assert.assertEquals(23454, 23454, "selenium");
		Assert.assertEquals(23454, 23454);
		Assert.assertEquals(237766454, 237766454);
		Assert.assertEquals('k', 'k', "automation batch");
		Assert.assertEquals("dhanu", "dhanu", "two string not equz");
		Assert.assertEquals(a1, a2);
		Assert.assertEquals(a1, a2, s);
		Assert.assertEquals(s, s);

	}

}
