class Student {
    String name, address, section, className;
    int rollNo;
    static String college = "ABC College";
    static int rollNoCounter = 1;

    Student(String name, String address, String section, String className) {
        this.name = name;
        this.address = address;
        this.section = section;
        this.className = className;
        this.rollNo = rollNoCounter++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Section: " + section);
        System.out.println("Class: " + className);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
        System.out.println("---------------------------");
    }
}
public class student {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "City A", "A", "10th");
        Student s2 = new Student("Bob", "City B", "B", "10th");

        s1.display();
        s2.display();
    }
}
