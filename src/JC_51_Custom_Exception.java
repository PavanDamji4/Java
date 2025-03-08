class Myexception extends Exception
{
    Myexception(String str)
    {
        super(str);
    }
}
public class JC_51_Custom_Exception {
    public static void main(String[] args) {

        String a = null;
        try {
            if (a == null) {
                throw new Myexception("The value null does not allowed");
            } else {
                System.out.println("String = " + a);
            }
        } catch (Myexception e) {
            System.out.println(e);
        }
    }

}
//---> This is how we can create our own exception to handle some errors
