package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class GenDataProvider {
	@DataProvider(name="data")
	public Object[][] data(String filepath,String sheet_Name) throws EncryptedDocumentException, IOException
	{
	   FileInputStream fis = new FileInputStream(filepath);
	   Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheetName = wb.getSheet(sheet_Name);
	  int rowCount = sheetName.getLastRowNum();
	  int cellCount = sheetName.getRow(0).getLastCellNum();
	  Object[][] obj = new Object[rowCount][cellCount];
	  for(int i=0;i<rowCount;i++)
	  {
		  for(int j=0;j<cellCount;j++)
		  {
			  obj[i][j]=sheetName.getRow(i+1).getCell(j).getStringCellValue();
		  }
	  }
	  return obj;
	  
	}
}
