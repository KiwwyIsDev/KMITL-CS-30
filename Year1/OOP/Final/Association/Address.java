package Association;
public class Address {
    private String houseNo;
    private String street;
    private String city;

    public Address(String houseNo, String street, String city) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;

    }

    @Override
    public String toString() {
        return houseNo + " " + street + " " + city;
    }
}