//Taking an example of addition using constructor in inheritance
class input
{
    int a,b;
    input(int x,int y)
    {
        a=x;
        b=y;
    }
}
class output extends input //extending the super class
{

    output(int x,int y)
    {
        super(x,y); // to pass the value to the contructor of superclass we need to use super keyword like this....
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
}

public class JC_36_Constructor_in_Inheritance {
    public static void main(String[] args) {
        output o = new output(2, 5);
    }
}
