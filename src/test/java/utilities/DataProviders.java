package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException {
		
		String path = ".\\testData\\OracleFusionCloud_Flow_Dataset.xlsx"; // Taking excel file from testdata
		
		ExcelUtility xlutil = new ExcelUtility(path); // Creating an object for excel utility
		
		int totalrows = xlutil.getRowCount("sheet1");
		int totalcolumns = xlutil.getCellCount("sheet1", 1);
		
		String logindata [][] = new String [totalrows][totalcolumns]; //Created for two dimensional array
		
		for(int i = 1; i <= totalrows; i++ ) { // 1 //read the data from excel storing in two dimensional array
			
			for(int j = 0; j < totalcolumns; j++) { //0 // i is rows, j is columns
				
				logindata[i - 1][j] = xlutil.getCellData("sheet1", i, j); // 1,0
			}
		}
		
		return logindata; // Returning two dimension array
	}
}
