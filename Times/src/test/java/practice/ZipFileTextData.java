package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileTextData {
    public static void main(String[] args) {
        // Specify the path to your zip file
        String zipFilePath = "./Data/sample.zip";

        // Specify the name of the file inside the zip archive
        String fileNameInsideZip = "sam.xlsx";

        try (ZipFile zipFile = new ZipFile(zipFilePath)) {
            // Get the entry corresponding to the specified file
            ZipEntry entry = zipFile.getEntry(fileNameInsideZip);

            // Check if the entry exists
            if (entry != null) {
                // Open an InputStream for the entry
                try (InputStream inputStream = zipFile.getInputStream(entry);
                     InputStreamReader isr = new InputStreamReader(inputStream);
                     BufferedReader reader = new BufferedReader(isr)) {

                    // Read and print the content of the file
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            } else {
                System.out.println("File not found in the zip archive.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

