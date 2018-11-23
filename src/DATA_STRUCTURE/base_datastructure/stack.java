package DATA_STRUCTURE.base_datastructure;

import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
