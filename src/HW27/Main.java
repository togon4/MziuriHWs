package HW27;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    private static Random random;

    public static void main(String[] args) {
        // 1
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random random = new Random();
//        int num;
//        do {
//            num = random.nextInt(51);
//            numbers.add(num);
//        } while (num != 40);
//
//        System.out.println("Length of the list: " + numbers.size());
//        System.out.println("Elements in the list: " + numbers);
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println("List after removing even numbers: " + numbers);
        // 2
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(51);
//        }
//
//        int maxElement = array[0];
//        int maxIndex = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > maxElement) {
//                maxElement = array[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println("Array: ");
//        for (int numInArray : array) {
//            System.out.print(numInArray + " ");
//        }
//        System.out.println("\nMaximum element in the array: " + maxElement + ", at index: " + maxIndex);
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int value : array) {
//            arrayList.add(value);
//        }
//        int arrayListMaxIndex = arrayList.indexOf(maxElement);
//        System.out.println("Index of the maximum element in ArrayList: " + arrayListMaxIndex);
        // 3
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("nika", "nikolaishvili", "12345", 85.4));
        students.add(new Student("elene", "tabeshadze", "23456", 92.1));
        students.add(new Student("alex", "mindiashvili", "34567", 78.3));
        students.add(new Student("gurami", "meliqia", "45678", 89.5));
        students.add(new Student("giorgi", "wereteli", "56789", 80.7));

        Collections.sort(students, Comparator.comparingDouble(student -> student.averageScore));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
