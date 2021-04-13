package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtil {

	public static void getRowCount() {
		XSSFWorkbook workbook;
		try {

			workbook = new XSSFWorkbook("C:\\Users\\DELL\\git\\SeleniumJavaDemo\\Xyz\\Excel\\Data.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of row : "+rowCount);

		} 
		catch (Exception exp) {
			System.out.println (exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}




	public static CharSequence[] getFirstRow(int rowNum, int colnum) {
		XSSFWorkbook workbook;
		try {

			workbook = new XSSFWorkbook("C:\\Users\\DELL\\git\\SeleniumJavaDemo\\Xyz\\Excel\\Data.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();

			String cellData=sheet.getRow(rowNum).getCell(colnum).getStringCellValue();
			System.out.println(cellData);
		} 
		catch (Exception exp) {
			System.out.println (exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return null;

	}



	public static CharSequence[] getSecondRow(int rowNum, int colnum) {
		XSSFWorkbook workbook;
		try {

			workbook = new XSSFWorkbook("C:\\Users\\DELL\\git\\SeleniumJavaDemo\\Xyz\\Excel\\Data.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();

			String cellData=sheet.getRow(rowNum).getCell(colnum).getStringCellValue();
			System.out.println(cellData);
		} 
		catch (Exception exp) {
			System.out.println (exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return null;

	}


	public static void main(String[] args) {
		ExcelUtil.getFirstRow(0, 0);
		ExcelUtil.getSecondRow(1,1);
	}} 