package basic_datastructure.Array;

public class secondMin {
    public int findSecondMin(int[] array){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int a:array){
            if (a < first){
                second = first;
                first = a;
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,7,8,9};
        System.out.println(new secondMin().findSecondMin(array));
    }
}
