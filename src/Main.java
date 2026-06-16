import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        FileHandler.createDirectories();

        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== STUDENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display Students");
            System.out.println("6. Save Files");
            System.out.println("7. Generate Report");
            System.out.println("8. Backup");
            System.out.println("9. Exit");

            System.out.print("Choose: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Department: ");
                    String dep = input.nextLine();

                    System.out.print("GPA: ");
                    double gpa = input.nextDouble();

                    manager.addStudent(
                            new Student(id, name, dep, gpa)
                    );

                    break;

                case 2:

                    System.out.print("Enter ID: ");
                    int searchId = input.nextInt();

                    Student s = manager.searchStudent(searchId);

                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int updateId = input.nextInt();
                    input.nextLine();

                    System.out.print("New Name: ");
                    String newName = input.nextLine();

                    System.out.print("New Department: ");
                    String newDep = input.nextLine();

                    System.out.print("New GPA: ");
                    double newGpa = input.nextDouble();

                    boolean updated =
                            manager.updateStudent(
                                    updateId,
                                    newName,
                                    newDep,
                                    newGpa
                            );

                    if (updated) {
                        System.out.println("Updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int deleteId = input.nextInt();

                    boolean deleted =
                            manager.deleteStudent(deleteId);

                    if (deleted) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 5:

                    manager.displayStudents();
                    break;

                case 6:

                    ArrayList<Student> list =
                            manager.getStudents();

                    FileHandler.saveToTextFile(
                            list,
                            "data/students.txt"
                    );

                    FileHandler.saveToBinaryFile(
                            list,
                            "data/students.dat"
                    );

                    FileHandler.serializeStudents(
                            list,
                            "data/students.ser"
                    );

                    FileHandler.showFileProperties(
                            "data/students.txt"
                    );

                    break;

                case 7:

                    ReportGenerator.generateReport(
                            manager.getStudents()
                    );

                    break;

                case 8:

                    BackupManager.backupFile(
                            "data/students.txt",
                            "data/backup/students_backup.txt"
                    );

                    break;

                case 9:

                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
