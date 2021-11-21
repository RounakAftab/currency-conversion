package com.paysera.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.paysera.base.TestBase;

public class RateUpdated extends TestBase {
	
	@Test
	public void changeCountry() throws InterruptedException {
		
		WebElement selectCountry= driver.findElement(By.xpath(OR.getProperty("chooseCountry")));
		selectCountry.click();
		Thread.sleep(2000);
		
		/*
		 * WebElement dropDownOpen =
		 * driver.findElement(By.xpath(OR.getProperty("Cdropdownopen")));
		 * dropDownOpen.click();
		 * 
		 * WebElement dropDownValue =
		 * driver.findElement(By.id(OR.getProperty("dropDownvalue")));
		 * dropDownValue.click();
		 */
		
		
		
		
	}

}
