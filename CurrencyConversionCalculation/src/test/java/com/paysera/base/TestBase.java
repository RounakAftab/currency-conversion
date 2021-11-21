package com.paysera.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	@BeforeSuite
	public void setUp() throws IOException, InterruptedException {
		
		if (driver== null) {
			
		 fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		 Config.load(fis);
		 
		 fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		 OR.load(fis);
		 
		}
		
		if (Config.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		}else if (Config.getProperty("browser").equals("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
			driver.get(Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		
	
	
	@AfterSuite
	public void tearDown() {
		
		if (driver != null) {
			driver.quit();
		}

		
	}

}
