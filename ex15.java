import java.io.*;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private double cgpa;
    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
public class StudentSerialization {
    public static void main(String[] args) {
        String fileName = "student.ser";
        try {
            Student s1 = new Student(101, "Arun", 8.5);
            FileOutputStream fos =new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            System.out.println("Object serialized successfully.");
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            ois.close();
            System.out.println("Object deserialized successfully.");
            System.out.println("\nStudent Details:");
            s2.display();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
