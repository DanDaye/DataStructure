package basic_datastructure.Array;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class queueBinary {

    public Queue<Integer> toBinary(int n){
        Queue<Integer> result = new ArrayDeque<>();
        Queue<Integer> tmp = new ArrayDeque<>();
        while (n!=0){
            int t = n%2;
            n = n/2;
            while (!result.isEmpty()){
                tmp.add(result.remove());
            }
            result.add(t);
            while (!tmp.isEmpty()){
                result.add(tmp.remove());
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> r = new queueBinary().toBinary(n);
        while (!r.isEmpty()){
            System.out.println(r.remove());
        }
    }

}
