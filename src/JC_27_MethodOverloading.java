public class JC_27_MethodOverloading {
    //This program is about Method overloading in Java Programming
    //Method overloading is a Class having multiple methods of same name and same datatypes but different parameters

    void sum(int x,int y)
    {
        int sum=x+y;
        System.out.println("Sum = "+sum);
    }
    void sum(int x,int y,int z)
    {
        int sum=x+y+z;
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {

        JC_27_MethodOverloading mo =new JC_27_MethodOverloading();
        mo.sum(10,20);
        mo.sum(10,20,30);

    }
}
