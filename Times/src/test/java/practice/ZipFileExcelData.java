package practice;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileExcelData {
    public static void main(String[] args) throws IOException {
        // Specify the path to your zip file
        String zipFilePath = "./Data/sample.zip";

        // Specify the name of the Excel file inside the zip archive
        String excelFileNameInsideZip = "sam.xlsx";

        ZipFile zipFile = new ZipFile(zipFilePath);
            // Get all entries in the zip file
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            
            // Iterate through each entry to find the Excel file
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();

                // Check if the entry is the Excel file
                if (entry.getName().equals(excelFileNameInsideZip)) {
                    // Open an InputStream for the Excel file
                    try (InputStream inputStream = zipFile.getInputStream(entry)) {
                        // Read data from the Excel file using Apache POI
                        Workbook workbook = new XSSFWorkbook(inputStream);
                        Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet

                        // Iterate through rows and cells
                        for (Row row : sheet) {
                            for (Cell cell : row) {
                                // Print the cell value
                                System.out.print(cell.toString() + "\t");
                            }
                            System.out.println(); // Move to the next line for the next row
                        }

                        // Close the workbook
                        workbook.close();
                    }
                }
            }
    }
}
//    