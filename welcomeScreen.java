import java.util.Scanner;

public class welcomeScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display the menu
            System.out.println("----------- Welcome to I3 Typing Master v2026 -----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("  1. Login");
            System.out.println("  2. Register");
            System.out.println("  3. Exit");
            System.out.print("Choose an option: ");

            // Read user input
            String choice = scanner.nextLine();

            // Handle logic based on selection
            switch (choice) {
                case "1":
                    System.out.println("\n[Redirecting to Login...]\n");
                    // Add login logic here
                    break;
                case "2":
                    System.out.println("\n[Creating New Account...]\n");
                    // Add registration logic here
                    break;
                case "3":
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid selection. Please try again.\n");
                    break;
            }
        }
        scanner.close();
    }
}