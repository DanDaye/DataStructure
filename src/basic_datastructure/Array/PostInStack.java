package basic_datastructure.Array;


import java.util.Stack;

public class PostInStack {

    public int count(String input){
        Stack<Integer> s = new Stack<Integer>();
        for (int i =0;i<input.length();i++){
            int i1;
            int i2;
            int i3;
            switch (input.charAt(i)){
                case '+':
                    i1 = (Integer)s.pop();
                    i2 = (Integer)s.pop();
                    i3 = i1+i2;
                    s.push(i3);
                    System.out.println(i1+" "+i2+" "+"+"+i3);
                    break;
                case '-':
                    i1 = (Integer)s.pop();
                    i2 = (Integer)s.pop();
                    i3 = i2-i1;
                    s.push(i3);
                    System.out.println(i1+" "+i2+" "+"-"+i3);
                    break;
                case '*':
                    i1 = (Integer)s.pop();
                    i2 = (Integer)s.pop();
                    i3 = i2*i1;
                    s.push(i3);
                    System.out.println(i1+" "+i2+" "+"*"+i3);
                    break;
                case '/':
                    i1 = (Integer)s.pop();
                    i2 = (Integer)s.pop();
                    i3 = i2/i1;
                    s.push(i3);
                    System.out.println(i1+" "+i2+" "+"/"+i3);
                    break;
                case ' ':
                case '@':
                    break;
                default:
                    s.push((int)input.charAt(i));
                    System.out.println(input.charAt(i));
                    break;
            }
        }
        return (Integer)s.peek();
    }

    public static void main(String[] args){
        String s = "7 4 - 3 * 1 5 + /";
        System.out.println(new PostInStack().count(s));
    }
}
