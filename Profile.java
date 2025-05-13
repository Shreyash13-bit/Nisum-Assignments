class User {
    String name, email;
    int age;

    User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String toString() {
        return "User Profile:\nName: " + name + "\nAge: " + age + "\nEmail: " + email;
    }
}

public class Profile{
    public static void main(String[] args) {
        User user = new User("Shreyash Roy", 21, "shreyash@gmail.com");
        System.out.println(user);
    }
}
    

