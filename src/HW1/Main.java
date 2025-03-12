package HW1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1 classes - City and Country
//        City city1 = new City("Tbilisi", 1000000, 1300);
//        City city2 = new City("Qutaisi", 300000, 400);
//        City city3 = new City("Telavi", 200000, 300);
//
//        City[] cities = {city1, city2, city3};
//
//        Country country = new Country("CountryX", city1, cities);
//
//        System.out.println(country);
//        System.out.println("Total Population: " + country.calculateTotalPopulation());
//        System.out.println("Total Area: " + country.calculateTotalArea());
        // 2 classes - Person and Doctor
//        Doctor[] doctors = {
//                new Doctor("Tato", "Lursmanashvili", 45, 20, "Cardiology", "Consultant", "City Hospital", 15),
//                new Doctor("Levan", "Gvaladze", 50, 25, "Neurology", "Head of Department", "General Hospital", 20),
//                new Doctor("Andria", "Sreseli", 60, 35, "Orthopedics", "Consultant", "Central Hospital", 30),
//                new Doctor("Nika", "Gegelia", 55, 30, "Pediatrics", "Doctor", "General Hospital", 25)
//        };
//
//        Doctor oldestDoctor = doctors[0];
//        Doctor longestServingDoctor = doctors[0];
//
//        for (Doctor doctor : doctors) {
//            if (doctor.getDoctorAge() > oldestDoctor.getDoctorAge()) {
//                oldestDoctor = doctor;
//            }
//            if (doctor.getLengthOfService() > longestServingDoctor.getLengthOfService()) {
//                longestServingDoctor = doctor;
//            }
//        }
//        System.out.println("Oldest Doctor:");
//        oldestDoctor.printInfo();
//        System.out.println("\nLongest-Serving Doctor:");
//        longestServingDoctor.printInfo();
        // 4 class Country
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of countries: ");
//        int numCountries = scanner.nextInt();
//        scanner.nextLine();
//
//        List<Country> countries = new ArrayList<>();
//
//        for (int i = 0; i < numCountries; i++) {
//            System.out.println("\nEnter details for country " + (i + 1) + ":");
//            System.out.print("Country Name: ");
//            String name = scanner.nextLine();
//            System.out.print("Population: ");
//            int population = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("Capital: ");
//            String capital = scanner.nextLine();
//            System.out.print("Area: ");
//            double area = scanner.nextDouble();
//            scanner.nextLine();
//            System.out.print("River Name: ");
//            String riverName = scanner.nextLine();
//            System.out.print("River Length (in km): ");
//            int riverLength = scanner.nextInt();
//            scanner.nextLine();
//
//            countries.add(new Country(name, population, capital, area, riverName, riverLength));
//        }
//
//        List<Country> sortedCountries = new ArrayList<>();
//
//        while (!countries.isEmpty()) {
//            Country maxCountry = countries.get(0);
//            for (Country country : countries) {
//                if (country.getRiverLength() > maxCountry.getRiverLength()) {
//                    maxCountry = country;
//                }
//            }
//            countries.remove(maxCountry);
//            sortedCountries.add(maxCountry);
//        }
//
//
//        System.out.println("\nCountries sorted by river length:");
//        for (int i = sortedCountries.size() - 1; i >= 0; i--) {
//            System.out.println(sortedCountries.get(i));
//        }
    }
}
