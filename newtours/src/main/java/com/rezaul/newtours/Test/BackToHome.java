package com.rezaul.newtours.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rezaul.newtours.Utils.DriverManager;
import com.rezaul.newtours.Utils.UrlTextUtils;
import com.rezaul.newtours.Utils.XpathUtils;

public class BackToHome {

	
public WebDriver driver = null;
	
	
	@Test(priority=9)
	public void checkBacktoHomePageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.BookAFlight.CLICK_BACK_TO_HOME)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.FLIGHT_CONFIRMATION_TITLE);
		
		System.out.println("Back To Home Page Title Verified !!");
	}
	
	@Test(priority = 10)
	public void backtohometest() {
		
		driver.findElement(By.xpath(XpathUtils.BookAFlight.CLICK_BACK_TO_HOME)).click();
		
		
	}
}
