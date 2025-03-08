public class JC_50_throws  extends Exception{
    void checkage(int a) throws Exception{ //--> This indicates that the checkage is going to throw and exception we are sure

        if(a<18)
        {
            throw new Exception("Invalid age for voting");
        }
        else {
            System.out.println("Valid age for voting");
        }

    }
    public static void main(String[] args) {
        JC_50_throws ts=new JC_50_throws();
        try
        {
            ts.checkage(15);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
