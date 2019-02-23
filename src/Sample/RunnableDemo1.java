package Sample;

public class RunnableDemo1 implements Runnable {
    public Thread t;
    private String threadName;
    boolean suspend = false;

    RunnableDemo1(String name){
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+ threadName);
        try {
            for (int i = 10;i>10;i--){
                System.out.println("Thread: "+threadName+" , "+i);
                Thread.sleep(300);
                synchronized (this){
                    while (suspend){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println("Thread: " +threadName+" interrupted");
        }

        System.out.println("Thread: "+ threadName+" exiting.");
    }

    public void start(){
        System.out.println("Starting "+threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

    void suspend(){
        suspend = true;
    }

    synchronized void resume(){
        suspend = false;
        notify();
    }

    public static void main(String[] args){
        RunnableDemo1 R1 = new RunnableDemo1("Thread-1");
        R1.start();

        RunnableDemo1 R2 = new RunnableDemo1("Thread-2");
        R2.start();

        try {
            Thread.sleep(1000);
            R1.suspend();
            System.out.println("Suspending First Thread");
            Thread.sleep(1000);
            R1.resume();
            System.out.println("Resuming First Thread");

            R2.suspend();
            System.out.println("Suspending Second Thread");
            Thread.sleep(1000);
            R2.resume();
            System.out.println("Resuming Second Thread");

        }catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }

        try {
            System.out.println("Waiting for threads to finish.");
            R1.t.join();
            R2.t.join();
        }catch (InterruptedException e){
            System.out.println("main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}