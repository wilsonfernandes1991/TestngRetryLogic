package com.qa.retrylogic;

/*
 * This can also be used to add retry logic as parameters inside @Test method
 * 	@Test(retryAnalyzer=packageName.RetryAnalyzer.class)
 */

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	int counter = 0;
	int retryLimit =3;

	@Override
	public boolean retry(ITestResult arg0) 
	{
		if(counter<retryLimit)
		{
			counter++;
			return true;
		}
				
		return false;
	}
	

}
