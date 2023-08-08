package insuranceManagementSystem;

import java.util.ArrayList;

abstract class Account {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceList;

    public Account(User user) {
        this.authenticationStatus = AuthenticationStatus.FAIL; 
        this.user = user;
        this.insuranceList = new ArrayList<>();
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public final void showUserInfo() {
        
    }

    
    public void addInsurance(Insurance insurance) {
        insuranceList.add(insurance);
    }

    
    public void listInsurances() {
        System.out.println("Insurances for " + user.getFirstName() + " " + user.getLastName() + ":");
        for (Insurance insurance : insuranceList) {
            System.out.println("Name: " + insurance.getName() + ", Fee: " + insurance.getFee());
        }
    }
    
    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Invalid email or password.");
        }
    }
    
    public abstract void addInsurancePolicy(Insurance insurance);
    
    public static boolean isLoggedIn(Account account) {
        return account.getAuthenticationStatus() == AuthenticationStatus.SUCCESS;
    }
    
    }

