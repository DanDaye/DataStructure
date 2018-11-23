package DATA_STRUCTURE.sort;

public class insert_sort {

    public void INSERTION_SORT(int[] num){
        for (int i=1;i<num.length;i++){
            int key = num[i];
            int j = i-1;
            while (j>=0 && num[j] > key){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        insert_sort insert = new insert_sort();
        insert.INSERTION_SORT(num);
        for (int val : num){
            System.out.println(val);
        }
    }
}
