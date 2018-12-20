package DATA_STRUCTURE.sort;

public class shellSort {


    public  void SHELL_SORT(int[] arr,int count){
        for (int dk = count/2;dk>0;dk--){
            for (int i=0;i<dk;i++){
                for (int j=i+dk;j<count;j+=dk){
                    if (arr[j] < arr[j-dk]){
                        int temp = arr[j];
                        int k = j-dk;
                        while (k>=0 && arr[k]>temp){
                            arr[k+dk] = arr[k];
                            k-=dk;
                        }
                        arr[k+dk] = temp;
                    }
                }
            }
        }
    }
}
