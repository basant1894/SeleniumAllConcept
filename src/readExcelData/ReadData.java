package readExcelData;

public class ReadData {
	
	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("D:\\Basant\\ExcelData\\testData.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
	}
	
}
