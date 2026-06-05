package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {

        try {
            File file1 = new File("student1.txt");
            File file2 = new File("student2.txt");

            file1.createNewFile();
            file2.createNewFile();

            FileWriter fw1 = new FileWriter(file1);
            fw1.write(" Vishwajit");
            fw1.write(" Java Full Stack");
            fw1.close();

            FileWriter fw2 = new FileWriter(file2);
            fw2.write(" Rahul");
            fw2.write(" python");
            fw2.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}