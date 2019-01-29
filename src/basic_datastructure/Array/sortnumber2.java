package basic_datastructure.Array;

public class sortnumber2 {

    public void Reorder(int[] nums,int start,int end){
        if (start>=end){
            return;
        }
        int middle = start+(end-start)/2;
        this.Reorder(nums,start,middle);
        this.Reorder(nums,middle+1,end);
        this.Merge(nums,start,middle,end);
    }
    public void Merge(int[] nums,int start,int middle,int end){
        int i = start;
        while (nums[i]<0 && i<=end) i++;
        int j = end;
        while (nums[j] >=0 && j>=start) j--;


    }
    public static void main(String[] args){
        int[] nums = new int[]{-1,2,-2,3,5,-4};
    }
}
