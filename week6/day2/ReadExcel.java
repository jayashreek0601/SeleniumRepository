package week6.day2;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String filename) throws IOException {
		// Open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");

		// Open the Worksheet
		// wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);

		// Count the number of the rows
		// Count the number of the columns
		// Retrieve a particular data

		// Count the number of the rows - Excluding row 1
		int rowCount = ws.getLastRowNum();
		System.out.println("rowCount is :" + rowCount);

		// Count the number of the rows - Including row 1
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows is: " + physicalNumberOfRows);

		// Count the number of Columns
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("columnCount is : " + columnCount);

		// To retrieve a single data
		String row1Cell2Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("row1Cell2Data is : " + row1Cell2Data);

		String[][] data = new String[rowCount][columnCount];

		// To retrieve entire data
		// 1 2
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			// XSSFRow row1 = ws.getRow(1);
			// XSSFRow row1 = ws.getRow(2);
			// 0 1 2
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("The data is: " + allData);

				data[i - 1][j] = allData;
				// data[0][0]=Qeagle;
				// data[0][1]=Vineeth;
				// data[0][2]=Rajendran
				// String allData = row.getCell(0).getStringCellValue(); //Qeagle
				// String allData = row.getCell(1).getStringCellValue(); //Vineeth
				// String allData = row.getCell(2).getStringCellValue(); //Rajendran

				// String allData = row.getCell(0).getStringCellValue(); //TestLeaf
				// String allData = row.getCell(1).getStringCellValue(); //Seenivasan
				// String allData = row.getCell(2).getStringCellValue(); //S

			}
			
		}
		return data;
	}
}
