import java.util.ArrayList;

public class AuthService {
    private ArrayList<User> userList = new ArrayList<>();

    public boolean addUser(String u, String p) {
        for (User user : userList) if (user.getUsername().equals(u)) return false;
        userList.add(new User(u, p));
        return true;
    }

    public User authenticate(String u, String p) {
        for (User user : userList) if (user.getUsername().equals(u) && user.getPassword().equals(p)) return user;
        return null;
    }

    public boolean updatePassword(String u, String newP) {
        for (User user : userList) {
            if (user.getUsername().equals(u)) {
                user.setPassword(newP);
                return true;
            }
        }
        return false;
    }
}