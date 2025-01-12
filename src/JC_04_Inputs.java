import java.util.Scanner;

public class JC_04_Inputs
{
    public static void main(String[] args) {
        System.out.println("This is about taking input from the user!");

        Scanner s = new Scanner(System.in); //This is the declaration of scanner class and making an object as "s"

        int age;
        System.out.println("Enter Your Age please");
        age=s.nextInt();

        System.out.println("Your age is "+age);

    }
}
