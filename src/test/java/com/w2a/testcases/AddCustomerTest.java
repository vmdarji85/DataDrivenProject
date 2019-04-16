package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp") // dataProviderClass=TestUtil.class,dataProvider="dp"
	public void addCustomerTest(Hashtable<String, String> data)
			throws InterruptedException {
		//checking runmode
		if(!data.get("runmode").equals("Y")) {
			throw new SkipException("The test case is skipping since runmode set to N");
		}
		
		// Click on Customer button
		click("addCustBtn_CSS");
		// Enter firstName
		type("firstName_XPATH", data.get("firstname"));
		// Enter lastName
		type("lastName_CSS", data.get("lastname"));
		// Enter Post Code
		type("postCode_XPATH", data.get("postcode"));
		// click on add customer
		click("addCutsomer_CSS");

		Thread.sleep(2000);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")), "Text is not conrtain alert text");
		alert.accept();
		test.log(LogStatus.INFO, "sucessfully passed Alert");
		Reporter.log("sucessfully passed Alert");
		
		Thread.sleep(2000);
	}

}
