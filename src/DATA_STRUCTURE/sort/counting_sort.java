package DATA_STRUCTURE.sort;

public class counting_sort {

    public void COUNTING_SORT(int[] num,int[] result ,int k){
        int[] c = new int[k];
        for (int i = 0;i<k;i++){
            c[i] =0;
        }
        for (int  i = 0;i<num.length;i++){
            c[num[i]] +=1;
        }
        for (int i = 1;i<k;i++){
            c[i] = c[i] +c[i-1];
        }
        for (int i = num.length-1;i>=0;i--){
            result[c[num[i]]-1] = num[i];
            c[num[i]] -=1;
        }
    }


    public static  void main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        int[] result = new int[num.length];
        counting_sort c = new counting_sort();
        c.COUNTING_SORT(num,result,8);
        for (int val:result){
            System.out.println(val);
        }
    }
}
