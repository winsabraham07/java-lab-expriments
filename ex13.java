import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }
    public String toString() {
        return rollNo + " - " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Kumar"));
        students.add(new Student(101, "Arun"));
        students.add(new Student(102, "Priya"));
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students);
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
