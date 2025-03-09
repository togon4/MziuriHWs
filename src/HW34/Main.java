package HW34;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        System.out.println("Enter 10 integers:");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            int num = scanner.nextInt();
//            numbers.add(num);
//        }
//
//        ArrayList<Integer> cleanedList = removeDuplicates(numbers);
//        System.out.println("List without duplicates: " + cleanedList);
        // 2
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//        Character result = findFirstNonRepeatingCharacter(input);
//        if (result != null) {
//            System.out.println("The first non-repeating character is: " + result);
//        } else {
//            System.out.println("No non-repeating character found.");
//        }
        // 3
//        LinkedList<Integer> list1 = new LinkedList<>();
//        System.out.println("Enter elements of the first list (type 'done' to stop):");
//        while (scanner.hasNextInt()) {
//            list1.add(scanner.nextInt());
//        }
//        scanner.next();
//
//        LinkedList<Integer> list2 = new LinkedList<>();
//        System.out.println("Enter elements of the second list (type 'done' to stop):");
//        while (scanner.hasNextInt()) {
//            list2.add(scanner.nextInt());
//        }
//
//        LinkedList<Integer> commonList = findCommonElements(list1, list2);
//        System.out.println("Common elements: " + commonList);
        // 4
//        Map<String, Integer> lineCount = new HashMap<>();
//        System.out.println("Enter 10 lines:");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Line " + (i + 1) + ": ");
//            String line = scanner.nextLine();
//            lineCount.put(line, lineCount.getOrDefault(line, 0) + 1);
//        }
//        String mostRepeatedLine = null;
//        int maxCount = 0;
//
//        for (Map.Entry<String, Integer> entry : lineCount.entrySet()) {
//            if (entry.getValue() > maxCount) {
//                mostRepeatedLine = entry.getKey();
//                maxCount = entry.getValue();
//            }
//        }
//        System.out.println("The most repeated line is: \"" + mostRepeatedLine + "\"");
        // 5
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//
//        Map<Character, Integer> letterCount = countLetterFrequency(input);
//
//        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
        // 6
//        System.out.println("Enter words separated by spaces:");
//        String input = scanner.nextLine();
//        String[] words = input.split("\\s+");
//
//        List<List<String>> groupedAnagrams = groupAnagrams(words);
//        System.out.println("Grouped anagrams: " + groupedAnagrams);
        // 7
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//
//        int length = lengthOfLastWord(sentence);
//        System.out.println("The length of the last word is: " + length);
        // 8
//        System.out.print("Enter a Roman numeral: ");
//        String roman = scanner.nextLine().toUpperCase();
//
//        int result = romanToInt(roman);
//        System.out.println("The integer value is: " + result);
    }
        // 1
//    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
//        HashSet<Integer> set = new HashSet<>(list);
//        return new ArrayList<>(set);
//    }
    // 2
//    public static Character findFirstNonRepeatingCharacter(String str) {
//        Map<Character, Integer> charCount = new LinkedHashMap<>();
//
//        for (char c : str.toCharArray()) {
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }
    // 3
//    public static LinkedList<Integer> findCommonElements(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//        LinkedList<Integer> commonList = new LinkedList<>();
//
//        for (Integer element : list1) {
//            if (list2.contains(element) && !commonList.contains(element)) {
//                commonList.add(element);
//            }
//        }
//        return commonList;
//    }
    // 5
//    public static Map<Character, Integer> countLetterFrequency(String str) {
//        Map<Character, Integer> letterCount = new HashMap<>();
//
//        for (char c : str.toCharArray()) {
//            if (Character.isLetter(c)) {
//                c = Character.toLowerCase(c);
//                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
//            }
//        }
//
//        return letterCount;
//    }
    // 6
//    public static List<List<String>> groupAnagrams(String[] words) {
//        Map<String, List<String>> anagramGroups = new HashMap<>();
//
//        for (String word : words) {
//            char[] charArray = word.toCharArray();
//            Arrays.sort(charArray);
//            String sortedWord = new String(charArray);
//
//            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
//        }
//        return new ArrayList<>(anagramGroups.values());
//    }
    // 7
//    public static int lengthOfLastWord(String s) {
//        s = s.trim();
//        int lastSpaceIndex = s.lastIndexOf(' ');
//
//        return s.length() - lastSpaceIndex - 1;
//    }
    // 8
//    public static int romanToInt(String s) {
//        Map<Character, Integer> romanMap = new HashMap<>();
//        romanMap.put('I', 1);
//        romanMap.put('V', 5);
//        romanMap.put('X', 10);
//        romanMap.put('L', 50);
//        romanMap.put('C', 100);
//        romanMap.put('D', 500);
//        romanMap.put('M', 1000);
//        int total = 0;
//        int prevValue = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int currentValue = romanMap.get(s.charAt(i));
//            if (currentValue < prevValue) {
//                total -= currentValue;
//            } else {
//                total += currentValue;
//            }
//
//            prevValue = currentValue;
//        }
//
//        return total;
//    }
}
