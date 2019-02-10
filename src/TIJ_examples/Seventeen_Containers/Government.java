package TIJ_examples.Seventeen_Containers;

import java.util.LinkedHashSet;
import java.util.Set;

public class Government implements Generator {
    String[] foundation =("strang women lying in ponds distributiing swords is no basis for a system of"+
            " government").split(" ");
    private int index;
    public String next() {
        return foundation[index++];
    }
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<String>();
//        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}
