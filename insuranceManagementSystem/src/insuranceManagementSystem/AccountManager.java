package insuranceManagementSystem;

import java.util.ArrayList;
import java.util.TreeSet;

class AccountManager {
    private TreeSet<Account> accountSet;

    public AccountManager() {
        accountSet = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountSet.add(account);
    }

    public Account login(String email, String password) {
        for (Account account : accountSet) {
            try {
                account.login(email, password);
                return account; 
            } catch (InvalidAuthenticationException e) {
                
            }
        }
        return null; 
    }
}
