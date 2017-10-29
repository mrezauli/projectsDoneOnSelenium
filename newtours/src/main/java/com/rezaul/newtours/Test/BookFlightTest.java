package com.rezaul.newtours.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rezaul.newtours.DTO.BookFlightDTO;
import com.rezaul.newtours.DataProvider.BookFlightDataProvider;
import com.rezaul.newtours.Utils.DriverManager;
import com.rezaul.newtours.Utils.UrlTextUtils;
import com.rezaul.newtours.Utils.XpathUtils;

public class BookFlightTest {

public WebDriver driver = null;
	
	
	@Test(priority=7)
	public void checkBookFlightPageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.BookAFlight.SELECT_CARD_TYPE)));
		
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.BOOK_A_FLIGHT_TITLE);
		
		System.out.println("Book a Flight Page Title Verified !!");
	}
	
	@Test(priority = 8, dataProvider = "bookflightData", dataProviderClass = BookFlightDataProvider.class)
	public void bookflighttest(List<BookFlightDTO> bookflightdata) {
		
		
		for(BookFlightDTO bookflight: bookflightdata){
			driver.findElement(By.xpath(XpathUtils.BookAFlight.INPUT_FIRST_NAME)).sendKeys(bookflight.getPassengersFirstName());
			
			driver.findElement(By.xpath(XpathUtils.BookAFlight.INPUT_LAST_NAME)).sendKeys(bookflight.getPassengersLastName());
			
			Select meal = new Select(driver.findElement(By.xpath(XpathUtils.BookAFlight.SELECT_MEAL)));
			
			meal.selectByValue(bookflight.getMeal());
			
			Select card_type = new Select(driver.findElement(By.xpath(XpathUtils.BookAFlight.SELECT_CARD_TYPE)));
			
			card_type.selectByValue(bookflight.getCardType());
			
			driver.findElement(By.xpath(XpathUtils.BookAFlight.INPUT_NUMBER)).sendKeys(bookflight.getCardNumber());
			
			Select expiration_one = new Select(driver.findElement(By.xpath(XpathUtils.BookAFlight.SELECT_EXPIRATION_ONE)));
			
			expiration_one.selectByIndex(5);;
			
			Select expiration_two = new Select(driver.findElement(By.xpath(XpathUtils.BookAFlight.SELECT_EXPIRATION_TWO)));
			
			expiration_two.selectByValue(bookflight.getCardExpirationDay());
			
			driver.findElement(By.xpath(XpathUtils.BookAFlight.INPUT_CARD_FIRST_NAME)).sendKeys(bookflight.getCardFirstName());
			
			driver.findElement(By.xpath(XpathUtils.BookAFlight.INPUT_CARD_MIDDLE_NAME)).sendKeys(bookflight.getCardMiddleName());
			
			driver.findElement(By.xpath(XpathUtils.BookAFlight.INPUT_CARD_LAST_NAME)).sendKeys(bookflight.getCardLastName());
			
			driver.findElement(By.xpath(XpathUtils.BookAFlight.CLICK_SECURE_PURCHASE)).submit();
			
			
			
			
			
			System.out.println("Book a Flight Success!!!");
		
		}
	}
}
