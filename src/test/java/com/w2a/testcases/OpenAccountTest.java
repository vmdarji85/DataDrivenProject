package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class OpenAccountTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")

	public void openAccountTest(Hashtable<String, String> data) throws InterruptedException {

		// checking runmode
		if (!data.get("runmode").equals("Y")) {
			throw new SkipException("The test case is skipping since runmode set to N");
		}
//		if (!(TestUtil.isTestRunnable("openAccountTest", excel))) {
//					throw new SkipException("The test case is skipping since runmode set to N");
//			}

		click("openAcctBtn_CSS");

		Thread.sleep(2000);

		select("customer_CSS", data.get("customer"));
		select("currency_CSS", data.get("currency"));
		click("processBtn_CSS");

		Thread.sleep(2000);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.accept();
		test.log(LogStatus.INFO, "sucessfully passed Alert");
		Reporter.log("sucessfully passed Alert");

	}

}
