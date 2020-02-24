package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		 File src = new File("D:\\Basant\\ExcelData\\testData.xlsx");
		 
		 FileInputStream fis = new FileInputStream(src);
		 
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet1 = wb.getSheetAt(0);
		 
		 String value = sheet1.getRow(0).getCell(0).getStringCellValue();
		 
		 System.out.println("Data from excell is :"+value);
		 
        // String value1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		// System.out.println("Data from excell is :"+value1);
		 
		 wb.close();

		
	}

}
