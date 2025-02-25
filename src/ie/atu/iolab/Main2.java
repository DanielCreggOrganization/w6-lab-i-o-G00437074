package ie.atu.iolab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        String inputFilePath = "resources/input.txt";
        String outputFilePath = "resources/output.txt";

        try (FileReader reader = new FileReader(inputFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {

            int character;
            while ((character = reader.read()) != -1) {
                char ch = (char) character;

                // Convert 'T', 'H', 'I', 'S' to uppercase, others to lowercase
                if (ch == 'T' || ch == 'H' || ch == 'I' || ch == 'S') {
                    writer.write(Character.toUpperCase(ch));
                } else {
                    writer.write(Character.toLowerCase(ch));
                }
            }

            System.out.println("Processing complete. Check output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
