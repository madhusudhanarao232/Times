package Jsp;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelJsonParser {

    public static void main(String[] args) {
        try {
            // Provide the path to your Excel file
            String excelFilePath = "path/to/your/excel/file.xlsx";

            // Create a FileInputStream to read the Excel file
            FileInputStream inputStream = new FileInputStream(excelFilePath);

            // Create a Workbook object from the Excel file
            Workbook workbook = new XSSFWorkbook(inputStream);

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through each row
            Iterator<Row> iterator = sheet.iterator();
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();

                // Get the JSON data from the first column (assuming it's the first column)
                Cell jsonCell = currentRow.getCell(0);

                // Get the JSON string from the cell
                String jsonString = jsonCell.getStringCellValue();

                // Parse the JSON string using Jackson
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(jsonString);

                // Extract name and email from the JSON
                String name = jsonNode.get("name").asText();
                String email = jsonNode.get("email").asText();

                // Print the output for each row
                System.out.println("Row " + currentRow.getRowNum() + ":");
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println(); // Add a newline for better readability
            }

            // Close the workbook and input stream
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//datau