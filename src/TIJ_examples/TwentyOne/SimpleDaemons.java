package TIJ_examples.TwentyOne;

import java.util.concurrent.TimeUnit;

import static TIJ_examples.net.mindview.util.Print.print;

public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() +" "+this);
            }
        }catch (InterruptedException e){
            System.out.println("Sleep() interrupted");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int  i = 0;i<10;i++){
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);//将后台状态全部设置为true
            daemon.start();
        }
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
