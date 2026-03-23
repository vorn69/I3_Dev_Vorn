import java.util.Scanner;

public class TypingMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display the menu
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
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
                    System.out.println("\n[Opening Registration...]\n");
                    // Add registration logic here
                    break;
                case "3":
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
}