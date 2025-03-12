package Exam3;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    // 1-ა 2-გ 3-ა 4-დ 5-გ 6-ა 7-გ 8-ინკაფსულაცია - ველების და მეთოდების ერტ კლასში შეფუთვა და წვდომის შეზღუდვა, აბსტრაქცია, მემკვიდრეობითობა - კლასს აძლევს საშუალებას შეიძინოს სხვა კლასის თვისებები, პოლიმორფიზმი - მეთოდს აძლევს საშუალებას შეასრულოს სხვადასხვა დავალებები ობიექტზე დაყრდნობით. 9-დ 10-დ
    // 11- ინტერფეისი შეიცავს მხოლოდ აბსტრაქტულ მეთოდებს ხოლო აბსტრაქტული კლასი შეიძლება შეიცავდეს როგორც აბსტრაქტულ ისე არააბსტრაქტულ მეთოდებს. 12-ბ 13 - error არის სერიოზული პრობლემა რომლის გამოსწორება შეუძლებელია ხოლო exception არის შესარებით სერიოზული და შესაზლებელია გამოსწორდეს try-catch ბლოკებით.
    // 15-გ 16 - TreeSet ინახავს ელემენტებს დალაგებული თანმიმდევრობით, 17- map ინახავს key-value წყვილებს რაც გვეხმარება სწაფად ძებნაში, ხოლო მასივი ინახავს ელემენტებს თანმიმდევრობით რაც გვაძლევს საშუალებას პირდაპირ ინდექსებით ძიების საშუალებას. 18-ა 19-გ 20-დ
    public static void main(String[] args){
        // 14
//        try{
//            throw new MyException("Custom Exception");
//        }
//        catch (MyException e){
//            System.out.println("Caught Exception: " + e.getMessage());
//        }
        // 21
//        List<String> words= Arrays.asList("apple", "banana", "kiwi", "grape", "watermelon");
//        List<String> result = new ArrayList<>();
//
//        for(String word : words){
//            String uppperWord = word.toUpperCase();
//            if(uppperWord.length() >5){
//                result.add(uppperWord);
//            }
//        }
//        Collections.sort(result, Comparator.comparing(String::length));
//        for(String word : result){
//            System.out.println(word);
//        }
        // 22
//        Thread thread1 = new Thread(() -> {
//            synchronized (lock1) {
//                System.out.println("Thread 1: Locked lock1");
//                try { Thread.sleep(100); } catch (InterruptedException e) {}
//                synchronized (lock2) {
//                    System.out.println("Thread 1: Locked lock2");
//                }
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            synchronized (lock1) {
//                System.out.println("Thread 2: Locked lock1");
//                try { Thread.sleep(100); } catch (InterruptedException e) {}
//                synchronized (lock2) {
//                    System.out.println("Thread 2: Locked lock2");
//                }
//            }
//        });
//        thread1.start();
//        thread2.start();
        // 23
//        Tree tree = new Tree(1);
//
//        Node node2 = tree.root;
//        tree.addNode(node2, 2);
//        tree.addNode(node2, 3);
//
//        Node node4 = node2.children.get(0);
//        tree.addNode(node4, 4);
//         tree.printTree();

    }
}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
