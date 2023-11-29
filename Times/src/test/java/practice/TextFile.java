package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class TextFile {
	@Test
    public void main() {
        // Specify the path to your text file
        String filePath = "./Data/SDET-49.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line as needed
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	@Test
	public void secondWay() throws IOException {
		// Specify the path to your text file
        String filePath = "./Data/SDET-49.txt";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line as needed
                System.out.println(line);
            }
       
	}
}
