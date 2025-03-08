class tp extends Thread {
    tp(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello " + getName());
        }
    }
}

public class JC_46_Thread_Priorities {
    public static void main(String[] args) {
        tp t1 = new tp("Pavan-1 (Min Priority)");
        tp t2 = new tp("Pavan-2");
        tp t3 = new tp("Pavan (Max Priority)");
        tp t4 = new tp("Pavan-3");
        tp t5 = new tp("Pavan-4");

        //We can give the priority to the thread to be printed first or last
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}