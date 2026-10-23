
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Priya");
        students.add("Arun");
        System.out.println("Student List: " + students);
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");
        System.out.println("Course Set: " + courses);
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Arun");
        studentMap.put(102, "Priya");
        studentMap.put(103, "Kumar");
        System.out.println("Student Map:");
        for (Map.Entry<Integer, String> entry: studentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("Arun");
        queue.offer("Priya");
        queue.offer("Kumar");
        System.out.println("Queue before processing: " + queue);
        String processed = queue.poll();
        System.out.println("Processed element: " + processed);
        System.out.println("Queue after processing: " + queue);
    }
}
