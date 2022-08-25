package test_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteUtility_1 {

	public void excelwriting(int sheetnum, int rownum, int cellnum, String text) throws IOException {
		File path = new File("E:\\XL Doc\\write.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetnum);
		FileOutputStream input = new FileOutputStream(path);
		sheet1.getRow(rownum).createCell(cellnum).setCellValue(text);
		workbook.write(input);
		input.close();
		workbook.close();
	}
	
	public static void main(String[] args) throws IOException {
		ExcelWriteUtility_1 output = new ExcelWriteUtility_1();
		output.excelwriting(0, 0, 0, "Chinmay");
		output.excelwriting(0, 0, 1, "Kene");
		output.excelwriting(0, 1, 0, "Automation");
		output.excelwriting(0, 1, 1, "Engineer");
	}
}
