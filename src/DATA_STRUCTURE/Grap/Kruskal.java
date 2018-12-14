package DATA_STRUCTURE.Grap;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Edge{
    private char u;
    private char v;
    private int weight;
    Edge(char u,char v,int weight){
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public char getU() {
        return u;
    }

    public char getV() {
        return v;
    }

    public int getWeight() {
        return weight;
    }
}

public class Kruskal {
    public char[] map = new char[]{'a','b','c','d','e','f','g','h','i'};

    public int partition(Edge[] w ,int left,int right){

        int index = left-1;
        int key = w[right].getWeight();
        for (int i=left;i<right;i++ ){
            if (w[i].getWeight() <=key){
                index ++;
                Edge temp = w[i];
                w[i] = w[index];
                w[index] = temp;

            }
        }
        index ++;
        Edge temp = w[right];
        w[right] = w[index];
        w[index] = temp;
        return index;
    }

    public void sort(Edge[] w,int left,int right){
        if (left<right){
            int middle = partition(w,left,right);
            sort(w,left,middle-1);
            sort(w,middle+1,right);
        }
    }
    List<Edge> MST_KRUSKAL(char[] t,Edge[] w){
        List<Edge> A = new ArrayList<>();
        List<HashSet> set = new ArrayList<>();
        for (int i=0;i<t.length;i++){
            HashSet sets = new HashSet();
            sets.add(t[i]-'a');
            set.add(sets);
        }
        sort(w,0,w.length-1);
        for (int i=0;i<w.length;i++){
            char u= w[i].getU();
            char v = w[i].getV();
            if (set.get(u-'a').contains(v-'a') || set.get(v-'a').contains(u-'a')){
                continue;
            }else {
                set.get(u-'a').addAll(set.get(v-'a'));
                set.set(v-'a',set.get(u-'a'));
                A.add(w[i]);
            }
        }
        return A;
    }
    public static void main(String[] args){
        //initial graph
        char[] visit = {'a','b','c','d','e','f','g','h','i'};
        Edge[] weight = { new Edge('a','b',4),
                new Edge('a','h',8),
                new Edge('h','b',11),
                new Edge('b','c',8),
                new Edge('h','i',7),
                new Edge('c','i',2),
                new Edge('c','d',7),
                new Edge('c','f',4),
                new Edge('i','g',6),
                new Edge('h','g',1),
                new Edge('d','e',9),
                new Edge('d','f',14),
                new Edge('f','g',2),
                new Edge('f','e',10)
        };
        List<Edge> result = new Kruskal().MST_KRUSKAL(visit,weight);
        for (Edge e:result){
            System.out.println(e.getV()+" "+e.getU()+" "+e.getWeight());
        }
    }
}
