import java.util.Scanner;

class CustomClass
{
    int id;
    String name=new String();

    void getdata()
    {
        id=101;         ///---------
        name="Pavan";  ///--------  Declaring values inside the Custom class
    }
    void display()
    {
        System.out.println("id = "+id);
        System.out.println("Name = "+name);
    }
}
class CustomClass2
{
    int x,y;
    void getdata(int a, int b)
    {
        x=a;
        y=b;

    }
    void display()
    {
        System.out.println("Sum = "+(x+y));
    }
}
public class JC_31_CustomMethods {
    public static void main(String[] args) {
        CustomClass cm=new CustomClass();
        Scanner sc=new Scanner(System.in);

        cm.id=21;                     ///---------
        cm.name="PavanDamji";        ///--------  Declaring values outside the Custom class
        System.out.println(cm.id);
        System.out.println(cm.name);
        cm.getdata();               ///--------
        cm.display();               ///--------if we directly access the custom class with the class object it shows the values which is declared inside the class

        //Accessing the 2nd custom Class
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("");
        CustomClass2 cs=new CustomClass2();
        cs.getdata(4,4);
        cs.display();
    }
}
