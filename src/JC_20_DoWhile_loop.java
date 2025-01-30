import java.util.Scanner;

public class JC_20_DoWhile_loop {
    public static void main(String[] args) {
        //This program is about Do while loop

        System.out.println("Write a Java program that keeps asking the user to enter a positive number. The program should display the square of the number entered. " +
                "The loop should continue until the user enters a negative number, at which point the program should terminate.");

        int n;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a positive number !");
            n=sc.nextInt();
            if (n>0)
            {
                int sq=n*n;
                System.out.println("Square of " +n+ " is "+sq);
            }
            else
            {
                System.out.println("Negative number entered! exiting program");
            }
        }
        while(n>0);
    }
}
