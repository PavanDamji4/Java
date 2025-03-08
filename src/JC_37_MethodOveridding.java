//Method overriding is the concept in which the two methods from different classes in inheritance having same name,same type of argument
// same return type, same number of argument......it is only demonstrated in inheritance

class ABC
{
    void display()
    {
        System.out.println("Hello, I am from super class");
    }
}
class XYZ extends ABC
{
    @Override
    void display() //method is overridden here
    {
        System.out.println("Hello, I am from Sub class");
    }
}
public class JC_37_MethodOveridding {
    public static void main(String[] args) {
        //To print the methods, need to create different objects
        ABC a=new ABC();
        a.display();
        XYZ x=new XYZ();
        x.display();

    }
}
