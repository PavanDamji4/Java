import java.util.Scanner;

public class JC_05_Exercise
{
    public static void main(String[] args) {
        System.out.println("Example := Taking marks from the user and giving them their percentage as output");

        Scanner s= new Scanner(System.in);
        System.out.println("Enter Marks for sub1");
        int sub1 = s.nextInt();
        System.out.println("Enter Marks for sub2");
        int sub2 = s.nextInt();
        System.out.println("Enter Marks for sub3");
        int sub3 = s.nextInt();

        int total=sub1+sub2+sub3;
        double per=total/3;
        System.out.println("Total = "+total);
        System.out.println("You got " +per+ "% ");

    }
}
