package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelMethodChaining {
	public static void main(String args []) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("sheet 1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
	    double num =  wb.getSheet("sheet 1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(num);
		wb.close();
	}
}
