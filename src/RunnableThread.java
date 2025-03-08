// This is the concept of
class RunnableThread1 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            System.out.println("I am in thread 1");
        }
    }
}class RunnableThread2 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            System.out.println("thread 2");
        }
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        RunnableThread1 rt1=new RunnableThread1();
        Thread t1=new Thread(rt1);
        t1.start();
        RunnableThread2 rt2=new RunnableThread2();
        Thread t2=new Thread(rt2);
        t2.start();
    }
}
