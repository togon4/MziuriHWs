package HW31;

public class BasketballPlayer {
    private String firstName;
    private String lastName;
    private int shots;
    private int rebounds;
    private int blocks;
    private int passes;
    private int losses;

    public BasketballPlayer(String firstName, String lastName, int shots, int rebounds, int blocks, int passes, int losses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shots = shots;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.passes = passes;
        this.losses = losses;
    }
    public double getRating() {
        return (shots * 1.0) + (rebounds * 1.0) + (blocks * 2.0) + (passes * 1.5) - (losses * 2.0);
    }
    public void displayPlayer() {
        System.out.println(firstName + " " + lastName + " - Rating: " + getRating());
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

