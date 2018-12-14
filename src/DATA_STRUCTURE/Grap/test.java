//package DATA_STRUCTURE.Grap;
//
//
//import java.util.*;
//
//public class test {
//    public int[][] edges;
//    public void initialGrap(int n){
//        edges = new int[n][n];
//    }
//    public void insertEdge(int u, int v,int weight){
//        edges[u][v] = weight;
//    }
//    public void deleteEdge(int u,int v){
//        edges[u][v] =0;
//    }
//    public int firstNeighbor(int i){
//        for (int j = 0;j<edges.length;j++){
//            if (edges[i][j] > 0){
//                return j;
//            }
//        }
//        return -1;
//    }
//
//    public int nextNeighbor(int i,int v){
//        for (int j=v+1;j<edges.length;j++){
//            if (edges[i][j] > 0){
//                return j;
//            }
//        }
//        return -1;
//    }
//
//    public int hasIn(int i){
//        for (int j=0;j<edges.length;j++){
//            if (edges[j][i]>0){
//                return j;
//            }
//        }
//        return -1;
//    }
//
//    public void BoardVisited(boolean[] visited,int i){
//        visited[i] = true;
//        LinkedList queue = new LinkedList();
//        queue.addLast(i);
//        while (!queue.isEmpty()){
//            int u = ((Integer)queue.removeFirst()).intValue();
//            System.out.print(u);
//            int w = firstNeighbor(u);
//            while (w!=-1){
//                if (!visited[w]){
//                    queue.addLast(w);
//                }
//                w = nextNeighbor(i,w);
//            }
//        }
//    }
//
//    public void DeepVisited(boolean[] visited,int i){
//        System.out.print(i);
//        visited[i] = true;
//        int w=firstNeighbor(i);
//        while (w!=-1){
//            if (!visited[w]){
//                DeepVisited(visited,w);
//            }
//
//            w = nextNeighbor(i,w);
//        }
//    }
//
//    public int[] getMin(int[] closer,int i){
//        closer[i] = 0;
//        LinkedList queue = new LinkedList();
//        queue.addLast(i);
//        while (!queue.isEmpty()){
//            int v = ((Integer)queue.removeFirst()).intValue();
//            System.out.println(v);
//            int w = firstNeighbor(v);
//            while (w!=-1){
//                System.out.println(w+" "+closer[w]);
//                if (closer[w] > edges[v][w]+closer[v]){
//                    closer[w] = edges[v][w]+closer[v];
//                    System.out.println("2:"+w+" "+closer[w]);
//                    queue.addLast(w);
//                }
//                w = nextNeighbor(v,w);
//            }
//        }
//        return closer;
//
//    }
//
//    public boolean topuSort(Set s){
//        boolean flag= false;
//        while (!s.isEmpty()){
//            flag = true;
//            for (Integer it:s) {
//                int w = hasIn(it);
//                if (w==-1){
//                    flag=false;
//                    int u= firstNeighbor(it);
//                    while (u!=-1){
//                        deleteEdge(it,u);
//                        u=nextNeighbor(it,u);
//                    }
//                    s.remove(it);
//                }
//            }
//            if (flag){
//                if (!s.isEmpty()){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args){
//        test t = new test();
//        t.initialGrap(9);
//        t.insertEdge(1,2,1);
//        t.insertEdge(1,3,3);
//        t.insertEdge(2,4,4);
//        t.insertEdge(2,5,5);
//        t.insertEdge(4,8,8);
//        t.insertEdge(5,8,8);
//        t.insertEdge(3,6,6);
//        t.insertEdge(3,7,7);
//        t.insertEdge(6,7,7);
////        t.BoardVisited(new boolean[9],1);
////        t.DeepVisited(new boolean[9],1);
////        int[] closer = new int[9];
////        for (int i=0;i<9;i++){
////            closer[i] = Integer.MAX_VALUE;
////        }
////        t.getMin(closer,1);
////        for (int val:closer){
////            System.out.print(val+" ");
////        }
////
//        Set<Integer> s = new TreeSet<>();
//        s.add(1);
//        s.add(2);
//        s.add(3);
//        s.add(4);
//        s.add(5);
//        s.add(6);
//        s.add(7);
//        s.add(8);
//        boolean result = t.topuSort(s);
//        System.out.print(result);
//    }
//
//
//}
