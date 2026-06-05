package filehandling; // Declares the package name

import java.io.File;       // Imports File class for file handling
import java.io.FileWriter; // Imports FileWriter class for writing data into files
import java.io.IOException; // Imports IOException class for handling file-related exceptions

public class copydatafromonefiletoanother { // Main class declaration

    public static void main(String[] args) { // Main method - program execution starts here

        try { // Starts try block to handle exceptions

            File file1 = new File("student1.txt"); // Creates a File object for student1.txt
            File file2 = new File("student2.txt"); // Creates a File object for student2.txt

            file1.createNewFile(); // Creates student1.txt if it does not already exist
            file2.createNewFile(); // Creates student2.txt if it does not already exist

            FileWriter fw1 = new FileWriter(file1); // Opens student1.txt for writing
            fw1.write("Data in file1"); // Writes data into student1.txt
            fw1.close(); // Closes the FileWriter to save changes and free resources

            FileWriter fw2 = new FileWriter(file2); // Opens student2.txt for writing
            fw2.write("Data in file2"); // Writes data into student2.txt
            fw2.close(); // Closes the FileWriter to save changes and free resources

            System.out.println("Data written to both files."); // Displays success message

        } catch (IOException e) { // Catches any file-related exceptions

            System.out.println("Error occurred."); // Displays error message if exception occurs

        } // End of catch block

    } // End of main method

} // End of class