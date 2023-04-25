package seleniumTask;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	
		// TODO Auto-generated method stub
		
		public static String[][] getExcel() throws IOException {

			
			String filelocation="./files/ExcelData.xlsx";	
			XSSFWorkbook wbook= new XSSFWorkbook(filelocation);
			
			XSSFSheet sheet= wbook.getSheetAt(0);
			int lastRowNum = sheet.getLastRowNum();
			System.out.println(lastRowNum);			//without header row count
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println("Inclusive header row: "+physicalNumberOfRows);
			short lastCellNum = sheet.getRow(0).getLastCellNum(); //this for get last cell value
			System.out.println(lastCellNum);
			
			String[][] data=new String[lastRowNum][lastCellNum];
		    for (int i = 1; i <=lastRowNum; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = row.getCell(j);
					DataFormatter dataFormat=new DataFormatter();
					String value = dataFormat.formatCellValue(cell);
					//String value = cell.getStringCellValue();
					//System.out.println(value);
					data[i-1][j]=value;
				} 
			}
		    
				wbook.close();
			
		    return data;
		}


	}


