import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public int FindMin(int S,int T ,int[][] map,int N){
        int[] minWay = new int[N];
        for(int i=0;i<N;i++){
            if(map[S-1][i]>0){
                minWay[i] = map[S-1][i];
            }else{
                minWay[i] = Integer.MAX_VALUE;
            }
        }
        minWay[S-1] = 0;
        for (int i=0;i<N;i++){
            System.out.print(minWay[i]+" ");
        }
        System.out.println("========");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]>0){
                    int t = map[i][j] + minWay[i];
                    if(t < minWay[j]){
                        minWay[j] = t;
                    }
                }
            }
            for (int k=0;k<N;k++){
                System.out.print(minWay[k]+" ");
            }
            System.out.println();
        }
        return minWay[T-1];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N,M,S,T;
        N = in.nextInt();
        M = in.nextInt();
        S = in.nextInt();
        T = in.nextInt();
        int I,J,W;
        int[][] map = new int[N][N];
        for(int i=0;i<M;i++){
            I = in.nextInt();
            J = in.nextInt();
            W = in.nextInt();
            map[I-1][J-1] = W;
        }
        int t1 = new Main().FindMin(S,T,map,N);
//        int t2 =new Main().FindMin(T,S,map,N);
        System.out.println(t1);
    }
}