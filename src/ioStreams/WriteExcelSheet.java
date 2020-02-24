package ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {
	
	public static void main(String[] args) throws IOException {
		File src = new File("C:\\ExcelData\\TestData3.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		sheet1.getRow(3).createCell(2).setCellValue("fail");
		sheet1.getRow(5).createCell(2).setCellValue("pass");
		
		
		FileOutputStream fos = new FileOutputStream(src);
		
		wb.write(fos);
		wb.close();
		
	}

}
