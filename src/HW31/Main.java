package HW31;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1
//        ArrayList<BasketballPlayer> players = new ArrayList<>();
//
//        players.add(new BasketballPlayer("LeBron", "James", 10, 8, 2, 5, 3));
//        players.add(new BasketballPlayer("Stephen", "Curry", 12, 5, 1, 7, 2));
//        players.add(new BasketballPlayer("Kevin", "Durant", 9, 7, 3, 4, 1));
//        players.add(new BasketballPlayer("Giannis", "Antetokounmpo", 11, 10, 4, 3, 5));
//
//        players.sort(Comparator.comparingDouble(BasketballPlayer::getRating).reversed());
//        System.out.println("Players sorted in descending order of rating:");
//        for (BasketballPlayer player : players) {
//            System.out.println(player);
//        }
//
//        players.sort(Comparator.comparingDouble(BasketballPlayer::getRating));
//        System.out.println("\nPlayers sorted in ascending order of rating:");
//        for (BasketballPlayer player : players) {
//            System.out.println(player);
//        }
        // 2
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(new Student("nika", "qwe", new GregorianCalendar(2002, Calendar.MARCH, 15).getTime(), new ArrayList<>(Arrays.asList(3.5, 4.0, 3.8))));
//        students.add(new Student("elene", "ewq", new GregorianCalendar(2001, Calendar.JUNE, 22).getTime(), new ArrayList<>(Arrays.asList(3.2, 3.6, 3.9))));
//        students.add(new Student("mari", "asd", new GregorianCalendar(2003, Calendar.JANUARY, 5).getTime(), new ArrayList<>(Arrays.asList(3.9, 4.0, 3.7))));
//        students.add(new Student("luka", "dsa", new GregorianCalendar(2000, Calendar.DECEMBER, 10).getTime(), new ArrayList<>(Arrays.asList(3.1, 3.4, 3.2))));
//
//        System.out.println("Unsorted Students:");
//        students.forEach(System.out::println);
//
//        students.sort(Comparator.comparing(Student::getFullName));
//        System.out.println("\nStudents sorted lexically:");
//        students.forEach(System.out::println);
//
//        students.sort(Comparator.comparingDouble(Student::getGPA).reversed());
//        System.out.println("\nStudents sorted by GPA:");
//        students.forEach(System.out::println);
//
//        students.sort(Comparator.comparing(Student::getDateOfBirth));
//        System.out.println("\nStudents sorted by Date of Birth:");
//        students.forEach(System.out::println);
        // 3
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 2015, 60000, new Engine("Gasoline", 4, 1.8)));
        cars.add(new Car("Honda", "Civic", 2018, 45000, new Engine("Gasoline", 4, 2.0)));
        cars.add(new Car("Ford", "Focus", 2012, 80000, new Engine("Gasoline", 4, 1.6)));
        cars.add(new Car("BMW", "320i", 2020, 30000, new Engine("Gasoline", 4, 2.0)));

        System.out.println("Unsorted Cars:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("\nCars sorted by Year of Manufacture:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparingInt(Car::getMileage));
        System.out.println("\nCars sorted by Mileage:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparingDouble(Car::getEngineDisplacement));
        System.out.println("\nCars sorted by Engine Displacement:");
        cars.forEach(System.out::println);
    }
}
