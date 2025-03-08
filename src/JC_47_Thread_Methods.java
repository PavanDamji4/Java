class tm extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, from thread 1");
        }
    }
}
class tm2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, from thread 2");
        }
    }
}
public class JC_47_Thread_Methods {
    public static void main(String[] args) {
        tm t1=new tm();
        tm2 t2=new tm2();

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}