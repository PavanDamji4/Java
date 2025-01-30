import java.util.Scanner;

public class JC_19_While_loop {
    public static void main(String[] args) {
        //This program is about while loop

        System.out.println("Take number from user and print table of that number");
        int n;
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number !");
        n=sc.nextInt();
        // Starting the while loop to print the table
        while (i <= 10) { // The loop will run while 'i' is less than or equal to 10
            // Printing the multiplication table for the given number
            System.out.println(n + " * " + i + " = " + n * i);
            i++; // Incrementing 'i' after each iteration
        }
    }
}
