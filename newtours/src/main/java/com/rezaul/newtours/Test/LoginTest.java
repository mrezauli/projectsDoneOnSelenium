package com.rezaul.newtours.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rezaul.newtours.DTO.LoginDTO;
import com.rezaul.newtours.DataProvider.LoginDataProvider;
import com.rezaul.newtours.Utils.DriverManager;
import com.rezaul.newtours.Utils.UrlTextUtils;
import com.rezaul.newtours.Utils.XpathUtils;

public class LoginTest {

	public WebDriver driver = null;

	@Test(priority = 1)
	public void checkloginpagetitle() {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.BASE_URL);

		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_TITLE);
		System.out.println("Checked- Login Page Title Successfully !!!!!");
	}

	@Test(priority = 2, dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void logintest(List<LoginDTO> logindata) {

		for(LoginDTO login: logindata){
			driver.findElement(By.xpath(XpathUtils.LoginPage.INPUT_USER_NAME)).sendKeys(login.getUserName());
			driver.findElement(By.xpath(XpathUtils.LoginPage.INPUT_PASSWORD)).sendKeys(login.getPassword());
			driver.findElement(By.xpath(XpathUtils.LoginPage.CLICK_SIGNIN)).submit();
			
			System.out.println("Logged in Successfully!");
		}
	}
	
	
	
}
