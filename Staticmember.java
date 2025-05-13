class Demo {
    static int x = setX();  // 1st: sets value

    static {
        System.out.println("Setting up... (static block)");
    }

    static int setX() {
        System.out.println("Setting value of x");
        return 10;
    }

    static void hello() {
        System.out.println("Hello from static method!");
    }
}

public class Staticmember {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Demo.hello();
    }
}
