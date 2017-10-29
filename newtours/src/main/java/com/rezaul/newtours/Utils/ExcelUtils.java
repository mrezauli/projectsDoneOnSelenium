package com.rezaul.newtours.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rezaul.newtours.DTO.BookFlightDTO;
import com.rezaul.newtours.DTO.FlightFinderDTO;
import com.rezaul.newtours.DTO.LoginDTO;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;
	
	private  static Sheet getSheet(int sheetNo) throws IOException{
		
		File f = new File("src/main/java");
		File fs = new File(f,"excelForTesting.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;
	}
	public static List<LoginDTO> getLoginData() throws IOException{
		ArrayList<LoginDTO> logindata=new ArrayList<LoginDTO>();
		DataFormatter formatter = new DataFormatter();
		//login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			LoginDTO login=new LoginDTO();
			byte cellCounter=0;
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cellCounter) {
				case 0:
					login.setUserName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					login.setPassword(formatter.formatCellValue(cell));
					break;
				default:
					break;
			}
		}
			logindata.add(login);
		}
		
		
		close();
		return logindata;
		
		}
	
	
	
	public static List<FlightFinderDTO> getFlightFinderData() throws IOException{
		ArrayList<FlightFinderDTO> flightfinderdata = new ArrayList<FlightFinderDTO>();
		DataFormatter formatter = new DataFormatter();
		
		Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			FlightFinderDTO flightfinder = new FlightFinderDTO();
			byte cellCounter=0;
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cellCounter) {
				case 0:
					flightfinder.setPassengers(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					flightfinder.setDepartingFrom(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					flightfinder.setOnMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					flightfinder.setOnDay(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					flightfinder.setArrivingIn(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					flightfinder.setReturningMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					flightfinder.setReturningDay(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					flightfinder.setAirline(formatter.formatCellValue(cell));
					break;
				default:
					break;
			}
		}
			flightfinderdata.add(flightfinder);
		}
		
		close();
		
		return flightfinderdata;
		
		}
	
	public static List<BookFlightDTO> getBookFlightData() throws IOException{
		ArrayList<BookFlightDTO> bookflightdata = new ArrayList<BookFlightDTO>();
		DataFormatter formatter = new DataFormatter();
		
		Iterator<Row> iterator = ExcelUtils.getSheet(2).iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			BookFlightDTO bookflight = new BookFlightDTO();
			byte cellCounter=0;
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cellCounter) {
				case 0:
					bookflight.setPassengersFirstName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					bookflight.setPassengersLastName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					bookflight.setMeal(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					bookflight.setCardType(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					bookflight.setCardNumber(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					bookflight.setCardExpirationMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					bookflight.setCardExpirationDay(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					bookflight.setCardFirstName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 8:
					bookflight.setCardMiddleName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 9:
					bookflight.setCardLastName(formatter.formatCellValue(cell));
					break;
				default:
					break;
			}
		}
			bookflightdata.add(bookflight);
		}
		
		close();
		
		return bookflightdata;
		
		}
	
	
	private static void close() throws IOException {
		
		
		workbook.close();
		inputStream.close();
		
	}
}
