package DATA_STRUCTURE.sort;

public class minimum {
    public int MINIMUM(int[] num){
        int min = num[0];
        for (int i=1;i<num.length;i++){
            if (min > num[i]){
                min = num[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] num = new int[]{1,5,3,2,6,7,3};
        minimum m = new minimum();
        System.out.println(m.MINIMUM(num));
    }
}
