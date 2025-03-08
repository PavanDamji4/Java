//Dynamic method dispatch is same as method overidding but the difference is..overriding is compile time polymorphism and
//Dynamic method dispatch is run time polymorphism

class DMD1
{
    void display()
    {
        System.out.println("I am from Super class");
    }
}
class DMD2 extends DMD1
{
    @Override
    void display()
    {
        System.out.println("I am from sub class");
    }
}
public class JC_38_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        DMD1 d=new DMD1(); //In this we have to create object of super class and give reference to sub class to access through it
        d.display();
        d=new DMD2(); // Giving the reference to subclass
        d.display();
    }
}
