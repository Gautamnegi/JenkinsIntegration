package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By username = By.xpath("//input[@id='loginusername']");
	private By password = By.xpath("//input[@id='loginpassword']");
	private By loginBtn = By.xpath("//button[@onclick='logIn()']");
	
	// All methods should be defined here
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}


}
