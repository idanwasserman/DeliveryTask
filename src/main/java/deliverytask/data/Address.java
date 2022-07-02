package deliverytask.data;

public class Address {

    String street;
    String city;
    String country;
    String postcode;
    double lon;
    double lat;
    String address_line1;
    String address_line2;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postcode='" + postcode + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                ", address_line1='" + address_line1 + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                '}';
    }
}
