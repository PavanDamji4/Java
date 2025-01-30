import java.util.Scanner;

public class JC_29_Recursion {
    // This Program is about Recursion meaning - a method calling itself in it..

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
            //System.out.println("Factorial of " + n + " is 1");
        } else {
            int result = n * factorial(n - 1);
            return result;
            //System.out.println("Factorial of " + n + " is " + result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number to find factorial of a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f=factorial(x);
        System.out.println("Factorial = "+f);
    }
}