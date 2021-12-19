package com.swagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	By LoginBtn = By.id("login-button");
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
}
