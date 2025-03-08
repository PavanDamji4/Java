//showing the use of super keyword in java
class abc
{
    int a=23;
}
class xyz extends abc
{
    int a=45;
    void display()
    {
        System.out.println("The value of a in super class "+super.a);//prints the value of a from super class
        System.out.println("The value of a in sub class "+ a);//prints the value of a from sub class
    }
}
public class JC_36_Super {
    public static void main(String[] args) {
        xyz m= new xyz();
        m.display();
    }
}
