import java.util.Scanner;

public class TypingTest {
    public static void start(Scanner sc) {
        String text = "ffff jjjj dddd kkkk";
        System.out.println("\n--- Typing Test Level 1 ---\nType this: " + text);
        long start = System.currentTimeMillis();
        String input = sc.nextLine();
        long end = System.currentTimeMillis();
        
        System.out.println("\n--- Results ---");
        System.out.println("Time: " + (end - start)/1000.0 + "s");
    }
}