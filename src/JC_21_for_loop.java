import java.util.Scanner;

public class JC_21_for_loop {
    public static void main(String[] args) {
        //This program is about for loop
        System.out.println("Write a Java program that prints the following pattern for a given number n (where n is the number of rows):\n" +
                "\n" +
                "For example, if n = 5, the output should be:\n" +
                "\n" +
                "1\n" +
                "1 2\n" +
                "1 2 3\n" +
                "1 2 3 4\n" +
                "1 2 3 4 5");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n=sc.nextInt();
        System.out.println("The Pattern is below");

        for (int i=1;i<=n;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(+j +" ");
            }
            System.out.println(" ");
        }
    }
}
