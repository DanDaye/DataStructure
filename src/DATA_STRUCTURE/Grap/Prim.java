package DATA_STRUCTURE.Grap;

import java.util.Scanner;
class VertexWG{
    String verName;
    int weight;
    double key;
    VertexWG parent;
    VertexWG nextNode;
}

class GraphWG{
    VertexWG[] vertexWGS = new VertexWG[100];
    int verNum =0;
    int edgeNum =0;
}

class CreateWG{
    double infinity = 10.0/0.0;

    public static VertexWG getVertex(GraphWG graph,String str){
        for (int i=0;i<graph.verNum;i++){
            if (graph.vertexWGS[i].verName.equals(str)){
                return graph.vertexWGS[i];
            }
        }
        return null;
    }
    /**
     * 初始化一个无向带权图，并且每个顶点包含parent域和key域
     * @param graph 生成的图
     */
    public void initialWg(GraphWG graph){
        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入顶点数和边数：");
        graph.verNum=scan.nextInt();
        graph.edgeNum=scan.nextInt();

        System.out.println("请依次输入定点名称：");
        for(int i=0;i<graph.verNum;i++){
            VertexWG vertex=new VertexWG();
            String name=scan.next();
            vertex.verName=name;
            vertex.key=infinity;
            vertex.parent=null;
            vertex.nextNode=null;
            graph.vertexWGS[i]=vertex;
        }



        System.out.println("请依次输入图的便边：");
        for(int i=0;i<graph.edgeNum;i++){
            String preV=scan.next();
            String folV=scan.next();
            int weight=scan.nextInt();

            VertexWG v1=getVertex(graph,preV);
            if(v1==null)
                System.out.println("输入边存在图中没有的顶点！");
            VertexWG v2=new VertexWG();
            v2.verName=folV;
            v2.weight=weight;
            v2.nextNode=v1.nextNode;
            v1.nextNode=v2;

            VertexWG reV2=getVertex(graph,folV);
            if(reV2==null)
                System.out.println("输入边存在图中没有的顶点！");
            VertexWG reV1=new VertexWG();
            reV1.verName=preV;
            reV1.weight=weight;
            reV1.nextNode=reV2.nextNode;
            reV2.nextNode=reV1;
        }
    }

    public void outputWG(GraphWG graph){
        System.out.println("输出加权图的邻接链表:");
        for(int i=0;i<graph.verNum;i++){
            VertexWG vertex=graph.vertexWGS[i];
            System.out.print(vertex.verName);

            VertexWG current=vertex.nextNode;
            while(current!=null){
                System.out.print("-->"+current.verName+"("+current.weight+")");
                current=current.nextNode;
            }
            System.out.println();
        }
    }
}
public class Prim {
    int currentSize=0;
    int maxSize=0;
    VertexWG[] minHeap=new VertexWG[20];

    /**
     * 通过weight构建以EdgeNode为节点的最小堆
     * @param
     */
    public void createMinHeap(VertexWG[] verArray){
        currentSize=verArray.length;
        maxSize=minHeap.length;
        if(currentSize>=maxSize){
            maxSize*=2;
            minHeap=new VertexWG[maxSize];
        }
        for(int i=0;i<currentSize;i++)
            minHeap[i+1]=verArray[i];

        double y;
        int c;
        for(int i=currentSize/2;i>=1;i--){
            VertexWG ver=minHeap[i];
            y=ver.key;
            c=2*i;
            while(c<=currentSize){
                if(c<currentSize && minHeap[c].key>minHeap[c+1].key)
                    c++;
                if(minHeap[c].key>=y)
                    break;
                minHeap[c/2]=minHeap[c];
                c=c*2;
            }
            minHeap[c/2]=ver;
        }
    }

    /**
     * 最小堆删除两种思路，一种和前面一样，就是一直跟踪放在根节点的那个最后一个节点最终插入的位置
     * 另一种思路便是每一次完成完整的交换然后下一一层在进行同样处理
     */
    public VertexWG deleteMinHeap(){
        if(currentSize<1)
            System.out.println("堆已经为空！无法执行删除");
        VertexWG ver=minHeap[1];
        minHeap[1]=minHeap[currentSize];
        currentSize-=1;

        int c=2,j=1;
        VertexWG ver1=minHeap[currentSize+1];
        while(c<=currentSize){
            if(c<currentSize && minHeap[c].key>minHeap[c+1].key)
                c++;
            if(ver1.key<=minHeap[c].key)
                break;
            minHeap[j]=minHeap[c];
            j=c;
            c=c*2;
        }
        minHeap[j]=ver1;
        return ver;
    }

    /**
     * 从这里返回minHeap中的顶点对象
     * @param name 定点的名字
     * @return返回minHeap中的一个顶点对象
     */
    public VertexWG getHeapVertex(String name){
        for(int i=1;i<=currentSize;i++){
            if(minHeap[i].verName.equals(name))
                return minHeap[i];
        }
        return null;
    }

    /**
     * MST的Prim算法具体实现函数
     * @param graph 图
     */
    public void primSpanningTree(GraphWG graph){
        System.out.println("请输入root节点：");
        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);
        String root=scan.next();
        VertexWG verRoot=CreateWG.getVertex(graph,root);
        verRoot.key=0;

        VertexWG[] verArray=new VertexWG[graph.verNum];
        for(int i=0;i<graph.verNum;i++){
            verArray[i]=graph.vertexWGS[i];
        }
        createMinHeap(verArray);

        System.out.println("利用prim算法依次加入到MST中的顶点顺序为:");
        while(currentSize>=1){
//          需要考虑的一个问题便是minHeap中的对象和graph.vertexArray中的是否是同一个对象>>答案：不是同一个对象
//          minHeaph中的对象已经是新产生的对象了
//          这里注意一下u这个对象,u自然是minHeap中的对象
            VertexWG[] vArray=new VertexWG[currentSize];
            for(int i=0;i<currentSize;i++){
                vArray[i]=minHeap[i+1];
            }
//          这里需要注意，每次删除节点更新完key值之后，需要利用新的key值重新构建最小堆
            createMinHeap(vArray);

            VertexWG u=deleteMinHeap();
            System.out.println(">."+u.verName);
            VertexWG current=u.nextNode;
//          注意下面while循环中的两个不同的顶点对象：currentNow、current
            while(current!=null){
                VertexWG currentNow=getHeapVertex(current.verName);
                if(currentNow!=null && current.weight<currentNow.key){
                    currentNow.parent=u;
                    currentNow.key=current.weight;
                }
                current=current.nextNode;
            }
        }
    }

    public static void main(String[] args) {
        GraphWG graph=new GraphWG();
        CreateWG createWG=new CreateWG();
        createWG.initialWg(graph);
        createWG.outputWG(graph);
        Prim prim=new Prim();
        prim.primSpanningTree(graph);
    }
}
