import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // Create directory
    public static void createDirectories() {

        File folder = new File("data");

        if (!folder.exists()) {
            folder.mkdir();
        }

        System.out.println("Directory created.");
    }

    // Save text file
    public static void saveToTextFile(
            ArrayList<Student> students,
            String filename) {

        try {

            PrintWriter writer =
                    new PrintWriter(
                            new FileWriter(filename));

            for (Student s : students) {

                writer.println(
                        s.getStudentId() + "," +
                        s.getName() + "," +
                        s.getDepartment() + "," +
                        s.getGpa()
                );
            }

            writer.close();

            System.out.println(
                    "Text file saved."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error saving text file."
            );
        }
    }

    // Save binary file
    public static void saveToBinaryFile(
            ArrayList<Student> students,
            String filename) {

        try {

            DataOutputStream dos =
                    new DataOutputStream(
                            new FileOutputStream(filename));

            for (Student s : students) {

                dos.writeInt(s.getStudentId());
                dos.writeUTF(s.getName());
                dos.writeUTF(s.getDepartment());
                dos.writeDouble(s.getGpa());
            }

            dos.close();

            System.out.println(
                    "Binary file saved."
            );

        } catch (IOException e) {

            System.out.println(
                    "Binary file error."
            );
        }
    }

    // Serialization
    public static void serializeStudents(
            ArrayList<Student> students,
            String filename) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(filename));

            oos.writeObject(students);

            oos.close();

            System.out.println(
                    "Serialization complete."
            );

        } catch (IOException e) {

            System.out.println(
                    "Serialization error."
            );
        }
    }

    // File properties
    public static void showFileProperties(
            String filename) {

        File file = new File(filename);

        if (file.exists()) {

            System.out.println(
                    "File Name: "
                            + file.getName());

            System.out.println(
                    "Path: "
                            + file.getAbsolutePath());

            System.out.println(
                    "Size: "
                            + file.length());

        } else {
            

            System.out.println(
                    "File not found."
            );
        }
    }
}
