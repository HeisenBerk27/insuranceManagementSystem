package insuranceManagementSystem;

class HomeAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public HomeAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddressDetails() {
        return "Home Address: " + street + ", " + city + ", " + postalCode;
    }
}
