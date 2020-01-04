package week4.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static void main(String[] args) throws IOException {
		
XSSFWorkbook book=new XSSFWorkbook("./Data/CreateLead.xlsx");
		
		XSSFSheet sheet = book.getSheetAt(1);
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		short columncount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(columncount);
		
		
		for (int j = 1; j <= rowcount ; j++) {
			
			XSSFRow row = sheet.getRow(j);
			
			for (int i = 0; i < columncount; i++) {

				XSSFCell cell = row.getCell(i);

				String value = cell.getStringCellValue();
				
				

				System.out.print(value+" | ");
			} 
			
			System.out.println(" ");		
		
		
	}


	}

}