package com.rezaul.newtours.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.rezaul.newtours.Utils.ExcelUtils;

public class FlightFinderDataProvider {

	@DataProvider(name="flightFinderData")
	public static Object[][] getFlightFinderData() {
		try {
			return new Object[][]{
				{
					ExcelUtils.getFlightFinderData()
				},
			};
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
			return null;
		}
	}
}
