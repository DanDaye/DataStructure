package basic_datastructure.Array;


import java.util.Queue;

class MyStack{
    public Queue<Integer> q1,q2;
    MyStack(){}

   public void push(int x){
        while (!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
   }

   public int pop(){
        int a = q2.peek();
        q2.remove();
        return a;
   }

   public int top(){
        return q2.peek();
   }
   public boolean empty(){
        return q2.isEmpty();
   }
}

public class QueueToStack {

}
