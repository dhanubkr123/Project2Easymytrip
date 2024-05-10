package projectonetest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retrycode implements IRetryAnalyzer {

	int iniialcount=0;
	int total_co=4;
	@Override
	public boolean retry(ITestResult result) {

if(iniialcount<total_co)
{
	iniialcount++;
	return true;
}
		return false;
	}

}
