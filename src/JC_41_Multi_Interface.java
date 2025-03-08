                   //Polymorphism using interfaces
interface A
{
    int a=100;
    void A();
}
interface B
{
    int b=200;
    void B();
}
interface C
{
    int c=300;
    void C();
}
class all implements A,B,C
{
    public void A()
    {
        System.out.println("a = "+a);
    }
    public void B()
    {
        System.out.println("b = "+b);
    }
    public void C()
    {
        System.out.println("c = "+c);
    }
}
public class JC_41_Multi_Interface {
    public static void main(String[] args) {
//        all m=new all(); -----> Can access all methods from all interfaces and classes
//        m.A();
//        m.B();
//        m.C();

        A o=new all(); //----------> Can only access methods from Interface A
        o.A();         //----------> Correct ( not error occurs )
       // o.B();         //----------> Error occurs because B methods is not in A interface
    }
}
