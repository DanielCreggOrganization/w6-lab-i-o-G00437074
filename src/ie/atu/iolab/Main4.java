package ie.atu.iolab;

// Exercise 6

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        // Define the input and output file paths
        String inputPath = "resources/input.txt";
        String outputPath = "resources/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) { // Read the file line by line
                if (line.toLowerCase().contains("second")) { // Check if line contains "second"
                    writer.write(line); // Write matching line to output file
                    writer.newLine(); // Add a newline after each written line
                }
            }
            System.out.println("File processed. Only lines containing 'second' were written.");
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }

}