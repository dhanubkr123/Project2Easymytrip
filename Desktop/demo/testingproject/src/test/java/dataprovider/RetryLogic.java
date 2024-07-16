package dataprovider;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
	
	int initalcount=0;
		
int totalcount=3;

	@Override
	public boolean retry(ITestResult result) {
  if(initalcount<totalcount)
		  {
 initalcount++;
 return true;

	}
return false;
	}


}
