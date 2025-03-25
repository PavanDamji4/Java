import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class JC_59_Read_File {
    public static void main(String[] args) {
        try {
            // Creating a FileWriter object to write data to a file
            FileWriter f = new FileWriter("Read File");
            f.write("This is the content from the file named 'Read File' "); // Writing content to the file
            f.close(); // Closing FileWriter to ensure data is saved properly

            // Creating a File object to read the file
            File fr = new File("Read File");
            Scanner sc = new Scanner(fr); // Scanner object to read data from the file

            System.out.println("Reading Contents from the file named 'Read File' :- ");
            while (sc.hasNextLine()) { // Looping through each line of the file
                System.out.println(sc.nextLine()); // Printing the file content to the console
            }
            sc.close(); // Closing Scanner to release file resources
        }
        catch (Exception e) {
            System.out.println(e); // Printing any exception that occurs
        }
    }
}
