package test_1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {

	public String excelReading(int sheetnum, int rownum, int cellnum) throws IOException {
		File path = new File("E:\\XL Doc\\Excel_Read.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetnum);
		return sheet1.getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	public static void main(String[] args) throws IOException {
		ExcelReadUtility read = new ExcelReadUtility();
		System.out.println(read.excelReading(0, 0, 0));
		System.out.println(read.excelReading(0, 1, 0));
		System.out.println(read.excelReading(0, 2, 0));
		System.out.println(read.excelReading(0, 0, 1));
	}
}
