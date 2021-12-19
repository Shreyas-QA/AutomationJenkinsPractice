package com.swagLabs.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void Quit() {
		
		
	}
}
