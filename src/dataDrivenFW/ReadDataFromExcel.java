package dataDrivenFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Basant\\ExcelData\\data1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet s = wb.getSheet("Sheet1");
		
		int rowCount = s.getLastRowNum();
		//System.out.println(rowCount);
		
		int colCount = s.getRow(0).getLastCellNum();
		//System.out.println(colCount);
		
		for (int i = 0; i < rowCount; i++) {
			
			XSSFRow currentRow = s.getRow(i);
			
			for (int j = 0; j < colCount; j++) {
				
				String value = currentRow.getCell(j).toString();
				System.out.println(" " +value);
			}
			System.out.println();
		}
	}

}
