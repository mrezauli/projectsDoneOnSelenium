package com.rezaul.newtours.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.rezaul.newtours.Utils.ExcelUtils;

public class BookFlightDataProvider {

	@DataProvider(name="bookflightData")
	public static Object[][] getbookflightData() {
		try {
			return new Object[][]{
				{
					ExcelUtils.getBookFlightData()
				},
			};
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
			return null;
		}
	}
}
