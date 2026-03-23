import java.util.ArrayList;
import java.util.Scanner;

public class MytaskDaraleap {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> results = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");

            // 👉 Add YOUR features below (teacher will see your part clearly)
            System.out.println("4. View Test Results");
            System.out.println("5. Typing Test");
            System.out.println("6. About Us");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\n[Redirecting to Login...]\n");
                    break;
                case "2":
                    System.out.println("\n[Opening Registration...]\n");
                    break;
                case "3":
                    System.out.println("\nGoodbye!");
                    running = false;
                    break;

                // ==========================
                // YOUR TASKS START HERE
                // ==========================

                case "4":
                    viewResults();
                    break;
                case "5":
                    typingTest();
                    break;
                case "6":
                    aboutUs();
                    break;

                default:
                    System.out.println("\nInvalid choice!\n");
            }
        }
        scanner.close();
    }

    // ==========================
    // 1. LIST OF TEST RESULTS
    // ==========================
    public static void viewResults() {
        System.out.println("\n--- List of Test Results ---");

        if (results.isEmpty()) {
            System.out.println("No test results available.");
        } else {
            for (int i = 0; i < results.size(); i++) {
                System.out.println("Test " + (i + 1) + ": " + results.get(i) + " WPM");
            }
        }

        System.out.println();
    }

    // ==========================
    // 2. TYPING TEST SCREEN
    // ==========================
    public static void typingTest() {
        String text = "The quick brown fox jumps over the lazy dog";

        System.out.println("\n--- Typing Test ---");
        System.out.println("Type this sentence:");
        System.out.println(text);
        System.out.println();

        long startTime = System.currentTimeMillis();

        String userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis();
        long timeTaken = (endTime - startTime) / 1000;

        if (userInput.equals(text)) {
            int speed = (text.length() / 5) * 60 / (int)Math.max(timeTaken,1);

            System.out.println("Correct!");
            System.out.println("Time: " + timeTaken + " seconds");
            System.out.println("Speed: " + speed + " WPM");

            results.add(speed); // save result
        } else {
            System.out.println("Incorrect typing. Try again.");
        }

        System.out.println();
    }

    // ==========================
    // 3. ABOUT US SCREEN
    // ==========================
    public static void aboutUs() {
        System.out.println("\n--- About Us ---");
        System.out.println("Project: I3 Typing Master v2026");
        System.out.println("Student: Vutha DaraLeap");
        System.out.println("This program helps improve typing speed.");
        System.out.println();
    }
}