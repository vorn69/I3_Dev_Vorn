import java.util.Scanner;

public class TypeMaster {

    private static String registeredUsername = "admin";
    private static String registeredPassword = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Main menu
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("  1. Login");
            System.out.println("  2. Register");
            System.out.println("  3. Reset Password"); 
            System.out.println("  4. Exit");
            System.out.print("Choose an option: ");

            // Read user input
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("\n[Redirecting to Login...]\n");
                    handleLogin(scanner);
                    break;
                case "2":
                    System.out.println("\n[Opening Registration...]\n");
                    // Add registration logic here
                    break;
                case "3":
                    System.out.println("\n[Redirecting to Password Reset...]\n");
                    handleResetPassword(scanner);
                    break;
                case "4":
                    System.out.println("\nThank you for using I3 Typing Master. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\nError: Invalid selection. Please try again.\n");
                    break;
            }
        }
        scanner.close();
    }

    // Task 4: User login screen
    private static void handleLogin(Scanner scanner) {
        System.out.println("--- User Login ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check against our mock database
        if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
            System.out.println("Login successful! Welcome back, " + username + ".");
            // You can call your next menu or typing test logic here
        } else {
            System.out.println("Error: Invalid username or password.");
        }
        System.out.println("------------------\n");
    }

    // Task 3: User reset password screen
    private static void handleResetPassword(Scanner scanner) {
        System.out.println("--- Reset Password ---");
        System.out.print("Enter your username to reset your password: ");
        String username = scanner.nextLine();

        // Verify the user exists before allowing a reset
        if (username.equals(registeredUsername)) {
            System.out.print("Enter your new password: ");
            String newPassword = scanner.nextLine();
            System.out.print("Confirm your new password: ");
            String confirmPassword = scanner.nextLine();

            if (newPassword.equals(confirmPassword)) {
                registeredPassword = newPassword;
                System.out.println("Success! Your password has been reset. You can now login.");
            } else {
                System.out.println("Error: The passwords do not match. Please try again.");
            }
        } else {
            System.out.println("Error: Username not found in our system.");
        }
        System.out.println("----------------------\n");
    }
}