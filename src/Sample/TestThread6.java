package Sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo1{
    private final Lock queuelock = new ReentrantLock();

    public void print(){
        queuelock.lock();
        try {
            Long duration = (long) (Math.random()*10000);
            System.out.println(Thread.currentThread().getName()+" Time Taken "+(duration/1000)+" seconds.");
            Thread.sleep(duration);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName());
            queuelock.unlock();
        }
    }
}
class ThreadDemo6 extends Thread{
    PrintDemo1 printDemo;

    ThreadDemo6(String name,PrintDemo1 printDemo){
        super(name);
        this.printDemo = printDemo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"starts printing a document");
        printDemo.print();
    }
}

public class TestThread6 {
    public static void main(String[] args){
        PrintDemo1 PD = new PrintDemo1();

        ThreadDemo6 t1 = new ThreadDemo6("Thread-1",PD);
        ThreadDemo6 t2 = new ThreadDemo6("Thread-2",PD);
        ThreadDemo6 t3 = new ThreadDemo6("Thread -3",PD);
        ThreadDemo6 t4 = new ThreadDemo6("Thread-4",PD);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
