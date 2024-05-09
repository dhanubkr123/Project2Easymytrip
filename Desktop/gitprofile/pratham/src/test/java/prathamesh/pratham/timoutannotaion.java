package prathamesh.pratham;

import org.testng.annotations.Test;

public class timoutannotaion {
	@Test
	public void timeoutone()
	{
		System.out.println();
	}
    @Test(timeOut=1000)//time is less that excute time it will give exception like thraedtimeout exceptio
    public void timettwo()
    {
    	for(int i=0;i<1000;i++)
    	{
    		System.out.println(i);
    	}
    }
}
