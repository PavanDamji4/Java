import java.util.*;
public class JC_15_elseif {
    public static void main(String[] args) {
        //In this program we are going to learn about else if statements
        System.out.println("check the greatest number between 3 numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is the greater");
        }
        else if (b>a && b>c)
        {
            System.out.println(b+" is the greater");
        }
        else
        {
            System.out.println(c+" is the greater");
        }
    }
}
