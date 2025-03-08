abstract class shape
{
    abstract public void area();
}
class square extends shape
{
    int side=3;
    public void area()
    {
        System.out.println("Area of Square = "+side*side);
    }
}
public class JC_39_Abstract_class {
    public static void main(String[] args) {
        square s=new square();
        s.area();
    }
}
