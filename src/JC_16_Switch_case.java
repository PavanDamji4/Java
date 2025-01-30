import java.util.*;

public class JC_16_Switch_case {
    public static void main(String[] args) {
        //This Program is about Switch case

        System.out.println("Take input from user between 1 to 7 and display the day name as per the number. For example, 1= sunday, 2= Monday....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 !");
        int n=sc.nextInt();

        switch (n) //In switch case variable can be int, string, char;
        {
            case 1:
                System.out.println("Sunday!");
                break;
            case 2:
                System.out.println("Monday!");
                break;
            case 3:
                System.out.println("Tuesday!");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number! Please enter number between 1 to 7");
                break;
        }
    }
}
