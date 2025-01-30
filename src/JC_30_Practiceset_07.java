import java.util.Scanner;

public class JC_30_Practiceset_07 {
    //This program is about the Practice set 7 of this ongoing Java Course

    //Question 1 method-----
//    void mul(int a)
//    {
//        for (int i=1;i<=10;i++)
//        {
//            System.out.println(a+" * "+i+ " = "+ a*i);
//        }
//    }

    //Question 2 Method----
//    void pattern()
//    {
//        System.out.println("Pattern => ");
//        for (int i=0;i<=5;i++)
//        {
//            for (int j=0;j<=i;j++)
//            {
//                System.out.print(" * ");
//            }
//            System.out.println("");
//        }
//    }

    //Question 3 Method-----
    void naturalno(int n){
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+i;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        JC_30_Practiceset_07 o=new JC_30_Practiceset_07();

          //Question 1
//        System.out.println("Question 1 :- Write a java method to print multiplication of number n");
//        System.out.println("Enter a number !");
//        int n=sc.nextInt();
//        o.mul(n);

        //Question 2
//        System.out.println("Question 2 :- Write a Program to Print the Patter = \n *  \n * * \n * * * \n * * * * \n * * * * *");
//        o.pattern();

        //Question 3
//        System.out.println("Question 3 :- Write a program to calculate 1st n natural numbers!");
//        System.out.println("Enter Number");
//        int n=sc.nextInt();
//        o.naturalno(n);
    }
}
