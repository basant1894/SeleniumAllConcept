package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class ReadDataFromInput_WriteToExcel {
  @Test
  public void step2() throws Exception {
	 //1. Print/Read the input data from Testdata file 
	  //2. Create Result file and add the printed data to result file
	 FileInputStream fis = new FileInputStream("C:\\ExcelData\\TestData\\Sheet1.xls");
	 Workbook w = Workbook.getWorkbook(fis);
	 Sheet s = w.getSheet("LoginData");
	 
	 FileOutputStream fos = new FileOutputStream("C:\\ExcelData\\Results\\LoginResults.xls");
	 WritableWorkbook wb = Workbook.createWorkbook(fos);
	 WritableSheet ws = wb.createSheet("Results", 0);
	 
	 for (int i = 0; i < s.getRows(); i++) {
		 Label result=new Label(2, i, "Fail");
		 ws.addCell(result);
		 
		 for (int j = 0; j < s.getColumns(); j++) {
			 System.out.println(s.getCell(j, i).getContents());
			 Label l = new Label(j, i, s.getCell(j, i).getContents());
			 ws.addCell(l);
		}
	}
	 Label rs = new Label(2,0,"Result");
	 ws.addCell(rs);
	 
	 
	 wb.write();
	 wb.close();
	 
  }
}














