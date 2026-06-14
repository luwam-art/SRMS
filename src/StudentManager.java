import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Search student
    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update student
    public boolean updateStudent(int id, String name,
                                 String department, double gpa) {

        Student s = searchStudent(id);

        if (s != null) {
            s.setName(name);
            s.setDepartment(department);
            s.setGpa(gpa);
            return true;
        }

        return false;
    }

    // Delete student
    public boolean deleteStudent(int id) {

        Student s = searchStudent(id);

        if (s != null) {
            students.remove(s);
            return true;
        }

        return false;
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
  