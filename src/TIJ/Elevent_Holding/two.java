package TIJ.Elevent_Holding;

import java.util.Collection;
import java.util.HashSet;

public class two {
    public static void main(String[] args){

        //Set is abstract,so we can't do new Set()
        Collection<Integer> c = new HashSet<Integer>();
        for (int i =0;i<10;i++)
            c.add(i);
        for (Integer i:c)
            System.out.print(i+", ");
    }
}
