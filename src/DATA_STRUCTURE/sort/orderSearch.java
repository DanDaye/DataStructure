package DATA_STRUCTURE.sort;

public class orderSearch {


    public int ORDER_SEARCH(int[] arr,int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public int  binarySearch(int[] arr,int num,int start,int end){
        if (start <= end){
            int middle =(start+end)/2;
            if (arr[middle] == num){
                return middle;
            }else if(arr[middle] > num){
                return  binarySearch(arr,num,start,middle-1);
            }else {
                return binarySearch(arr,num,middle+1,end);
            }
        }else {
            return -1;
        }

    }
}
