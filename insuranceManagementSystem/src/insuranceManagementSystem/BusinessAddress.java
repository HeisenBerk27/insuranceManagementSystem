package insuranceManagementSystem;

class BusinessAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public BusinessAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddressDetails() {
        return "Business Address: " + street + ", " + city + ", " + postalCode;
    }
}
