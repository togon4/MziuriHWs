package HW3;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
//        int[] array = {10, 20, 30, 40, 50};
//        int n = array.length;
//
//        System.out.println("Array elements are:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        try {
//            System.out.print("Enter the start index: ");
//            int startIndex = scanner.nextInt();
//
//            System.out.print("Enter the end index: ");
//            int endIndex = scanner.nextInt();
//
//            if (startIndex < 0 || startIndex >= n || endIndex < 0 || endIndex >= n || startIndex > endIndex) {
//                throw new IndexOutOfBoundsException("Invalid indices! Ensure 0 <= startIndex <= endIndex < " + n);
//            }
//
//            int sum = 0;
//            for (int i = startIndex; i <= endIndex; i++) {
//                sum += array[i];
//            }
//            System.out.println("The sum of elements from index " + startIndex + " to " + endIndex + " is: " + sum);
//
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
        // 2
//        int[] array1 = {10, 20, 30, 40, 50};
//        int[] array2 = {4, 15, 0, 5, 25};
//
//        int n = array1.length;
//
//        System.out.println("Numerator Array: ");
//        for (int num : array1) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        System.out.println("Denominator Array: ");
//        for (int den : array2) {
//            System.out.print(den + " ");
//        }
//        System.out.println();
//
//        System.out.println("\nDivision Results:");
//        for (int i = 0; i < n; i++) {
//            try {
//                if (array2[i] == 0) {
//                    throw new ArithmeticException("Division by zero at index " + i);
//                }
//                double result = (double) array1[i] / array2[i];
//                System.out.printf("Index %d: %.2f\n", i, result);
//            } catch (ArithmeticException e) {
//                System.out.println("Index " + i + ": " + e.getMessage());
//            }
//        }
        // 4
//        try {
//            // User input
//            System.out.print("Enter first name: ");
//            String firstName = scanner.nextLine();
//
//            System.out.print("Enter last name: ");
//            String lastName = scanner.nextLine();
//
//            System.out.print("Enter birth year: ");
//            int birthYear = scanner.nextInt();
//
//            System.out.print("Enter birth month: ");
//            int birthMonth = scanner.nextInt();
//
//            System.out.print("Enter birth date: ");
//            int birthDate = scanner.nextInt();
//
//            scanner.nextLine(); // Consume newline
//
//            System.out.print("Enter username: ");
//            String username = scanner.nextLine();
//
//            System.out.print("Enter password: ");
//            String password = scanner.nextLine();
//
//            System.out.print("Enter personal number: ");
//            String personalNumber = scanner.nextLine();
//
//            // Create a User instance
//            User user = new User(firstName, lastName, birthYear, birthMonth, birthDate, username, password, personalNumber);
//            System.out.println("User successfully registered:");
//            System.out.println(user);
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
    }
}
