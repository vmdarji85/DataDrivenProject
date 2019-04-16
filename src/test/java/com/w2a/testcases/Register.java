package com.w2a.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.w2a.base.TestBase;

public class Register extends TestBase{
	
	public void RegisterToW2AAutomation()  {
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		driver.findElement(By.name(OR.getProperty("name"))).sendKeys("Vivek");
		driver.findElement(By.name(OR.getProperty("phone"))).sendKeys("4104914009");
		driver.findElement(By.name(OR.getProperty("email"))).sendKeys("vivekdarji85@gmail.com");
		driver.findElement(By.name(OR.getProperty("city"))).sendKeys("Columbia");
		WebElement country_drp = driver.findElement(By.name(OR.getProperty("country")));
		Select sel = new Select(country_drp);
		sel.deselectByValue("United States");
		driver.findElement(By.name(OR.getProperty("username"))).sendKeys("vivekdarji85@gmail.com");
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys("Jaimeldima85");
		driver.findElement(By.name(OR.getProperty("submit"))).click();
		
	}

}
