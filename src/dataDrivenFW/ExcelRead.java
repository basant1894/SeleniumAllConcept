package dataDrivenFW;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelRead {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream(" C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		
		HSSFSheet s=wb.getSheet("Basu");
		
		Iterator<Row> rowIt=s.iterator();
		
		while(rowIt.hasNext()){
			System.out.println(rowIt.next().getCell(0).getStringCellValue());
		}
	}
	

	
}
