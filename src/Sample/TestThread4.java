package Sample;


class RunnableDemo3 implements Runnable {
    int counter;
    ThreadLocal<Integer>  threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        counter ++;
        if (threadLocal.get()!=null){
            threadLocal.set(threadLocal.get().intValue()+1);
        }else {
            threadLocal.set(0);
        }
        System.out.println("Counter: "+counter);
        System.out.println("threadLocalCounter: "+threadLocal.get());
    }
}


public class TestThread4 {

    public static void main(String[] args){
        RunnableDemo3  commonInstance = new RunnableDemo3();

        Thread t1 = new Thread(commonInstance);
        Thread t2 = new Thread(commonInstance);
        Thread t3 = new Thread(commonInstance);
        Thread t4 = new Thread(commonInstance);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch (Exception e){
            System.out.println("Interrupted");
        }
    }
}
