package FrameWork;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public  String[][] learnexcel(String filename) throws IOException {
		
		
		XSSFWorkbook book=new XSSFWorkbook("./Data/"+filename+".xlsx");
		
		XSSFSheet sheet = book.getSheetAt(1);
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		short columncount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(columncount);
		
		String[][] data=new String[rowcount][columncount];
		
		for (int j = 1; j <= rowcount ; j++) {
			
			XSSFRow row = sheet.getRow(j);
			
			for (int i = 0; i < columncount; i++) {

				XSSFCell cell = row.getCell(i);

				String value = cell.getStringCellValue();
				
				data[j-1][i]= value;

				System.out.println(value+"");
			} 
			
			System.out.println();
		}
		
		return data;
		
		
		
		
		
	}

}
