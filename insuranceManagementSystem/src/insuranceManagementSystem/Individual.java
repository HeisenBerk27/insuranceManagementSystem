package insuranceManagementSystem;

class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        // Calculate price for individual customer
        double price = insurance.getFee() * 1.1; // Apply 10% markup
        insurance.setFee();

        // Add insurance to user's insurance list
        getInsuranceList().add(insurance);
    }
}
