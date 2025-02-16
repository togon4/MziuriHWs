package HW1;

class Country {
    // 1
//    private String name;
//    private City capital;
//    private City[] cities;
//
//    public Country(String name, City capital, City[] cities) {
//        this.name = name;
//        this.capital = capital;
//        this.cities = cities;
//    }
//
//    public int calculateTotalPopulation() {
//        int totalPopulation = 0;
//        for (City city : cities) {
//            totalPopulation += city.getPopulation();
//        }
//        return totalPopulation;
//    }
//
//    public int calculateTotalArea() {
//        int totalArea = 0;
//        for (City city : cities) {
//            totalArea += city.getArea();
//        }
//        return totalArea;
//    }
//
//    @Override
//    public String toString() {
//        return "Country{name='" + name + "', capital=" + capital + "}";
//    }
    // 4
//    private String name;
//    private int population;
//    private String capital;
//    private double area;
//    private River river;
//
//    public Country(String name, int population, String capital, double area, String riverName, int riverLength) {
//        this.name = name;
//        this.population = population;
//        this.capital = capital;
//        this.area = area;
//        this.river = new River(riverName, riverLength);
//    }
//
//    public int getRiverLength() {
//        return river.getLength();
//    }
//
//    @Override
//    public String toString() {
//        return "Country{name='" + name + "', population=" + population +
//                ", capital='" + capital + "', area=" + area +
//                ", river=" + river + "}";
//    }
//
//    class River {
//        private String name;
//        private int length;
//
//        public River(String name, int length) {
//            this.name = name;
//            this.length = length;
//        }
//
//        public int getLength() {
//            return length;
//        }
//
//        @Override
//        public String toString() {
//            return "River{name='" + name + "', length=" + length + " km}";
//        }
//    }
}
