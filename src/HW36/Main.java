package HW36;
import java.util.Scanner;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        // 1
//        Supplier<String> passwordSupplier = () -> {
//            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//            int length = 10;
//            Random random = new Random();
//            StringBuilder password = new StringBuilder();
//
//            for (int i = 0; i < length; i++) {
//                password.append(characters.charAt(random.nextInt(characters.length())));
//            }
//            return password.toString();
//        };
//
//        System.out.println("Generated Password: " + passwordSupplier.get());
        // 2
//        Consumer<String> logMessage = log -> {
//            String logType;
//            if (log.toLowerCase().contains("error") || log.toLowerCase().contains("crash")) {
//                logType = "ERROR";
//            } else if (log.toLowerCase().contains("warning") || log.toLowerCase().contains("low")) {
//                logType = "WARNING";
//            } else {
//                logType = "INFO";
//            }
//            System.out.println(logType);
//        };
//        logMessage.accept("Database connected!");
//        logMessage.accept("Low disk space");
//        logMessage.accept("System crash");
        // 3
//        Scanner scanner = new Scanner(System.in);
//        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//        String output = reverseString.apply(input);
//        System.out.println("Output: " + output);
        // 4
//        Predicate<Integer> isPrime = num -> {
//            if (num <= 1) {
//                return false;
//            }
//            for (int i = 2; i * i <= num; i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        };
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        if (isPrime.test(number)) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
        // 5
//        Function<Integer, String> intToString = num -> "your Number is: "+num;
//        System.out.println(intToString.apply(12));
//
//        Predicate<Integer> isEven = num -> num % 2 == 0;
//        System.out.println(isEven.test(13));
//        System.out.println(isEven.test(12));
//        functional interface-ების გამოყენების გარეშე
//        int number1 = 12;
//        String result = intToString(number1);
//        System.out.println(result);
//        int number2 = 13;
//        System.out.println(isEven(number2));
//        int number3 = 12;
//        System.out.println(isEven(number3));
    }
    public static String intToString(int num) {
        return "your Number is: " + num;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
