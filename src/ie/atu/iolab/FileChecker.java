package ie.atu.iolab;

import java.io.File;

public class FileChecker {
    public static void main(String[] args) {
        // Define the file path for output.txt
        File file = new File("resources/output.txt");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File found: " + file.getAbsolutePath());
        } else {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
    }
}