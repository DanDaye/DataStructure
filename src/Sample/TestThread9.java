package Sample;

import java.util.concurrent.atomic.AtomicLong;

public class TestThread9 {
    static class Counter{
        private AtomicLong c = new AtomicLong(0);
        public void increment(){
            c.getAndIncrement();
        }

        public long value(){
            return c.get();
        }
    }

    public static void main(final String[] arguments) throws InterruptedException{
        final Counter counter = new Counter();

        for (int i =0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.increment();
                }
            }).start();
        }
        Thread.sleep(6000);
        System.out.println("Final number (should be 1000): "+counter.value());
    }

}
