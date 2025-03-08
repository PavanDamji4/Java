//In this program we are going to learn some basic Thread methods
class tc1 extends Thread
{
    tc1(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Hello there!");
    }
}

class tc2 implements Runnable {
    public void run() {
        System.out.println("Hello there from thread 2!");
    }
}

public class JC_45_ThreadConstructor {
    public static void main(String[] args) {
        tc1 t1=new tc1("Pavan");
        t1.start();
        System.out.println("Thread id is "+t1.getId());
        System.out.println("Thread name is "+t1.getName());

        tc2 t2=new tc2();
        Thread t22=new Thread(t2);
        t22.start();
        System.out.println("Thread id is "+t22.getId());

    }

}
