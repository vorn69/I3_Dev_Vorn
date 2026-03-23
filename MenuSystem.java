import java.util.Scanner;

public class MenuSystem {
    public static void showWelcome(Scanner sc, AuthService auth) {
        System.out.println("\n---------- Welcome to I3 Typing Master v2026 ----------");
        System.out.println("1. Login\n2. Register\n3. Reset Password\n4. About Us\n5. Exit");
        System.out.print("Choose: ");
    }

    public static void registerUser(Scanner sc, AuthService auth) {
        System.out.println("\n---------- New User Registration ----------");
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();
        if (auth.addUser(u, p)) System.out.println("Registration Successful!");
        else System.out.println("User already exists.");
    }
}