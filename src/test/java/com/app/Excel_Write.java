package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	
	public static void exel_write() {

		try {
			File f = new File(
					"C:\\Users\\HP\\eclipse-workspace\\new\\Sample_Jan\\src\\test\\resources\\TestData\\Excel_One.xlsx");
			// file read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet createSheet = wb.createSheet("Aiite");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue("Java");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			System.out.println("exe");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void exel_modify() {

		try {
			File f = new File(
					"C:\\Users\\HP\\eclipse-workspace\\new\\Sample_Jan\\src\\test\\resources\\TestData\\Excel_One.xlsx");
			// file read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet getSheet = wb.getSheet("Aiite");
			Row getRow = getSheet.getRow(0);
			Cell getCell = getRow.getCell(0);
			String stringCellValue = getCell.getStringCellValue();
			if(stringCellValue.equals("Java")) {
				getCell.setCellValue("Selenium");
			}
			
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			System.out.println("exe");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		exel_modify();
	}
}
