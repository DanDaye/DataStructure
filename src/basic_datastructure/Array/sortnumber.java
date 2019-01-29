package basic_datastructure.Array;

public class sortnumber {
    public int[] sortPositive(int[] arr){
//        空间换时间，空间复杂度为O(n),时间复杂度也为O(n)
        if (arr == null){
            return arr;
        }else {
            int positive = 0;
            for (int a:arr){
                if (a>0)
                    positive++;
            }
            int positiveIndex =0;
            int impositiveIndex = positive;
            int[] result = new int[arr.length];
            for (int a:arr){
                if (a>0){
                    result[positiveIndex] = a;
                    positiveIndex ++;
                }else {
                    result[impositiveIndex]=a;
                    impositiveIndex++;
                }
            }
            return result;
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,3,-2,7,-7,8};
        int[] result = new sortnumber().sortPositive(arr);
        for (int r:result){
            System.out.print(r+" ");
        }
    }
}
