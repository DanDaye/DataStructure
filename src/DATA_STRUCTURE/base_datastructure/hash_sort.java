package DATA_STRUCTURE.base_datastructure;

import java.util.HashSet;

public class hash_sort {
    private static final int Error = -1;

    public int HASH_INSERT(int[] T, int key){
        int i = 0;
        do {
            int j = hash(key,i);
            if (T[j] == 0){
                T[j] =key;
                return j;
            }else {
                i ++;
            }
        }while (i!=10);
        return Error;
    }

    public int HASH_SEARCH(int[] T,int key){
        int i=0;
        int j;
        do {
            j= hash(key,i);
            if (T[j]==key){
                return j;
            }else {
                i++;
            }
        }while (i!=10 || T[j]!=0);
        return Error;
    }

    private int hash(int key, int i) {
        return 0;
    }

    public static void main(String[] args){
        int[] T = new int[10];

    }
}
