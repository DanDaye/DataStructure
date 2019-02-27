package DATA_STRUCTURE.Grap;

import java.util.ArrayList;
import java.util.Scanner;

class Edge1{
    String to;
    Edge1 nextEdge;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Edge1(String to){
        this.to = to;
    }
}

class Vertex1{
    String from;
    int pathLength = 0;
    boolean isVisited = false;
    int indegree;
    Edge1 first;

    public Vertex1(String from){
        this.from = from;
        first = null;
        this.indegree =0;
    }

    public boolean getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean visited) {
        isVisited = visited;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    public int getPathLength() {
        return pathLength;
    }

    public void setPathLength(int pathLength) {
        this.pathLength = pathLength;
    }
}
public class Graph {

    public Vertex1[] v;
    public Edge1[] e;
    public int edgeNumber;
    public int vertexNumber;

    public void buildGraph(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入有向图的顶点数:");
        vertexNumber = sc.nextInt();
        System.out.println("请输入有向图的边数:");
        edgeNumber = sc.nextInt();

        //建立顶点数组
        v = new Vertex1[vertexNumber];
        e = new  Edge1[edgeNumber];

        System.out.println("请输入顶点名称；");
        for (int i=0;i<vertexNumber;i++){
            String name = sc.next();
            v[i] = new Vertex1(name);
        }
        for (int i = 0; i < edgeNumber; i++) {
            System.out.print("输入第" + (i + 1) + "条有向边的端点A:");
            String startVertex = sc.next();
            System.out.print("输入第" + (i + 1) + "条有向边的端点B:");
            String endVertex = sc.next();

            // 找到起止点的vertex索引值
            int vBeginIndex = findvIndex(startVertex);
            int vEndIndex = findvIndex(endVertex);

            e[i] = new Edge1(endVertex);// 由终点建立到该终点的边
            v[vEndIndex].indegree++;// 相应Vertex的入度+1

            e[i].nextEdge = v[vBeginIndex].first;// 将该边的下一条边连接到以startVertex的所有边
            v[vBeginIndex].first = e[i];// 将e作为v[startVertex]的第一条边
        }

    }

    public int getLength(){
        return v.length;
    }

    public ArrayList<Vertex1>  getAdjacentVertex(Vertex1 ver){
        int index;
        ArrayList al = new ArrayList();

        //找到指向ver的相邻节点
        for (int j =0;j<v.length;j++){
            if (v[j].first !=null){
                for (Edge1 e = v[j].first;e!=null;e=e.nextEdge){
                    if (e.to.equals(ver.from)){
                        al.add(v[j]);
                    }

                }
            }
        }
        index = findvIndex(ver.from);
        for (Edge1 e= v[index].first;e!=null;e=e.nextEdge){
            al.add(v[findvIndex(e.to)]);
        }
        return al;
    }
    private int findvIndex(String s) {
        int vIndex = -1;
        for (int j=0;j<v.length;j++){

            if (v[j].from.equals(s))
                vIndex =j;
        }
        return vIndex;
    }
}
