public class Student {
    private String id;
    private String name;
    private String grade;
    
    public Student(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getGrade() { return grade; }
    public void setName(String name) { this.name = name; }
    public void setGrade(String grade) { this.grade = grade; }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
