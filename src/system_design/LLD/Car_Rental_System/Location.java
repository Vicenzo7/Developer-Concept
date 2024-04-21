package system_design.LLD.Car_Rental_System;

public class Location {
    private String address;
    private String city;
    private String state;
    private String country;
    private long pinCode;

    public Location(long pinCode, String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
