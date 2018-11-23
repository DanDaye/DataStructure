package B;

import java.util.*;


public class Main{
    public boolean itis(int a){
        if (a%2==0){
            return  false;
        }else {
            for (int i=3;i<Math.sqrt(a);i=i+2){
                if (a%i==0){
                    return  false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        if (M==1 || M==2){
            System.out.print(M);
        }
        for (int i=M+1;i<=N;i+=2){

        }

    }
}