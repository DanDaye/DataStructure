package basic_datastructure.Array;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Map {
    static int[][] map = {{0,1,1,0},{0,0,1,1},{0,0,0,1},{0,0,0,0}};
    public void DFS(int[][] map){
        int[] d = new int[4];
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
                    }
                }else {
                    continue;
                }
            }
            System.out.println(index);
        }
    }
    public void BFS(int[][] map,int index,int[] d){
        System.out.println(index);
        for (int i=0;i<map.length;i++){
            if (map[index][i] == 1 && d[i]!=1){
                d[i] =1;
                new Map().BFS(map,i,d);
            }
        }
    }
    public static void main(String[] args){
        new Map().DFS(map);
        System.out.println("==========");
        int[] d = new int[map.length];
        d[0]=1;
        new Map().BFS(map,0,d);
    }
}
