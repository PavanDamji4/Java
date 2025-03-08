//This program is about learning some basic things on multi-threading concept
class Thread1 extends Thread  //Here Thread1 extends the predefined superclass i.e. Thread to perform multithreading operations
{
    public void run()
    {
        int i=1;
        while (i>0)
        {
            System.out.println("Hello, I am from Thread 1");

        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        int i=1;
        while (i>0)
        {
            System.out.println("Hello, I am from Thread 2");

        }
    }
}

public class JC_44_Threads {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();//----> Created object for both the classes
        Thread2 t2=new Thread2(); //--->

        t1.start(); //Initializing the thread class
        t2.start();
        //The output will be alternative because the processor changes classes continuously
    }
}
