import java.util.*;
import java.util.Random; // Importing the Random class to generate random numbers

public class JC_18_RockPaperScissor {
    public static void main(String[] args) {
        // This Program simulates a Rock, Paper, Scissors game between the user and the computer

        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take user input
        Random r = new Random(); // Creating a Random object to generate computer's choice

        // Displaying game rules and choices to the user
        System.out.println("The Game notes := \n 1 = Rock \n 2 = Paper \n 3 = Scissor \n You have to choose one of it!");
        System.out.println("Enter Your Choice!"); // Prompting the user to enter their choice
        int uc = sc.nextInt(); // Taking user input and storing it in the variable `uc` (user choice)

        int cc = r.nextInt( 3)+1; // Generating a random number between 0 and 3 for the computer's choice

        // Displaying the computer's choice
        System.out.println("computer choice = " + cc);

        // Checking who won based on the game's rules
        // If user chooses Rock (1) and computer chooses Paper (2), or
        // user chooses Paper (2) and computer chooses Scissors (3), or
        // user chooses Scissors (3) and computer chooses Rock (1), then the computer wins
        if (uc == 1 && cc == 2 || uc == 2 && cc == 3 || uc == 3 && cc == 1) {
            System.out.println("Compurter Won!");
        }
        // This condition checks if both user and computer entered invalid choices (greater than 3)
        else if (uc > 3) {
            System.out.println("Enter valid number!");
        }
        // If none of the above conditions are true, then the user wins
        else {
            System.out.println("You won!");
        }

    }
}
