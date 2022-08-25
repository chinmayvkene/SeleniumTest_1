package test_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		File path = new File("E:\\XL Doc\\Excel_Read.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream input = new FileOutputStream(path);
		sheet1.createRow(3).createCell(0).setCellValue("MAVENS");
		workbook.write(input);
	}
}
