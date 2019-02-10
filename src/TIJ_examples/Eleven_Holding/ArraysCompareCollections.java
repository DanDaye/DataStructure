package TIJ_examples.Eleven_Holding;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysCompareCollections {
    public static void main(String[] args){
        long count =100000000;
        long start = System.currentTimeMillis();
        //use Arrays.asList()
        for (int i=0;i<count;i++){
            List<String> a = new ArrayList<String>();
            a.addAll(Arrays.asList("Peaches 'n Plutonium", "Rocky Racoon"));
        }
        System.out.println(System.currentTimeMillis()-start);
        start =System.currentTimeMillis();
        for (int i=0;i<count;i++){
            List<String> a = new ArrayList<String>();
            Collections.addAll(a,"Peaches 'n Plutonium", "Rocky Racoon");
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
