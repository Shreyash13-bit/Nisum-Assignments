class Parent {
    static void showMessage() {
        System.out.println("Hello from Parent (static method)");
    }
}

class Child extends Parent {
    void display() {
        // Accessing static method from parent
        Parent.showMessage();
    }
}

public class inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
