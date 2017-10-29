package com.rezaul.newtours.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManager {
	 
	static {
		System.setProperty("webdriver.gecko.driver", "E:/jobCirculation/trainingUpgradation/softwareTestingAndQualityAssuranceUsingSelenium5thBatch/workAreaDangerZone/eclipse-java-oxygen-R-win32-x86_64/allDriversForTesting/geckodriver.exe");
	}
	public static WebDriver driver = new FirefoxDriver();
	
	
	

	@Test(priority = 0 )
	public void driverexecution() {
		System.out.println("Driver Executed!!");
	}

	private DriverManager() {

	}
}
