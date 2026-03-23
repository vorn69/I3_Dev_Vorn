import java.util.Scanner;

public class TypingMaster {
    static Scanner scanner = new Scanner(System.in);
    static String registeredUser = "";
    static String registeredPass = "";

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("1. Login\n2. Register\n3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": login(); break;
                case "2": register(); break;
                case "3": running = false; break;
                default: System.out.println("Invalid option.");
            }
        }
    }

    public static void register() {
        System.out.println("\n---------- New User Registration ----------");
        System.out.print("Input a unique username (blank to cancel): ");
        String u = scanner.nextLine();
        if (u.isEmpty()) return;

        System.out.print("Input password: ");
        String p = scanner.nextLine();
        System.out.print("Input confirm password: ");
        String cp = scanner.nextLine();

        if (p.equals(cp)) {
            registeredUser = u;
            registeredPass = p;
            System.out.println("Registration Successful!");
        } else {
            System.out.println("Passwords do not match!");
        }
    }

    public static void login() {
        System.out.println("\n---------- Authentication ----------");
        System.out.print("Username (blank to cancel): ");
        String u = scanner.nextLine();
        if (u.isEmpty()) return;

        System.out.print("Password: ");
        String p = scanner.nextLine();

        if (u.equals(registeredUser) && p.equals(registeredPass)) {
            System.out.println("Login Successful! Welcome, " + registeredUser + "!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }


}