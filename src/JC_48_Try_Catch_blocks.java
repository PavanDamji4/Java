public class JC_48_Try_Catch_blocks {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println("String = " + a.length());
        } catch (NullPointerException e) {
            System.out.println("a doesn't hold any string");
        }
    }
}
//--> so this is how we can control an error by using try catch block...when we use this the program doesn't terminate when the error occurs