package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
/**
 * <i> This class is having methods like</i>
 * 
 * <ul>
 * <b>
 * <li>getDataFromExcel</li><li>getDataFromExcelBasedTestId</li>
 * </b><p>This method is recommended</p><b>
 * <li>getRowCount</li><li>setDataExcel</li>
 * <li>getExcelDataById</li><li>setdataToExcel</li></b>
 * </ul>
 * used to perform Workbook related operations like read , write , getcount etc
 * @author MadhuSudhanaRao Dande
 *
 */
public class ExcelUtlity {

	/**
	 * read the data from excel based row & column index
	 * @param filePath
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String getDataFromExcel(String filePath , String sheetName, int rowNum , int celNum) throws Exception {
		FileInputStream fis1 = new FileInputStream(filePath);
		Workbook wb =  WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet(sheetName);
		Row row =  sheet.getRow(rowNum);
		String data = row.getCell(celNum).toString();
		wb.close();
		return data;
	}
	/**
	 * <h1>read the date based on testId and Required Column name </h1>
	 * @param filePath
	 * @param sheetName
	 * @param testId
	 * @param columnHeader
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String getDataFromExcelBasedTestId(String filePath, String sheetName , String testId, String columnHeader ) throws Exception {
		FileInputStream fis1 = new FileInputStream(filePath);
		Workbook wb =  WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int testRowNum = 0;
		String actTestID="";
		String actColHeaderName="";
		String data="";

		for(int i=0; i<=rowCount; i++) {
			try { actTestID = sheet.getRow(i).getCell(0).toString();} catch (Exception e) {}

			if(actTestID.equalsIgnoreCase(testId)) {
				break;				
			}
			testRowNum++;
		}
		int testColNum =0;
		int celCountforTest = sheet.getRow(testRowNum-1).getLastCellNum();
		for(int j=0; j<celCountforTest; j++) {
			try {actColHeaderName =  sheet.getRow(testRowNum-1).getCell(j).toString(); } catch (Exception e) {}
			if(actColHeaderName.equalsIgnoreCase(columnHeader)) {
				break;
			}
			testColNum++;
		}
		try {data =  sheet.getRow(testRowNum).getCell(testColNum).toString();}catch (Exception e) {}
		return data;
	}
	/**
	 * used to get the maximum used row count in required Sheet 
	 * @param filePath
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	public int  getRowCount(String filePath, String sheetName) throws Exception {
		FileInputStream fis1 = new FileInputStream(filePath);
		Workbook wb =  WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;
	}
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param testId
	 * @param columnHeader
	 * @param data
	 */
	public void setDataExcel(String filePath, String sheetName , int rowNum, int celNum ,String data) throws Exception {
		FileInputStream fis  = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();

	}
	public String getExcelDataById(String filePath, String sheetName, String testId, String columnHeader) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream(filePath);
		Workbook wb =  WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int testRowNum = 0;
		String actTestID="";
		String actColHeaderName="";
		String data="";

		for(int i=0; i<=rowCount; i++) {
			try { actTestID = sheet.getRow(i).getCell(0).toString();} catch (Exception e) {}

			if(actTestID.equalsIgnoreCase(testId)) {
				break;				
			}
			testRowNum++;
		}
		int testColNum =0;
		int celCountforTest = sheet.getRow(testRowNum-1).getLastCellNum();
		for(int j=0; j<celCountforTest; j++) {
			try {actColHeaderName =  sheet.getRow(testRowNum-1).getCell(j).toString(); } catch (Exception e) {}
			if(actColHeaderName.equalsIgnoreCase(columnHeader)) {
				break;
			}
			testColNum++;
		}
		try {
			data =  sheet.getRow(testRowNum).getCell(testColNum).toString();
		}
		catch (Exception e) {}
		return data;
	}
	/**
	 * This Method helps to write data into excel file by column header
	 * @param path
	 * @param sheetName
	 * @param testId
	 * @param columnHeader
	 * @param data
	 * @throws Throwable 
	 * @throws EncryptedDocumentException 
	 */
	public void setdataToExcel(String path, String sheetName , String testId, String columnHeader , String data) throws EncryptedDocumentException, Throwable{
		FileInputStream fin= new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		int testrowno = 0;
		for (int i = 0; i <= rowCount; i++) {
			String acttestId = sheet.getRow(i).getCell(0).toString();
			if (acttestId.equalsIgnoreCase(testId)) {
				break;
			}
			testrowno++;
		}
		int cellCount=sheet.getRow(testrowno-1).getLastCellNum();
		int testcolno=0;
		for (int i = 0; i <cellCount ; i++) {
			String actcolHeader = sheet.getRow(testrowno-1).getCell(i).toString();
			if (actcolHeader.equalsIgnoreCase(columnHeader)) {
				break;
			}
			testcolno++;
		}
		
		sheet.getRow(testrowno).getCell(testcolno).setCellValue(data);
		FileOutputStream fout=new FileOutputStream(path);
		wb.write(fout);
		wb.close();
		Reporter.log("## Successfully written data into excel ##", true);
	}
}







