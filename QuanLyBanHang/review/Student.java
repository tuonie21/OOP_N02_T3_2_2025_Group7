public class Student implements Comparable<Student> {
    private String name;
    private float gpa;

    // Constructor
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Default constructor
    public Student() {}

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for GPA
    public float getGpa() {
        return gpa;
    }

    // Implement compareTo for sorting by GPA
    @Override
    public int compareTo(Student other) {
        if (this.gpa < other.gpa) return -1;
        else if (this.gpa > other.gpa) return 1;
        else return 0;
    }

    // Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return this.gpa == other.gpa;
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}
