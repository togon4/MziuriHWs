package HW4;
import java.io.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class Main {
    public static void main(String[] args) {
        // 1
//        String fileName = "C:\\Users\\pc\\Documents\\data.txt";
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            List<Byte> byteList = new ArrayList<>();
//            String line;
//
//            while ((line = reader.readLine()) != null && byteList.size() < 10) {
//                try {
//                    byte value = Byte.parseByte(line.trim());
//                    byteList.add(value);
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid byte value in file: " + line);
//                }
//            }
//
//            System.out.println("Read bytes:");
//            for (byte b : byteList) {
//                System.out.println(b);
//            }
//
//            if (byteList.size() < 10) {
//                System.out.println("Warning: Fewer than 10 integers were read from the file.");
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading file: " + e.getMessage());
//        }
        // 2
//        String inputFileName = "C:\\Users\\pc\\Documents\\input.txt";
//        String outputFileName = "C:\\Users\\pc\\Documents\\output.txt";
//
//        try (
//                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
//                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))
//        ) {
//            byte[] byteArray = new byte[10];
//            int index = 0;
//            String line;
//            int sum = 0;
//
//            while ((line = reader.readLine()) != null && index < 10) {
//                try {
//                    byte value = Byte.parseByte(line.trim());
//                    byteArray[index++] = value;
//                    sum += value;
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid byte value in file: " + line);
//                }
//            }
//
//            writer.write("Array elements: ");
//            for (int i = 0; i < index; i++) {
//                writer.write(byteArray[i] + (i < index - 1 ? ", " : "\n"));
//            }
//
//            writer.write("Sum of elements: " + sum + "\n");
//
//            System.out.println("Data written to " + outputFileName);
//        } catch (IOException e) {
//            System.out.println("Error processing files: " + e.getMessage());
//        }
        // 3
//        String inputFileName = "C:\\Users\\pc\\Documents\\input2.txt";
//        String outputFileName = "C:\\Users\\pc\\Documents\\output.txt";
//
//        try (
//                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
//                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))
//        ) {
//            char[] charArray = new char[10];
//            int index = 0;
//            int character;
//
//            while ((character = reader.read()) != -1 && index < 10) {
//                charArray[index++] = (char) character;
//            }
//
//            writer.write("Array elements: ");
//            for (int i = 0; i < index; i++) {
//                writer.write(charArray[i]);
//                if (i < index - 1) {
//                    writer.write(", ");
//                }
//            }
//            writer.write("\n");
//
//            System.out.println("Characters written to " + outputFileName);
//        } catch (IOException e) {
//            System.out.println("Error processing files: " + e.getMessage());
//        }
        // 4
//        String outputFileName = "C:\\Users\\pc\\Documents\\output.txt";
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
//            int[] numbers = {10, 20, 30, 40, 50};
//
//            writer.write(numbers.length + "\n");
//
//            for (int number : numbers) {
//                writer.write(number + "\n");
//            }
//
//            System.out.println("Numbers written to " + outputFileName);
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//        }
        // 5-6
        String inputFileName = "C:\\Users\\pc\\Documents\\input.txt";

        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());

                    if (number < 0) {
                        negativeCount++;
                    } else if (number == 0) {
                        zeroCount++;
                    } else {
                        positiveCount++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number in file: " + line);
                }
            }

            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Zeroes: " + zeroCount);
            System.out.println("Positive numbers: " + positiveCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        try {
            Path filePath = Paths.get(inputFileName);
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("\nFile Information:");
            System.out.println("File name: " + filePath.getFileName());
            System.out.println("File size: " + attr.size() + " bytes");
            System.out.println("Creation time: " + attr.creationTime());
            System.out.println("Last modified time: " + attr.lastModifiedTime());
            System.out.println("Is directory: " + attr.isDirectory());
            System.out.println("Is regular file: " + attr.isRegularFile());
        } catch (IOException e) {
            System.out.println("Error retrieving file information: " + e.getMessage());
        }
    }
}
