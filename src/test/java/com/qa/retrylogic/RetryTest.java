package com.qa.retrylogic;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryTest {

	@Test
	public void Test1()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertTrue(false);
	}
	

}
