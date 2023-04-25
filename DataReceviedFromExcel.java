package seleniumTask;

import java.io.IOException;
import org.testng.annotations.DataProvider;



public class DataReceviedFromExcel {

	@DataProvider(name = "login")
	public String[][] getData() throws IOException {
		
		
		 String[][] excel = ReadExcelData.getExcel();
		 
			return excel;
			}
}
