package ExcelReading;

import org.dom4j.io.XPP3Reader;

import Xls_Reader.Xls_Reader;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.IOException;

		import org.apache.poi.hssf.usermodel.HSSFCell;
		import org.apache.poi.hssf.usermodel.HSSFRow;
		import org.apache.poi.hssf.usermodel.HSSFSheet;
		import org.apache.poi.hssf.usermodel.HSSFWorkbook;
		import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		import Xls_Reader.Xls_Reader;

		public class ExcelReader {

			public static void main(String[] args) throws Throwable {
				//XLS READER - .xlsx file reading
				Xls_Reader xls = new Xls_Reader ("C:\\Users\\mkumar\\Documents\\workspace\\ExternalFileReading\\src\\ExcelReading\\TestData.xlsx");
				
				String a = xls.getCellData("Test Cases", "OBJECTIVE", 2);
				System.out.println(a);
				
				System.out.println(xls.getRowCount("Test Cases"));
				
				xls.setCellData("Test Cases", "Result", 2, "pass");
				
				
				/*//HSSF READER  .xls file
				String excelFileName = "E:\\Madhavi\\Support1\\SupportDocs\\Regular Training 9\\TestData.xls";
				File file = new File (excelFileName);
				FileInputStream fs = new FileInputStream(file);
				
				//name of excel file
				String sheetName = "Sheet1";//name of sheet
				HSSFWorkbook wb = new HSSFWorkbook();
				HSSFSheet sheet = wb.createSheet(sheetName) ;
				//iterating r number of rows
				for (int r=0;r < 5; r++ )
				{
					HSSFRow row = sheet.createRow(r);	
					//iterating c number of columns
					for (int c=0;c < 5; c++ )
					{
						HSSFCell cell = row.createCell(c);
						
						cell.setCellValue("Cell "+r+" "+c);
					}
				}
				
				FileOutputStream fileOut = new FileOutputStream(excelFileName);
				
				//write this workbook to an Outputstream.
				wb.write(fileOut);
				fileOut.flush();
				fileOut.close();*/
				
				
				/*//XSSF READER - .xlsx file
						String excelFileName = "E:\\Madhavi\\Support1\\SupportDocs\\Regular Training 9\\TestData.xlsx";
						//name of excel file
						String sheetName = "Sheet1";//name of sheet
						XSSFWorkbook wb = new XSSFWorkbook();
						XSSFSheet sheet = wb.createSheet(sheetName) ;
						//iterating r number of rows
						for (int r=0;r < 5; r++ )
						{
							XSSFRow row = sheet.createRow(r);	
							//iterating c number of columns
							for (int c=0;c < 5; c++ )
							{
								XSSFCell cell = row.createCell(c);
								
								cell.setCellValue("Cell "+r+" "+c);
							}
						}
						
						FileOutputStream fileOut = new FileOutputStream(excelFileName);
						
						//write this workbook to an Outputstream.
						wb.write(fileOut);
						fileOut.flush();
						fileOut.close();*/
				
				
			}


	}


