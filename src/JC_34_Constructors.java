import java.util.Scanner;
class sum
{
    int a,b;
    sum(int x,int y){ //This is Parameterized constructor
        a=x;
        b=y;
        System.out.println("sum = "+(a+b));
    }
}
class Inputoutput //This is Default constructor
{
    Inputoutput()
    {
        String name;
        System.out.println("Enter Your name :");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("Name = "+name);
    }
}
public class JC_34_Constructors {
    //This Program is about Constructors
    int a,b;

    public static void main(String[] args) {
       sum s=new sum(4,3); //
       Inputoutput io=new Inputoutput();//These constructors call automatically when their is object is made
    }

}
