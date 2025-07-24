import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("An", 3.2f));
        students.add(new Student("Binh", 3.9f));
        students.add(new Student("Cuong", 2.7f));

        // In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sắp xếp theo GPA
        Collections.sort(students);

        // In danh sách sau khi sắp xếp
        System.out.println("\nDanh sách sau khi sắp xếp theo GPA tăng dần:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Kiểm tra equals
        Student s1 = new Student("Duc", 3.2f);
        System.out.println("\nAn và Duc có cùng GPA? " + students.get(0).equals(s1));
    }
}
