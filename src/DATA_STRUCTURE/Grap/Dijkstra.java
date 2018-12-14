package DATA_STRUCTURE.Grap;

public class Dijkstra {
    public static int max = Integer.MAX_VALUE;
    public int[][] graph = {
            {0,3,max,5,max},
            {max,0,6,2,max},
            {max,max,max,2,max},
            {max,1,max,max,6},
            {3,max,7,max,max}
    };
    public int[] closet={0,3,max,5,max};

    public void dijkstra(){
        for (int i=1;i<graph.length;i++){
            for (int j=1;j<graph.length;j++){
                if (graph[i][j]!=max &&(closet[j]>(closet[i]+graph[i][j]))){
                    closet[j]=closet[i]+graph[i][j];
                }
            }
        }
        for(int i:closet){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        new Dijkstra().dijkstra();
    }
}
