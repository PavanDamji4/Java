public class JC_49_throw {
    public static void main(String[] args) {
        int a=2,b=0;
        try{
            int div;
            if(b==0)
            {
                throw new ArithmeticException("0 cannot divide a number!");
            }
            else {
                div=a/b;
                System.out.println("Division = "+ div);
            }
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
