package DATA_STRUCTURE.sort;



public class bubble_sort {

    public void BUBBLE_SORT(int[] num){
        for (int i = 1;i<num.length;i++){
            for (int j = i;j>0;j--){
                if (num[j-1] > num[j]){

                    //交换元素位置
                    int temp = num[j-1];
                    num[j-1]= num[j];
                    num[j]=temp;
                }else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        bubble_sort b = new bubble_sort();
        b.BUBBLE_SORT(num);
        for (int val : num){
            System.out.println(val);
        }
    }
}
