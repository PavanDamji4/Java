import java.util.*;
public class JC_12_Practiceset_03 {
    public static void main(String[] args) {
        //This is Practice set 03 of the java course
        Scanner sc=new Scanner(System.in);

        System.out.println("Question 1 := Write a Java program to convert a string into a lowercase?");
        String str;
        System.out.println("Enter a String in capital");
        str=sc.nextLine();
        String Temp;
        Temp=str.toLowerCase();
        System.out.println(Temp);
        System.out.println("");

        System.out.println("Question 2 := Write a Java Program to replace Space with underscore?");
        Temp= str.replace(' ', '_');
        System.out.println(Temp);
        System.out.println("");

        System.out.println("Question 3 := 'Hello <name>' replace <name> with someones Name?");
        String q3="Hello <name>";
        Temp=q3.replace("<name>", "Saurabh");
        System.out.println(Temp);
        System.out.println("");

        System.out.println("Question 4 := Write a program to detect double and triple spaces from the string");
        String q4= "This is the line having double  and triple   spaces in it";
        System.out.println(q4.indexOf("  "));
        System.out.println(q4.indexOf("   "));



    }
}
