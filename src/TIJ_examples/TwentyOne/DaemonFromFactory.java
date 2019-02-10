package TIJ_examples.TwentyOne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static TIJ_examples.net.mindview.util.Print.print;

public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread());
            }
        }catch (InterruptedException e){
            print("Interrupted");
        }
    }
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());

    }
}
