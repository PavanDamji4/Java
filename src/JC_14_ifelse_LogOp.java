public class JC_14_ifelse_LogOp {
    public static void main(String[] args) {
        //This programming is about using logical operator in if else statement!

        int a=10,b=15;
        //Logical And
        if (a<100 && b<100)
        {
            System.out.println("Both are less than 100");
        }
        else
        {
            System.out.println("Both are greater than 100");
        }

        //Logical OR
        if (a<100 || b<100)
        {
            System.out.println("Any one of the two or both are less than 100");
        }
        else
        {
            System.out.println("Both are greater than 100");
        }

        //Logical Not
        boolean x=true;
        System.out.println(!x); //Inverts the result - if true then false
    }
}
