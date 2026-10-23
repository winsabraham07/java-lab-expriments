import java.io.*;

public class FileProcessing {
    public static void main(String[] args) {
        String fileName = "student.txt";
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Roll No: 101");
            bw.newLine();
            bw.write("Name: Arun");
            bw.newLine();
            bw.write("Department: CSE");
            bw.newLine();
            bw.write("CGPA: 8.5");
            bw.newLine();
            bw.close();
            System.out.println("Student data written successfully.");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("\nStudent Details:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
