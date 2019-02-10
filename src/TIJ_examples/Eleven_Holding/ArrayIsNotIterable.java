package TIJ_examples.Eleven_Holding;
import java.util.*;
public class ArrayIsNotIterable<T>{
    static <T> void test(Iterable<T> ib){
        for (T t:ib){
            System.out.println(t+" ");
        }
    }
    public static void main(String[] args){
        test(Arrays.asList(1,2,3));
        String[] strings = {"A","B","C"};
        test(Arrays.asList(strings));
    }
}
