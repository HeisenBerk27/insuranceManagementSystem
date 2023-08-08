package insuranceManagementSystem;

import java.util.Scanner;

public class UserInputReader {
    private Scanner scanner;

    public UserInputReader() {
        scanner = new Scanner(System.in);
    }

    public String readEmail() {
        System.out.print("Enter email: ");
        return scanner.nextLine();
    }

    public String readPassword() {
        System.out.print("Enter password: ");
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
