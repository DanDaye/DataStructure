package Sample;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestThread5 {

    public static void main(final String[] arguments){
        System.out.println("Random Integer:" + new Random().nextInt());
        System.out.println("Seeded Random Integet:" + new Random(15).nextInt());
        System.out.println("Thread Local Random Integer: "+ ThreadLocalRandom.current().nextInt());
        final ThreadLocalRandom random = ThreadLocalRandom.current();
        random.setSeed(15);
        System.out.println("Seeded Thread Local Random Integer: "+ random.nextInt());
    }
}
