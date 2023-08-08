package insuranceManagementSystem;

class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        // Calculate price for enterprise customer
        double price = insurance.getFee() * 1.2; // Apply 20% markup
        insurance.setFee();

        // Add insurance to user's insurance list
        getInsuranceList().add(insurance);
    }
}
