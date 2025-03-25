import java.io.FileWriter;
import java.util.Scanner;

public class JC_58_Write_File {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter f = new FileWriter("Demo Write File");

            // Writing predefined text with proper line breaks
            f.write("Hello, I am writing inside a file named Demo Write File\n");
            f.write("This is the second line\n");

            // Taking input from the user
            System.out.println("Write in the File: ");
            String data = sc.nextLine();

            // Writing user input to the file
            f.write(data + "\n"); // Ensuring new input is written on a new line

            // Closing the file
            f.close();

            System.out.println("Data successfully written to the file.");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

