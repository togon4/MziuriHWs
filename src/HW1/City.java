package HW1;

class City {
    private String name;
    private int population;
    private int area;

    public City(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', population=" + population + ", area=" + area + "}";
    }
}