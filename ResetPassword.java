import java.util.Scanner;

public class ResetPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Display Header
        System.out.println("----------------- Reset Password -----------------");

        // 2. Identify the User
        System.out.print("Enter Username");
        String identity = scanner.nextLine();

        if (identity.trim().isEmpty()) {
            System.out.println("\n[Action] Cancelled. Returning to main menu...");
        } else {
            // 3. Password Entry
            System.out.print("New Password: ");
            String newPassword = scanner.nextLine();

            System.out.print("Confirm New Password: ");
            String confirmPassword = scanner.nextLine();

            // 4. Verification Logic
            System.out.println(); // Space for layout
            if (newPassword.equals(confirmPassword) && !newPassword.isEmpty()) {
                System.out.println("--------------------------------------------------");
                System.out.println("[Success] Password updated successfully for: " + identity);
            } else if (newPassword.isEmpty()) {
                System.out.println("[Error] Password cannot be empty.");
            } else {
                System.out.println("[Error] Passwords do not match. Please try again.");
            }
        }

        scanner.close();
    }
}
