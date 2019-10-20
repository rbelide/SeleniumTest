package util;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void main (String []args) {
		getRowCount();
	}
	public static void getRowCount() {
		try {
		
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Divya\\Documents\\Ramu\\Excel\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows" + rowcount);
	}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		}
}
