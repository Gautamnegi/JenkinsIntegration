package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here

	private By login = By.xpath("//a[@id='login2']");
	private By titlePage = By.xpath("//a[@id='login2']");


	
	
	// All methods should be defined here

	public WebElement getLogin() {
		return driver.findElement(login);
	}
	public String getTitle() {
		return driver.getTitle();
	}
	


}
