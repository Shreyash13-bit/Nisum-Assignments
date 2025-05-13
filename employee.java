class Nisum {
    String company = "Nisum";
    int founded = 2000;
}

class Employee extends Nisum {
    void displayInfo() {
        // Accessing parent class variables directly (without using 'super')
        System.out.println("Company: " + company);
        System.out.println("Founded: " + founded);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayInfo();
    }
}
