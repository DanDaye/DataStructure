package DATA_STRUCTURE.HighDesign_Analyze;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class dynamic_programming {
    public int max(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public int CUT_ROD(int[] p,int n){
        System.out.println(n);
        if (n==0){
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            q =max(q,p[i]+CUT_ROD(p,n-i-1));
        }
        return q;
    }

//

    public int BOTTOM_UP_CUT_ROD(int[] p,int n){
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = p[0];
        for (int i=0;i<n;i++){
            int profit = Integer.MIN_VALUE;
            for (int j=0;j<=i;j++){
                profit = max(profit,p[j]+array[i-j]);
            }
            array[i+1] = profit;
        }
        return array[n];
    }


    public static void main(String[] args){
        int[]p = new int[]{1,5,8,9,10,17,17,20,24,30};
        dynamic_programming d = new dynamic_programming();
//        System.out.println(d.CUT_ROD(p,10));

    }
}
