import Maths_s.MathOperations;
public class JC_42_Custom_Package {
    public static void main(String[] args) {
        MathOperations m=new MathOperations(10,5);
        m.sum();
        m.sub();
        m.mul();
        m.div();
    }
}
//I this program we created a Package and save a program in the package then you can create
//another program access the package anywhere and at any path using import keyword