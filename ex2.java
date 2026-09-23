abstract class Employee {

    static String company = "Tech Solutions";

    public String department;
    private double salary;
    protected String designation;
    String location;

    Employee(String department, double salary,String designation, String location) {
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void displayRole();

    void displayDetails() {
        System.out.println("Company     : " + company);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("Designation : " + designation);
        System.out.println("Location    : " + location);
    }
}

class Developer extends Employee {

    Developer(String department, double salary,String designation, String location) {
        super(department, salary, designation, location);
    }

    void displayRole() {
        System.out.println("Role        : Software Developer");
    }
}

// Main class
public class ex2 {
    public static void main(String[] args) {

        // Creating Developer object
        Developer emp = new Developer(
            "Computer Science",
            50000,
            "Developer",
            "Coimbatore"
        );

        // Display employee details
        emp.displayDetails();

        // Display role
        emp.displayRole();

        // Using getter and setter
        System.out.println("Current Salary: " + emp.getSalary());

        emp.setSalary(55000);

        System.out.println("Updated Salary: " + emp.getSalary());
    }
}