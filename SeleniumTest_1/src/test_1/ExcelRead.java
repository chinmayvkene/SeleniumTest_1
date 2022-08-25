package test_1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		File path = new File("E:\\XL Doc\\Excel_Read.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
