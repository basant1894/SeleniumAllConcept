package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\ExcelData\\TestData5.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1"); //providing sheet name
		//XSSFSheet sheet = wb.getSheet(0); //proving sheet name by index no.
		
		int rowCount = sheet.getLastRowNum(); //return row count
		
		int colcount = sheet.getRow(0).getLastCellNum(); //return column/cell count
		
		for(int i=0; i<rowCount; i++){
			
			XSSFRow currentRow = sheet.getRow(i); //focus on current row or firstRow
			
			for (int j = 0; j < colcount ; j++) {
				
				String value=currentRow.getCell(j).toString(); //read the value from cell
				System.out.print(" " +value);
					
			}
			System.out.println(); //it's just for alignment
				
		}
			
	}	

}
