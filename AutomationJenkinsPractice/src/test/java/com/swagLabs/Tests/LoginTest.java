package com.swagLabs.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LoginTest {
	
	WebDriver driver;
	@BeforeSuite
	public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void Quit() {
		
		driver.quit();
	}
}
