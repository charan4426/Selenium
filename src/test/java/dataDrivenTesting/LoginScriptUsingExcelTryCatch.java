package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginScriptUsingExcelTryCatch {
	public static void main(String args []) {
		Map <String,String> map = readData();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(map.get("url"));
		long time =Long.parseLong(map.get("timeout"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("email")).sendKeys(map.get("username") + Keys.TAB + map.get("password") + Keys.ENTER );
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	public static Map<String,String> readData()  {
FileInputStream fis = null;
try {
	fis = new FileInputStream("./src/test/resources/TestData.xlsx");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet("sheet 1");
		
		DataFormatter df = new DataFormatter();
	    Map<String,String> map = new HashMap<String,String>();
	    
	    for (int i=0;i<=sheet.getLastRowNum();i++) {
	    	String key = df.formatCellValue(sheet.getRow(i).getCell(0));
	    	String value = df.formatCellValue(sheet.getRow(i).getCell(1));
	    	map.put(key, value);
	    	
	    }
	    System.out.println(map);
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	
			}	


}
