package DATA_STRUCTURE.sort;

public class random_select {

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

    public int RANDOM_PARTITION(int[] num,int left ,int right){
        int index = (int)Math.random()*(right-left+1)+left;
        int temp = num[index];
        num[index] = num[right];
        num[right] = temp;
        return PARTITION(num,left,right);
    }


    public int RANDOM_SELECT(int[] num,int left,int right,int select){
        if (left == right){
            return num[left];
        }
        int middle = RANDOM_PARTITION(num,left,right);
        int k = middle - left +1;
        if (k == select){
            return  num[middle];
        }else if (select <k){
            return RANDOM_SELECT(num,left,middle-1,select);
        }else {
            return RANDOM_SELECT(num,middle+1,right,select);
        }
    }
    public static void main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        random_select r = new random_select();
        int result = r.RANDOM_SELECT(num,0,6,2);
        System.out.println(result);
    }
}
