package Sample;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread15 {

    public static void main(final String[] arguments) throws InterruptedException{
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(new Task());
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
        pool.shutdown();
    }
    static class Task implements Runnable{
        @Override
        public void run() {
            try {
                Long duration = (long)(Math.random()*5);
                System.out.println("Runninng Task!");
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task Completed");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
