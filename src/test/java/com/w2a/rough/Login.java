package com.w2a.rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test(retryAnalyzer = com.w2a.base.RetryAnalyzer.class)
	public void Test1() {
		Assert.assertEquals(false, true);
	}

	@Test(retryAnalyzer = com.w2a.base.RetryAnalyzer.class)
	public void Test2() {
		Assert.assertEquals(false, true);
	}
}
