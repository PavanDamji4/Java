public class JC_26_Mehtods {

     void add(int x,int y)
    {
        int c=x+y;
        System.out.println("Sum = "+ c);
    }
    static void sub(int x,int y) {
        int c = x - y;
        System.out.println("Sub = " + c);
    }
    static float mul(float a,float b)
    {
        float mul=0f;
        mul=a*b;
        return mul;
    }
        public static void main(String[] args) {
        //This Program is about Methods in java

            JC_26_Mehtods m=new JC_26_Mehtods();
            m.add(10,20);
            sub(50,50);
            System.out.println( "Mul = "+mul(5,4));

    }
}
