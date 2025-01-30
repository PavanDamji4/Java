import java.util.*;
public class JC_10_String
{
    public static void main(String[] args) {
        System.out.println("This program is about Basics of String !");

        String str = "Pavan is good boy"; //1st type of declaring a String variable
        System.out.println(str);
        String s = new String(); // 2nd type of declaring a String Variable
        Scanner sc= new Scanner(System.in);
        s=sc.next(); //Only prints the 1st Word. It does not print the Words after the space.
        s=sc.nextLine(); // It prints the whole line.
        System.out.println(s);

    }
}
