package Sample;

import com.sun.tools.internal.ws.processor.model.AsyncOperationType;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCopareTest {

    private int value;

    public AtomicIntegerCopareTest(int value){
        this.value = value;
    }

    public synchronized int increase(){
        return value++;
    }

    public static void main(String[] args){
        long start = System.currentTimeMillis();

        AtomicIntegerCopareTest test = new AtomicIntegerCopareTest(0);

        for (int i=0;i<1000000;i++){
            test.increase();
        }

        long end = System.currentTimeMillis();
        System.out.println("time elapse:"+(end-start));

        long start1 = System.currentTimeMillis();
        AtomicInteger atomic = new AtomicInteger(0);
        for (int i=0;i<1000000;i++){
            atomic.incrementAndGet();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("time elapse: "+(end1-start1));
    }
}
