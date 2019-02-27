package basic_datastructure.Array;

import java.util.ArrayDeque;
import java.util.Queue;

public class isTree {
    static int[][] map = {{0,1,1,0},{0,0,1,1},{0,0,0,1},{0,0,0,0}};
    public boolean istree(int[][] map){
        int[] d = new int[map.length];
        int[] exist = new int[map.length];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        d[0] = 1;
        int length = map.length;
        while (!queue.isEmpty()){
            int index = queue.remove();
            for (int i = 0;i<length;i++){
                if (map[index][i] == 1 && i!=index){
                    if (d[i] !=1){
                        queue.add(i);
                        d[i] = 1;
                        exist[i] = 0;
                    }else {
                        return false;
                    }
                }else {
                    continue;
                }
            }
        }
        for (int i=0;i<map.length;i++){
            if (exist[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(new isTree().istree(map));
    }
}
