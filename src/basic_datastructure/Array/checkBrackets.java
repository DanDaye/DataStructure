package basic_datastructure.Array;

import java.util.Stack;

public class checkBrackets {
    public boolean check(String input){
        Stack<Character> s = new Stack<Character>();
        for (int i = 0;i<input.length();i++){
            if (input.charAt(i) =='(')
                s.push(input.charAt(i));
            else if (input.charAt(i) ==')')
                s.pop();
        }
        if (s.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args){
        String s = "(())()(())(";
        System.out.println(new checkBrackets().check(s));
    }
}
