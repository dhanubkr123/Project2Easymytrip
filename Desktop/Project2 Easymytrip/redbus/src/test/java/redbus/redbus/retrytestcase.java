package redbus.redbus;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retrytestcase implements IRetryAnalyzer {


	int iniialcount=0;
	int total_co=1;
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
