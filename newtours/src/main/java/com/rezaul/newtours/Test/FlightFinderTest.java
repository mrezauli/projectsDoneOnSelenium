package com.rezaul.newtours.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rezaul.newtours.DTO.FlightFinderDTO;
import com.rezaul.newtours.DataProvider.FlightFinderDataProvider;
import com.rezaul.newtours.Utils.DriverManager;
import com.rezaul.newtours.Utils.UrlTextUtils;
import com.rezaul.newtours.Utils.XpathUtils;



public class FlightFinderTest {

	public WebDriver driver = null;
	
	
	@Test(priority=3)
	public void checkFlightFindPageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FlightFinderPage.CLICK_PASSENGERS)));
		
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.FLIGHT_FINDER_TITLE);
		
		System.out.println("Flight Find Page Title Verified !!");
	}
	
	@Test(priority = 4, dataProvider = "flightFinderData", dataProviderClass = FlightFinderDataProvider.class)
	public void flightfindertest(List<FlightFinderDTO> flightfinderdata) {
		
		
		for(FlightFinderDTO flightfinder: flightfinderdata){
			driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_TYPE)).click();
			
			Select passengers = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_PASSENGERS)));
			
			passengers.selectByValue(flightfinder.getPassengers());
			
			Select departing_from = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_DEPARTING_FROM)));
			
			departing_from.selectByValue(flightfinder.getDepartingFrom());
			
			Select on_month = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_ON_MONTH)));
			
			on_month.selectByValue(flightfinder.getOnMonth());
			
			Select on_day = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_ON_DAY)));
			
			on_day.selectByValue(flightfinder.getOnDay());
			
			Select arriving_in = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_ARRIVING_IN)));
			
			arriving_in.selectByValue(flightfinder.getArrivingIn());
			
			
			Select returning_month = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_RETURNING_MONTH)));
			
			returning_month.selectByValue(flightfinder.getReturningMonth());
			
			Select returning_day = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_RETURNING_DAY)));
			
			returning_day.selectByValue(flightfinder.getReturningDay());
			
			driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_SERVICE_CLASS)).click();
			
			Select airline = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_AIRLINE)));
			
			airline.selectByVisibleText(flightfinder.getAirline());
			
			driver.findElement(By.xpath(XpathUtils.FlightFinderPage.CLICK_CONTINUE)).submit();
			
			System.out.println("Flight Finder Success!!!");
		
		}
	}
}
