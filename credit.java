class UserDetails {
    public String name;
    public int id;
    public String email;

    private String password;
    private String creditCard;
    private double creditCardBalance;

    UserDetails(String name, int id, String email, String password, String creditCard, double balance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
        this.creditCardBalance = balance;
    }
public class credit{
    public static void main(String[] args) {
        UserDetails user = new UserDetails("Shreyash", 101, "shreyash@gmail.com", "pass123", "1234567812345678", 5000.0);

        System.out.println("User Info:");
        System.out.println("Name: " + user.name);
        System.out.println("ID: " + user.id);
        System.out.println("Email: " + user.email);
    }
    }
}

