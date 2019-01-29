package basic_datastructure.Array;

import java.util.HashMap;
import java.util.Map;

public class noduplicate {
    private static class CountIndex{
        int count;
        int index;
        public int getCount(){
            return count;
        }

        public int getIndex(){
            return index;
        }

        public void setCount(int count){
            this.count = count;
        }

        public void setIndex(int index){
            this.index=index;
        }
    }
    public int findFirstNoduplicate(int[] array){
        Map<Object,CountIndex> map = new HashMap<>();
        int result = Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            if (map.containsKey(array[i])){
                CountIndex count = map.get(array[i]);
                count.setCount(count.getCount()+1);
                map.put(array[i],count);
            }else {
                CountIndex count = new CountIndex();
                count.setIndex(i);
                count.setCount(1);
                map.put(array[i],count);
            }
        }

        for (Object o:map.keySet()){
            if (map.get(o).getCount() == 1 && map.get(o).getIndex()<result){
                result = map.get(o).getIndex();
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,3,2,1,5,6};
        System.out.println(new noduplicate().findFirstNoduplicate(array));
    }
}
