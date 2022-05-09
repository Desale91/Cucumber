package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static void main(String[] args) throws Exception {
		
		File f= new File("D:\\12.03.2020\\TestNG And Data driven FrameWork\\Excel Data\\TestingData.xlsx");
		boolean excelFile=f.exists();
		System.out.println("Excel file is present "+excelFile);
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		f.deleteOnExit();
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheets=workbook.getSheetAt(0);

//		int a=sheets.getLastRowNum();
//		System.out.println(a);
		
//		String b=sheets.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(b);
//		
//		for(int i=0; i<15;i++) {
//			
//		String Value=sheets.getRow(i).getCell(0).getStringCellValue();
//		System.out.println(Value);
//			
//		}
//		
		
//		String data1=sheets.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data1);
		
		for(int i=0; i<15;i++) {
			String data1=sheets.getRow(i).getCell(0).getStringCellValue();
			String data2=sheets.getRow(i).getCell(1).getStringCellValue();
			String data3=sheets.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data1+" "+data2+" "+data3);
		}
	}
	

}
