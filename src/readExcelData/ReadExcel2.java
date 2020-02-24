package readExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	
	public static void main(String[] args) throws Exception {
		 File src = new File("D:\\Basant\\ExcelData\\testData.xlsx");
		 
		 FileInputStream fis = new FileInputStream(src);
		 
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet1 = wb.getSheetAt(0);
		 
		 int rowCount = sheet1.getLastRowNum();
		 System.out.println("Total Number of Rows :"+rowCount);
		 
		 for (int i = 0; i < rowCount; i++) {
			 
			String data =sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test Data from Excell is :"+data);
			
		}
	}

}
