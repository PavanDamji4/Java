import java.util.*;
public class JC_13_Ifelse_RelOp
{
    //This program in about using Relational operator in If_else Statements
    public static void main(String[] args) {
        System.out.println("Check whether the person is eligible for voting or not");
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter Your age? ");
        age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("Your are eligible!");
        }
        else
        {
            System.out.println("Your are not eligible!");
        }

        //Example 2 - Checking a greater number between 2 numbers
        System.out.println("Check the greater number between 2 numbers");
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        boolean b1=(a>b);

        if (b1)
        {
            System.out.println(a+" is greater !");
        }
        else
        {
            System.out.println(b+ " is greater !");
        }

    }
}
