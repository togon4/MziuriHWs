package HW31;

public class Engine {
    private String fuelType;
    private int numCylinders;
    private double displacement;

    public Engine(String fuelType, int numCylinders, double displacement) {
        this.fuelType = fuelType;
        this.numCylinders = numCylinders;
        this.displacement = displacement;
    }
    public double getDisplacement() {
        return displacement;
    }

    @Override
    public String toString() {
        return fuelType + ", " + numCylinders + " cylinders, " + displacement + "L";
    }
}
