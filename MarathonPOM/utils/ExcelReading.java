package utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
			public static String[][] inputdata(String filename) throws IOException {
			
		                    //XSSForkbook constructor
	    XSSFWorkbook wb =new XSSFWorkbook("dataforsales/"+filename+".xlsx");
	    //go into sheet based on sheet name
	    //XSSFSheet sheet = wb.getSheet("Sheet1");  //input string name
	    //wb.getSheet("Sheet1");
	    //Get into the sheet based on index
	    XSSFSheet ws = wb.getSheetAt(0);
	    
	    //Get Row count
	    int rowCount = ws.getLastRowNum();
	    //To get the columnCount
	    short columnCount =
	    		ws.getRow(0).getLastCellNum();
	   //To pass the data
	    String[][] data=new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			// Get my Column
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				// Read the data from excel
				data[i - 1][j] = cell.getStringCellValue();
				// print the particular value
				String cellvalue = cell.getStringCellValue();
				System.out.println(cellvalue);

			}
		}
	  //close the workbook
	    wb.close();
		return data;
	}

	}



