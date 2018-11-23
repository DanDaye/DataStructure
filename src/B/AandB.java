package B;

import java.util.Scanner;

public class AandB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = A+B;
        String result = "";
        while (D!=0){
            int temp  = D%C;
            result = temp+result;
            D = D/C;
        }
        System.out.println(result);

    }
}
