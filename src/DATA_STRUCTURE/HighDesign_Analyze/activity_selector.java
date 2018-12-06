package DATA_STRUCTURE.HighDesign_Analyze;

import java.util.ArrayList;
import java.util.List;

public class activity_selector {

    public List<Integer> RECURSIVE_ACTIVITY_SELETOR(int[] s,int[] f,int k,int n){
        int m = k+1;
        while (m<=n && s[m]<=f[k]){
            m+=1;
        }
        if (m<=n){
            List<Integer> a = new ArrayList<>();
            a.add(m);
            List<Integer> result = RECURSIVE_ACTIVITY_SELETOR(s,f,m,n);
            if (result!=null){
                a.addAll(result);
            }
            return a;
        }
        return null;
    }

    public List<Integer> GREEDY_ACTIVITY_SELECTOR(int[]s,int[]f){
        int n = s.length;
        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        int k =1;
        for (int i=2;i<n;i++){
            if (s[i] >=f[k]){
                a1.add(i);
                k=i;
            }
        }
        return a1;
    }
    public static void main(String[] args){
        int[] s = new int[]{0,1,3,0,5,3,5,6,8,8,2,12};
        int[] f = new int[]{0,4,5,6,7,9,9,10,11,12,14,16};
        activity_selector act = new activity_selector();
        List<Integer> result = act.GREEDY_ACTIVITY_SELECTOR(s,f);
        for (Integer r:result){
            System.out.println(r);
        }

    }
}
