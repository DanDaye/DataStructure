package B;

import java.util.Scanner;

public class counySingle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] count = new int[10];
        for(int i=0;i<10;i++){
            count[i]=0;
        }
        for(int i=0;i<N.length();i++){
            int num = N.charAt(i)-'0';
            count[num] +=1;
        }
        for(int i=0;i<10;i++){
            if(count[i]>0){
                System.out.println(i+":"+count[i]);
            }
        }

    }
}
