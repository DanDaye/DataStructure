package B;

import java.util.Collections;

import java.util.Scanner;

public class Minimun {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] count = new int[10];
            int top = 10;
            String result = "";
            for(int i=0;i<10;i++){
                count[i] = sc.nextInt();
                if (i!=0 && count[i] >0 && i<top){
                    top = i;
                }
            }
            if(top!=10){
                result +=top;
            }
            for(int i = 0;i<10;i++){
                if(i!=top && count[i]!=0){
                    String temp = String.join("", Collections.nCopies(count[i],""+i));
                    result +=temp;
                }else if (count[i]!=0){
                    String temp = String.join("",Collections.nCopies(count[i]-1,""+i));
                    result +=temp;
                }else {
                    continue;
                }
            }
            if(result.length()==0 || result.charAt(0)=='0'){
                System.out.println(0);
            }else {
                System.out.println(result);
            }
        }

}
