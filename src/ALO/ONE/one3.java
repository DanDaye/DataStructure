package ALO.ONE;

import java.util.Scanner;

public class one3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b&& b==c)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
