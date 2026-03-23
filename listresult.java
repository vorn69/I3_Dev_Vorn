import java.util.Scanner;

public class listresult {

    public static void main(String[] args) {

        int level = 1;
        int cpm = 60;
        int wpm = 40;
        int totalChars = 200;
        int mistakes = 8;

        displayResult(level, cpm, wpm, totalChars, mistakes);
    
        handleMenu();
    }

    public static void displayResult(int level, int cpm, int wpm, int totalChars, int mistakes) {
        System.out.println("------------- Typing Test Level " + level + "Result -------------");
        System.out.println("Speed (characters/min): " + cpm);
        System.out.println("           (words/min): " + wpm);
        System.out.println("Total input characters: " + totalChars);
        System.out.println("       Total mistakes: " + mistakes);
        System.out.println("-----------------------------------------------------");
        System.out.println("  1. Next level");
        System.out.println("  2. Logout");
    }

    public static void handleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter choice (1-2): "); // Added prompt for clarity
        
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Loading next level...");
                    // Add your next level logic here
                    break;
                case 2:
                    System.out.println("Logging out...");
                    // Add your logout logic here
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
        
        scanner.close();
    }
}
