package basic_datastructure.Array;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStack {
    public void queuestack(Queue<Integer> q){
        Queue<Integer> tmp = new ArrayDeque<>();
        while (!q.isEmpty()){
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        new QueueToStack().queuestack(q);
    }
}
