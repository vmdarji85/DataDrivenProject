package com.w2a.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		
		//verifyText("abc", "xyz");
	
		log.debug("Begining of the loginAsBankManager method");
		
		click("bmlBtn_CSS");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login is successful");
		log.debug("Login successfully executed");
		Reporter.log("Login successfully executed");
		test.log(LogStatus.INFO, "Login successfully executed");
	}

}
