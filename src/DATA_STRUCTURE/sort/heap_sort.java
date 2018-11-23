package DATA_STRUCTURE.sort;

public class heap_sort
{
    public void MAX_HEAPIFY(int[] num,int i,int heap_size){
        int left = 2*i+1;
        int right = 2*i+2;
        int largest =i;
        if (left < heap_size && num[left] > num[i]){
            largest = left;
        }
        if (right < heap_size && num[largest] < num[right]){
            largest = right;
        }
        if (largest !=i){
            int temp = num[i];
            num[i] = num[largest];
            num[largest] = temp;
            MAX_HEAPIFY(num,largest,heap_size);
        }

    }
    public void BUILD_MAX_HEAP(int[] num,int heap_size){
        for (int i = num.length/2;i>=0;i--){
            MAX_HEAPIFY(num,i,heap_size);
        }
    }
    public void HEAPSORT(int[] num){
        BUILD_MAX_HEAP(num,num.length);
        int heap_size = num.length;
        for (int i = num.length-1;i>0;i--){
            int temp = num[0];
            num[0] = num[i];
            num[i] = temp;
            heap_size --;
            MAX_HEAPIFY(num,0,heap_size);

        }
    }
    public int  HEAP_EXTRACT_MAX(int[]num,int heap_size){
        if (num.length <1){
            System.out.println("heap underflow");
            return -1;
        }else {
            int max = num[0];
            num[0] = num[heap_size-1];
            heap_size --;
            return max;
        }
    }
    public void HEAP_INCREASE_KEY(int[] num,int i,int key){
        if (key < num[i]){
            System.out.println("new key is smaller than current key");
        }else {
            num[i] = key;
            while (i>0 && num[i/2] < num[i]){
                int temp = num[i/2];
                num[i/2] = num[i];
                num[i] = temp;
                i = i/2;
            }
        }
    }
    public static  void  main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        heap_sort h = new heap_sort();
        h.HEAPSORT(num);
        for (int i :num){
            System.out.println(i);
        }

    }
}
