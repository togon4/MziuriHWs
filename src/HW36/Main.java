package HW36;
import java.util.Scanner;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
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
        // 4
//        Predicate<Integer> isPrime = new PrimeNumberPredicate();
//        System.out.println("Is 17 prime? " + isPrime.test(17));
//        System.out.println("Is 20 prime? " + isPrime.test(20));
        // 3
//        Function<String, String> stringFunction = new StringReturnFunction();
//        System.out.println(stringFunction.apply("Hello, World!"));
    }
    public static String intToString(int num) {
        return "your Number is: " + num;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
