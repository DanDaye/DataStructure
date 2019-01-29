package basic_datastructure.Array;


import java.util.Stack;

public class stacksort {

    public void sortStack(Stack<Integer> s){
        Stack<Integer> tmp = new Stack<>();
        while (!s.isEmpty()){
            int node = s.pop();
            if (tmp.isEmpty() || node < tmp.peek()){
                tmp.push(node);
            }else {
                while (!tmp.isEmpty() && node > tmp.peek()){
                    int n = tmp.pop();
                    s.push(n);
                }
                tmp.push(node);
            }
        }
        while (!tmp.isEmpty()){
            int t = tmp.pop();
            s.push(t);
        }
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        new stacksort().sortStack(s);
        for (Integer i:s){
            System.out.println(i);
        }

    }
}
