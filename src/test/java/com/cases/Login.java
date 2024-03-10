package com.cases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.actions.Actions;
import com.base.Base;
import com.codoid.products.exception.FilloException;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.utils.Utils;

public class Login extends Base {
	
	public WebDriver driver;
	public Actions actions;
	
	private Logger log = LogManager.getLogger(Login.class.getName());
	private HashMap<String, String> data;

	@BeforeTest
	public void initialize() throws IOException, FilloException {
		
		driver = initializeDriver();
		log.info("Driver is initialized.");
		data = new Utils().getTestData("TC1");
		actions = new Actions(driver);
		
	}

	@Test
	public void performLogin() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		actions.navigateTo(prop.getProperty("url"));
		actions.click(hp.getLogin());
		Thread.sleep(5000);
		actions.enterText(lp.getUsername(), "turock");
		actions.enterText(lp.getPassword(), "turock");
		actions.click(lp.getLoginBtn());
		Thread.sleep(5000);
		System.out.println(hp.getTitle());
		Assert.assertTrue(hp.getTitle().contains("STORE"));
		log.info("Successfully Logged In");

	}



	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
