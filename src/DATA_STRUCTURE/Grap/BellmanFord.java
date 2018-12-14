package DATA_STRUCTURE.Grap;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.security.cert.TrustAnchor;

public class BellmanFord {
    public final int max = Integer.MAX_VALUE;
    public int[][] weight = {
            {0,3,max,5,max},
            {max,0,6,2,max},
            {max,max,0,max,2},
            {max,1,4,0,6},
            {3,max,7,max,0}
    };
    public char[] node = {'s','t','x','y','z'};
    public int[] closet = new int[5];
    public char[] parent = new char[5];

    public void INITIALIZE_SINGLE_SOURCE(int[] closet,int s){
        for (int i=0;i<closet.length;i++){
            closet[i] = max;
        }
        closet[s] = 0;
    }

    public void RELAX(int u,int v,int weight){
        if (closet[v] > (closet[u]+weight)){
            closet[v] = closet[u]+weight;
            parent[v] = node[u];
        }

    }
    public boolean RELLMAN_FORD(char[] node,int[][] weight,int s){
        INITIALIZE_SINGLE_SOURCE(closet,s);
        for (int k=0;k<5;k++){
            for (int i=0;i<node.length;i++){
                for (int j=0;j<weight[i].length;j++){//遍历图中每一条边
                    if (weight[i][j]!=max){
                        RELAX(i,j,weight[i][j]);
                    }
                }
            }
        }
        for (int i=0;i<node.length;i++){
            for (int j=0;j<weight[i].length;j++){
                if (closet[j]>(closet[i]+weight[i][j])){ return false; }
            }
        }
        return true;
    }
    public static void main(String[] args){
        BellmanFord b = new BellmanFord();
        boolean result =b.RELLMAN_FORD(b.node,b.weight,0);
        for (int n:b.node){
            System.out.print(n+" ");
        }
        System.out.println("================");
        for (char c:b.parent){
            System.out.print(c+"' ");
        }
        System.out.print(result);
    }

}
