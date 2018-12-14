package DATA_STRUCTURE.Grap;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {
    private ArrayList vertexList;
    private int[][] edges;
    private int numOfEdges;

    public void AMWGraph(int n) {
        //初始化矩阵，一维数组，和边的数目
        edges=new int[n][n];
        vertexList=new ArrayList(n);
        numOfEdges=0;
    }

    public int getNumOfVertex(){
        return vertexList.size();
    }

    public Object getValueByIndex(int i){
        return vertexList.get(i);
    }

    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }

    public void insertVertex(Object vertex){
        vertexList.add(vertexList.size(),vertex);
    }

    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] =weight;
        numOfEdges ++;
    }

    public void deleteEdge(int v1,int v2){
        edges[v1][v2] =0;
        numOfEdges --;
    }

    public int getFirstNeighbor(int index){
        for (int j=0;j<vertexList.size();j++){
            if (edges[index][j] >0){
                return j;
            }
        }
        return -1;
    }

    public int getNextNeighbor(int v1,int v2){
        for (int j = v2+1;j<vertexList.size();j++){
            if (edges[v1][j]>0){
                return j;
            }
        }
        return -1;
    }

    private void depthFirstSearch(boolean[] isVisiited,int i){
        System.out.print(getValueByIndex(i)+" ");
        isVisiited[i] = true;

        int w = getFirstNeighbor(i);
        while (w!=-1){
            if (!isVisiited[w]){
                depthFirstSearch(isVisiited,w);
            }
            w = getNextNeighbor(i,w);
        }

    }

    private void broadFirstSearch(boolean[] isVisited,int i){
        int u,w;
        LinkedList queue = new LinkedList();
        System.out.print(getValueByIndex(i)+" ");
        isVisited[i] = true;
        queue.addLast(i);
        while (!queue.isEmpty()){
            u = ((Integer)queue.removeFirst()).intValue();
            w = getFirstNeighbor(u);
            while (w!=-1){
                if (!isVisited[w]){
                    isVisited[w]=true;
                    queue.addLast(w);
                }
                w = getNextNeighbor(i,w);
            }
        }
    }

}
