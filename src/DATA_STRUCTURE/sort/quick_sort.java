package DATA_STRUCTURE.sort;

public class quick_sort {

    public int PARTITION(int[] num,int left,int right){
        int index = left -1;
        int number = num[right];
        for (int i = left;i<right;i++){
            if (num[i] <=number){
                index +=1;
                int temp = num[index];
                num[index] = num[i];
                num[i] = temp;

            }
        }
        index +=1;
        int temp = num[index];
        num[index] = number;
        num[right] = temp;
        return  index;
    }
    public void QUICKSORT(int[] num,int left,int right){
        if (left < right){
            int middle = PARTITION(num,left,right);
            QUICKSORT(num,left,middle-1);
            QUICKSORT(num,middle+1,right);
        }
    }

    public int RANDOM_PARTITION(int[] num,int left ,int right){
        int index = (int)Math.random()*(right-left+1)+left;
        int temp = num[index];
        num[index] = num[right];
        num[right] = temp;
        return PARTITION(num,left,right);
    }

    public void RANDOM_QUICKSORT(int[] num,int left,int right){
        if (left<right){
            int middle = RANDOM_PARTITION(num,left,right);
            RANDOM_PARTITION(num,left,middle-1);
            RANDOM_PARTITION(num,middle+1,right);
        }
    }
    public static void main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        quick_sort q = new quick_sort();
        q.QUICKSORT(num,0,num.length-1);
        for (int i: num){
            System.out.println(i);
        }
    }
}
