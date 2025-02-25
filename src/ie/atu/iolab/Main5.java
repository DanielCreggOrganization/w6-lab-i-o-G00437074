package ie.atu.iolab;

// Exercise 7

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main5 {

    public static void main(String[] args) {
        String inputPath = "resources/input.txt";

        // Reading and counting lines
        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            long lineCount = lines.count();
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Reading and processing each line, counting words, and finding the longest word
        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            long wordCount = lines
                    .flatMap(line -> Arrays.stream(line.split("\\s+"))) // Split each line into words
                    .count(); // Count the words
            System.out.println("Number of words: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }

        // Finding the longest word
        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            Optional<String> longestWord = lines
                    .flatMap(line -> Arrays.stream(line.split("\\s+"))) // Split into words
                    .max(Comparator.comparingInt(String::length)); // Find longest by length

            System.out.println("Longest word: " + longestWord.orElse("No words found"));
        } catch (IOException e) {
            System.err.println("Error finding longest word: " + e.getMessage());
        }
    }

}
