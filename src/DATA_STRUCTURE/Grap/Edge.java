package DATA_STRUCTURE.Grap;

public class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;
    public Edge(int v,int w,double weight){
        super();
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    @Override
    public int compareTo(Edge o) {
        return 0;
    }
}
