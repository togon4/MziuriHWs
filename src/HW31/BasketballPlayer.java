package HW31;

class BasketballPlayer {
    private String firstName;
    private String lastName;
    private int shots;
    private int rebounds;
    private int blocks;
    private int goodPasses;
    private int turnovers;

    public BasketballPlayer(String firstName, String lastName, int shots, int rebounds, int blocks, int goodPasses, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shots = shots;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.goodPasses = goodPasses;
        this.turnovers = turnovers;
    }

    public double getRating() {
        return (shots * 1) + (rebounds * 1) + (blocks * 2) + (goodPasses * 1.5) - (turnovers * 2);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " - Rating: " + getRating();
    }
}

