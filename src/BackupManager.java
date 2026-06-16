import java.io.*;

public class BackupManager {

    public static void backupFile(String source,
                                  String destination) {

        try (
                BufferedInputStream bis =
                        new BufferedInputStream(
                                new FileInputStream(source));

                BufferedOutputStream bos =
                        new BufferedOutputStream(
                                new FileOutputStream(destination))
        ) {

            int data;

            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            System.out.println("Backup completed.");

        } catch (IOException e) {
            System.out.println("Backup failed.");
        }
    }
}
