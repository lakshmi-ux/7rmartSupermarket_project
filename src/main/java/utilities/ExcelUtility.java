package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import constants.Constants;

public class ExcelUtility {
	public static FileInputStream fs; 
	public static XSSFWorkbook wb;
	public static XSSFSheet s;
	
	public static String readStringData(int i ,int j,String sheetName)  { 
		try{
		String path=Constants.HOME_DIRECTORY + Constants.TESTDATA_EXCELPATH;
		fs= new FileInputStream(path); 
		wb= new XSSFWorkbook(fs); 
		s= wb.getSheet(sheetName); 
		XSSFRow r= s.getRow(i); 
		XSSFCell c= r.getCell(j); 
		return c.getStringCellValue();
		}
		catch(Exception e) {
			throw new RuntimeException("Excel sheet not found");
		}
	}
	public static double readNumData(int i, int j, String sheetName)  { 
		try {
		String path=Constants.HOME_DIRECTORY + Constants.TESTDATA_EXCELPATH;
		fs= new FileInputStream(path); 
		wb= new XSSFWorkbook(fs); 
		s= wb.getSheet(sheetName); 
		XSSFRow r= s.getRow(i); 
		XSSFCell c= r.getCell(j); 
		return c.getNumericCellValue();
	}
		catch(Exception e) {
			throw new RuntimeException("Excel sheet not found");
		}

	}
}
