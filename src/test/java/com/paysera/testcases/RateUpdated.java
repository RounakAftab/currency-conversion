package com.paysera.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paysera.base.TestBase;

public class RateUpdated extends TestBase {
	
	@Test
	public void changeCountry() throws InterruptedException {
		
		//Click on country icon
		WebElement clickCountry= driver.findElement(By.xpath(OR.getProperty("chooseCountry")));
		clickCountry.click();
		
		 //Click on country drop down
	     WebElement dropDownValue = driver.findElement(By.id(OR.getProperty("dropDownvalue")));
		 dropDownValue.click();
		 Thread.sleep(3000);
		 
		 // Select country value from drop down
		 WebElement selectCountry = driver.findElement(By.xpath(OR.getProperty("selectCountryRussia")));
		 Thread.sleep(2000);
		 selectCountry.click();
		 
		 //Click on See Rates button
		 driver.findElement(By.xpath(OR.getProperty("seeRates"))).click();;
		 Thread.sleep(6000);
		
		
	}

}
