package HW1;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("Tbilisi", 1000000, 13000);
        City city2 = new City("Qutaisi", 300000, 400);
        City city3 = new City("Telavi", 200000, 300);

        City[] cities = {city1, city2, city3};

        Country country = new Country("CountryX", city1, cities);

        System.out.println(country);
        System.out.println("Total Population: " + country.calculateTotalPopulation());
        System.out.println("Total Area: " + country.calculateTotalArea());
    }
}
