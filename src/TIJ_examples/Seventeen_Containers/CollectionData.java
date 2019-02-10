package TIJ_examples.Seventeen_Containers;


import TIJ_examples.net.mindview.util.RandomGenerator;

import java.util.*;

public class CollectionData<T> extends ArrayList {
    public CollectionData(Generator<T> gen, int quantity) {
        for(int i = 0; i < quantity; i++)
            add(gen.next());
    }
    // A generic convenience method:
    public static <T> CollectionData<T>
    list(RandomGenerator.String gen, int quantity) {
        return new CollectionData<T>((Generator<T>) gen, quantity);
    }
}
