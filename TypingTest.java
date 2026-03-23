import java.util.Scanner;

public class TypingTest {
    public void startTest() {
        Scanner sc = new Scanner(System.in);
        String text = "asdf jkl; asdf jkl; sad dad had lad ask all fall hall";
        System.out.println("---- Typing Test Level 1 ----");
        System.out.println("Type the following: \n" + text);
        System.out.println("(Press ENTER to end)");
        String input = sc.nextLine();
        System.out.println("Test Complete. Processing results...");
    }
}