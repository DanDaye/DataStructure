package DATA_STRUCTURE.sort;

public class select_sort {
    public  void SELECT_SORT(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]< arr[i]){
                    index = j;
                }
            }
            //交换元素
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
