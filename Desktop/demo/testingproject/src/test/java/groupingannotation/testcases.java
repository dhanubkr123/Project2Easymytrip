//assigmnet no 131=Create 15 test cases and execute them by grouping.


package groupingannotation;

import org.testng.annotations.Test;


public class testcases {
	@Test(groups= {"smoke"})
	public void tesid_01()
	{
		System.out.println("test smoke");
	}
	@Test(groups= {"smoke","system"})
	public void testid_02()
	{
		System.out.println("test system");
	}
	@Test(groups= {"smoke","system"})
public void testid_03()
{
	System.out.println("testcase3");
}
	@Test(groups= {"system","regression"})
public void testid_04()
{
	System.out.println("testcase4");
}
	@Test(groups= {"retesting","compenent"})
	public void testid_05()
	{
		System.out.println("testcase5");	
	}
	@Test(groups= {"retesting","Regression"})
	public void testid_06()
	{
		System.out.println("testcase6");
	}
	@Test(groups= {"Acceptances","compenent"})
	public void testid_07()
	{
		System.out.println("testcase7");
	}
	@Test(groups= {"retesting","sanity"})
	public void testid_08()
	{
		System.out.println("testcase8");
	}
	@Test(groups= {"retesting","performances"})
	public void testid_09()
	{
		System.out.println("testcase9");
	}
	@Test(groups= {"functional","compenent"})
	public void testid_10()
	{
		System.out.println("testcase10");
	}
	@Test(groups= {"compatablity","system"})
	public void testid_11()
	{
		System.out.println("testcase11");
	}
	@Test(groups= {"Adhoc","secuirty"})
	public void testid_12()
	{
		System.out.println("testcase12");
	}
	@Test(groups= {"load","compenent"})
	public void testid_13()
	{
		System.out.println("testcase13");
	}
	@Test(groups= {"sanity","unit"})
	public void testid_14()
	{
		System.out.println("testcase14");
	}
	@Test(groups= {"unit","integration"})
	public void testid_15()
	{
		System.out.println("testcase15");
	}
}
