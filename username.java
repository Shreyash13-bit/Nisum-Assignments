import java.util.regex.*;

class AuthUtil {
    public static boolean isValidEmail(String email) {
        // Regular expression to check if the email is in proper format
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    public static boolean isValidPassword(String password) {
        // Regular expression to check if the password contains letters, digits, and special characters
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$");
    }
}

public class username {
    public static void main(String[] args) {
        String email = "user@example.com";
        String password = "Pass@123";

        // Validate email and password
        if (AuthUtil.isValidEmail(email) && AuthUtil.isValidPassword(password)) {
            System.out.println("Valid credentials!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
