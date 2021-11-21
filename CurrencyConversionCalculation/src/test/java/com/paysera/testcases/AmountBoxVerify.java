package com.paysera.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paysera.base.TestBase;

public class AmountBoxVerify extends TestBase {


	@Test(priority = 1)
	public void buyFieldVerify() throws InterruptedException {

		WebElement buyField= driver.findElement(By.xpath(OR.getProperty("buyfield")));
		WebElement sellField= driver.findElement(By.xpath(OR.getProperty("sellfield")));

		String sellValue = sellField.getAttribute("value");
		String buyValue = buyField.getAttribute("value");
		Thread.sleep(2000);

		if (buyValue.isEmpty()) {

			buyField.sendKeys("100");
			Thread.sleep(4000);
			System.out.println("Buy value: " + buyField.getAttribute("value"));
			System.out.println("Sell value: " + sellField.getAttribute("value"));
		} 
		else {

			System.out.println("There have something issue");
		}


	}
	
	@Test(priority = 2)
	public void sellFieldVerify() throws InterruptedException {

		WebElement buyField= driver.findElement(By.xpath(OR.getProperty("buyfield")));
		WebElement sellField= driver.findElement(By.xpath(OR.getProperty("sellfield")));
		Thread.sleep(2000);

		sellField.click();
		sellField.sendKeys("200");
		Thread.sleep(4000);
		System.out.println("Buy value: " + buyField.getAttribute("value"));
		System.out.println("Sell value: " + sellField.getAttribute("value"));
	}
}


