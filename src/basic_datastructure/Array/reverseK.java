package basic_datastructure.Array;

import TIJ_examples.net.mindview.util.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class reverseK {

    public void reversalQueue(Queue<Integer> queue,int k){
        Stack<Integer> stk=new Stack<>();
        Queue<Integer> tmpque = new ArrayDeque<>();

        for (int i=0;i<k;i++){
            if (queue.isEmpty()){
                return;
            }else {
                stk.push(queue.remove());
            }
        }
        while (!queue.isEmpty()){
            tmpque.add(queue.remove());
        }
        while (!stk.empty()){
            queue.add(stk.pop());
        }
        while (!tmpque.isEmpty()){
            queue.add(((ArrayDeque<Integer>) tmpque).pop());
        }
    }

    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        new reverseK().reversalQueue(queue,3);
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
