package test_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteUtility {

	public void excelwriting(int sheetnum, int rownum, int cellnum, String value) throws IOException {
		File path = new File("E:\\XL Doc\\Excel_Read.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetnum);
		FileOutputStream input = new FileOutputStream(path);
		sheet1.createRow(rownum).createCell(cellnum).setCellValue(value);
		workbook.write(input);
	}
	
	public static void main(String[] args) throws IOException {
		ExcelWriteUtility output = new ExcelWriteUtility();
		output.excelwriting(0, 1, 1, "MAVENS");
		output.excelwriting(0, 2, 1, "MAVENS");
	}
}
