import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentId;
        String studentName;
        String department;
        int age;
        double percentage;

        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID  : " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department  : " + department);
        System.out.println("Age         : " + age);
        System.out.println("Percentage  : " + percentage);

        sc.close();
    }
}