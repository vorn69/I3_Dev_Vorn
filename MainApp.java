import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService auth = new AuthService();
        
        while (true) {
            MenuSystem.showWelcome(sc, auth);
            String choice = sc.nextLine();
            
            switch (choice) {
                case "1": 
                    System.out.print("Username: "); String u = sc.nextLine();
                    System.out.print("Password: "); String p = sc.nextLine();
                    if (auth.authenticate(u, p) != null) TypingTest.start(sc);
                    else System.out.println("Failed!");
                    break;
                case "2": MenuSystem.registerUser(sc, auth); break;
                case "3": 
                    System.out.print("Username: "); String user = sc.nextLine();
                    System.out.print("New Pass: "); String pass = sc.nextLine();
                    auth.updatePassword(user, pass);
                    break;
                case "4": AboutUs.display(); break;
                case "5": System.exit(0);
            }
        }
    }
}