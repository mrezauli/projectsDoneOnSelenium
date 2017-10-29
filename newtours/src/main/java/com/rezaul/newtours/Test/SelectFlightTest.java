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

public class SelectFlightTest {

public WebDriver driver = null;
	
	
	@Test(priority=5)
	public void checkSelectFlightPageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.SelectFlightPage.CLICK_DEPART)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.SELECT_FLIGHT_TITLE);
		
		System.out.println("Select Flight Page Title Verified !!");
	}
	
	@Test(priority = 6)
	public void selectflighttest() {
		
			driver.findElement(By.xpath(XpathUtils.SelectFlightPage.CLICK_DEPART)).click();;
			
			driver.findElement(By.xpath(XpathUtils.SelectFlightPage.CLICK_RETURN)).click();;
			
			driver.findElement(By.xpath(XpathUtils.SelectFlightPage.CLICK_CONTINUE)).submit();
		
		
	}
}
