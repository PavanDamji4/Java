class Sum
{
    int a,b;
    void input(int x,int y)
    {
        a=x;
        b=y;
    }
}

class show extends Sum //extending the class to access the superclass members and methods
{
    void output()
    {
        int sum;
        sum=a+b;
        System.out.println("Sum = "+sum);
    }
}
public class JC_35_Inheritance {
    public static void main(String[] args) {
        show s=new show(); // Creating the object of an subclass....using subclass's object we can access the superclass members and methods
        s.input(3,5);
        s.output();
    }
}
//So this is how the inheritance works in java