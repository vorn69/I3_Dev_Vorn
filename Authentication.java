import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Display Header
        System.out.println("------------------ Authentication ------------------");
        
        // 2. Username Input
        System.out.print("Username (left blank to cancel): ");
        String username = scanner.nextLine();

        // Logic: Check if username is blank to cancel
        if (username.trim().isEmpty()) {
            System.out.println("\n[Action] Authentication cancelled. Returning to main menu...");
        } else {
            // 3. Password Input
            System.out.print("Password: ");
            // Note: Scanner shows characters as you type. 
            // In a real terminal, System.console().readPassword() would hide them.
            String password = scanner.nextLine();

            System.out.println("\n[Success] Logged in as: " + username);
        }

        scanner.close();
    }
}