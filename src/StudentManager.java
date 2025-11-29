import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;
    private FileHandler fileHandler;
    
    public StudentManager() {
        this.students = new ArrayList<>();
        this.fileHandler = new FileHandler();
        loadStudents();
    }
    
    public void addStudent(Student student) {
        students.add(student);
        saveStudents();
        System.out.println("Student added successfully!");
    }
    
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    public void updateStudent(String id, String newName, String newGrade) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(newName);
                student.setGrade(newGrade);
                saveStudents();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    
    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
        saveStudents();
        System.out.println("Student deleted successfully!");
    }
    
    public void searchStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student not found!");
    }
    
    private void loadStudents() {
        students = fileHandler.loadStudents();
    }
    
    private void saveStudents() {
        fileHandler.saveStudents(students);
    }
}