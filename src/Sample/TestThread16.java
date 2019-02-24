package Sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThread16 {

    public static void main(final String[] arguments){
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            executor.submit(new Task());
            System.out.println("Shutdown executor");
            executor.shutdown();
            executor.awaitTermination(5,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (!executor.isTerminated()){
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
    }
    static class Task implements Runnable{
        @Override
        public void run() {
            try {
                Long duration =(long)(Math.random()*20);
                System.out.println("Running Task!");
                TimeUnit.SECONDS.sleep(duration);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
