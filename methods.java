class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    public String toString() {
        return "Student: " + name;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            return name.equals(((Student) obj).name);
        }
        return false;
    }
}
public class methods {
    public static void main(String[] args) {
        Student s1 = new Student("Shreyash");
        Student s2 = new Student("Shreyash");
        System.out.println(s1); // toString()
        System.out.println("s1 equals s2? " + s1.equals(s2)); // equals()
        System.out.println("Class of s1: " + s1.getClass().getSimpleName()); // getClass()
    }
}