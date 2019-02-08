package basic_datastructure.Array;

public class sortPositive {
    public void sort(int[] arr){
        if (arr == null) return;
        int positive = 0;
        int impositive =  arr.length-1;
        while (positive<impositive){
            while (arr[positive]>0 && positive < arr.length)
                positive++;
            while (arr[impositive]<0 && impositive>-1)
                impositive--;
            if (positive<impositive){
                int tmp = arr[positive];
                arr[positive] = arr[impositive];
                arr[impositive] = tmp;
            }
        }
    }
    public  static void main(String[] args){
        int[] a = {1,2,-1,-5,-6,7,-7,-10};
        new sortPositive().sort(a);
        for (int n:a)
            System.out.print(n+" ");
    }
}
