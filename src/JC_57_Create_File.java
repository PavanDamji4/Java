import java.io.File; // Importing File class for file operations

public class JC_57_Create_File {
    public static void main(String[] args) {
        try {
            File f = new File("DemoFile"); // Creating a File object with the name "DemoFile"
            f.createNewFile(); // Creates the file if it does not exist
           // f.delete(); --> To delete a file
        } catch (Exception e) { // Handling exceptions (e.g., permission issues, disk errors)
            System.out.println(e);
        }
    }
}
