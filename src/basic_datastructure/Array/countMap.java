package basic_datastructure.Array;

public class countMap {
    static int[][] map = {{0,1,1,0},{0,0,1,1},{0,0,0,1},{0,0,0,0}};
    public int count(int[][] map){
        int sum = 0;
        for (int i =0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                if (map[i][j] == 1){
                    sum ++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(new countMap().count(map));
    }
}
