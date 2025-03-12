package HW31;

public class Address {
    private String country;
    private String city;
    private String street;
    private String building;

    public Address(String country, String city, String street, String building) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return street + ", " + building + ", " + city + ", " + country;
    }
}
