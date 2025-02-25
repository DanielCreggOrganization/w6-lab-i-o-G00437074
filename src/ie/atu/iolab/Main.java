package ie.atu.iolab;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) { {
            // Define the file path
            String filePath = "resources/input.txt";
    
            // Reading the file
            try (FileReader reader = new FileReader(filePath)) {
                int character;  // Character Count: The number of characters in "This is a different test string." (including spaces).
                int charCount = 0; // Byte Count: Since we are using ASCII characters, each character is 1 byte, so the byte count matches the character count.
    
                System.out.print("File Content: ");
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                    charCount++;
                }
    
                // Print character count (same as byte count in ASCII)
                System.out.println("\nCharacter Count: " + charCount);
                System.out.println("Byte Count: " + charCount); // Same as char count in ASCII
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
}

}
