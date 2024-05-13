public class student {
    // Member variables
    private String name;
    private int age;
    private String studentId;

    // Constructor
    public student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        // Create a new student object
        student student1 = new student("John Doe", 20, "S12345");

        // Display student information
        System.out.println("Student Information:");
        student1.displayInfo();
    }
}
