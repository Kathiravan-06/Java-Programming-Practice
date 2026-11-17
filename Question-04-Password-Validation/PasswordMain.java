import java.util.Scanner;
class User {
    private String name;
    private String mobile;
    private String username;
    private String password;
    User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
class UserBO {
    static void validate(User u) throws Exception {
        String password = u.getPassword();
        if (password.length() < 10 || password.length() > 20) {
            throw new Exception("Should be minimum of 10 characters and maximum of 20 characters");
        }
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*";
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (specialCharacters.indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }
        if (!hasDigit) {
            throw new Exception("Should contain at least one digit");
        }
        if (!hasSpecial) {
            throw new Exception("It should contain at least one special character");
        }
    }
}
public class PasswordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String mobile = sc.nextLine();
        String username = sc.nextLine();
        String password = sc.nextLine();
        User user = new User(name, mobile, username, password);
        try {
            UserBO.validate(user);
            System.out.println("Valid Password");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
