package insuranceManagementSystem;

import java.util.ArrayList;

class AddressManager {
    
    public static void addAddressToUser(User user, Address address) {
        user.getAddresses().add(address);
    }

    
    public static void removeAddressFromUser(User user, Address address) {
        user.getAddresses().remove(address);
    }
}
