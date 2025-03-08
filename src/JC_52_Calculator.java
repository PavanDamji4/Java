//**I have made an Basic Calculator which handles exceptions too...This got me approx 1hr to complete

import java.util.Scanner;

class divexc extends Exception{
    divexc(String str)
    {
        super(str);
    }
}
public class JC_52_Calculator {
    void add(int x,int y){System.out.println("Addition = "+(x+y));}
    void sub(int x,int y) {System.out.println("Substraction = "+(x-y));}
    void mul(int x,int y) {System.out.println("Multiplication = "+(x*y));}
    void div(int x,int y)
    {
        try {
            if (y == 0) {
                throw new divexc("'0' Cannot divide a number");
            }
            else
            {
                System.out.println("Division = "+(x/y));
            }
        }catch (divexc e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        int choice,a,b;
        boolean running=true;
        JC_52_Calculator cl=new JC_52_Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("This is an Calculator !!!!!!!");


        while (running)
        {
            System.out.println("Choose any one (e.g,. 2)");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice");
            choice=sc.nextInt();

            if (choice <=5)
            {
                switch (choice)
                {
                    case 1:
                        System.out.println("Enter 1st number");
                        a=sc.nextInt();
                        System.out.println("Enter 2nd number");
                        b=sc.nextInt();
                        cl.add(a,b);
                        break;
                    case 2:
                        System.out.println("Enter 1st number");
                        a=sc.nextInt();
                        System.out.println("Enter 2nd number");
                        b=sc.nextInt();
                        cl.sub(a,b);
                        break;
                    case 3:
                        System.out.println("Enter 1st number");
                        a=sc.nextInt();
                        System.out.println("Enter 2nd number");
                        b=sc.nextInt();
                        cl.mul(a,b);
                        break;
                    case 4:
                        System.out.println("Enter 1st number");
                        a=sc.nextInt();
                        System.out.println("Enter 2nd number");
                        b=sc.nextInt();
                        cl.div(a,b);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        running=false;
                        System.exit(0);
                }
            }else
            {
                System.out.println("Invalid Choice! Please enter correct reference");
            }
        }

    }

}
