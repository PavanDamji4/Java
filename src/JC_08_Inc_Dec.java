public class JC_08_Inc_Dec {
    public static void main(String[] args) {
        System.out.println("This Program is about practicing increment and decrement!");

        int a=2;
        int b=5;
        System.out.println("a = " +a);
        System.out.println("b = "+ b);
        System.out.println("a++ = "+a++); //This is post increment method. This method increments after the  task. Meaning - 1st it will display then increment
        System.out.println("++a = "+(++a)); //This is pre increment method. This method increments before the task. Meaning - 1st it will increment then display
        System.out.println("b-- = "+b--); //This is post decrement method. This method decrements before the task. Meaning - 1st it will display then decrement
        System.out.println("--b = "+ (--b)); //This is pre decrement method. This method decrements before the task. Meaning - 1st it will decrements then display

        char ch= 'a', ch2= 'b';
        System.out.println("ch = a and ch2 = b");
        System.out.println("char ch++ = "+ ch++); //Character can also be incremented
        System.out.println("char --ch2 = " + (--ch2)); //Character can also be decremented

    }
}
