package HW1;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("CityA", 500000, 600);
        City city2 = new City("CityB", 300000, 400);
        City city3 = new City("CityC", 200000, 300);

        City[] cities = {city1, city2, city3};

        Country country = new Country("CountryX", city1, cities);

        System.out.println(country);
        System.out.println("Total Population: " + country.calculateTotalPopulation());
        System.out.println("Total Area: " + country.calculateTotalArea());
    }
}
