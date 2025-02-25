package ie.atu.iolab;

// Exercise 5

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) {
        // Define file paths for input and output files
        String inputFilePath = "resources/input.txt";
        String outputFilePath = "resources/output.txt";

        // Using try-with-resources to ensure automatic resource management
        try (FileReader reader = new FileReader(inputFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {

            StringBuilder content = new StringBuilder(); // To store the file content
            int character;

            // Read characters from the input file one by one
            while ((character = reader.read()) != -1) {
                content.append((char) character); // Append each character to StringBuilder
            }

            // Reverse the content stored in StringBuilder
            String reversedContent = content.reverse().toString();

            // Write the reversed content to the output file
            writer.write(reversedContent);

            System.out.println("Reversed content written to output.txt");

        } catch (IOException e) {
            // Handle any I/O errors
            System.out.println("Error: " + e.getMessage());
        }
    }

}
