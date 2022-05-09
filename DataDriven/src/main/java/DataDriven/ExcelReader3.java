package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheets;
	public ExcelReader3(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static String getData(int sheetIndex, int row, int cell) {
//		System.out.println("==========5");
		XSSFSheet sheets=workbook.getSheetAt(sheetIndex);
		String data =sheets.getRow(row).getCell(cell).getStringCellValue();
//		System.out.println("==========6");
		return data;
		
	}
	
	public static int countRows(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum();	
	}
	
	
	public static int countCells(int sheetIndex, int row) {
		
		return workbook.getSheetAt(sheetIndex).getRow(row).getLastCellNum();
	}

}