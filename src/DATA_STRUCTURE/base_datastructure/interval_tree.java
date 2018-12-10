package DATA_STRUCTURE.base_datastructure;

public class interval_tree {

    public Interval_Tree INTERVAL_SEARCH(Interval_Tree root,int i){
        Interval_Tree x = root;
        while (x!=null && (x.getLow()>i || x.getHigh()< i)){
            if (x.getLeft() != null && x.getLeft().getMax() >i){
                x = x.getLeft();
            }else{
                x = x.getRight();
            }
        }
        return x;
    }
}
class Interval_Tree{
    private int low;
    private int max;
    private int high;
    private Interval_Tree left;
    private Interval_Tree right;
    private Interval_Tree parent;
    Interval_Tree(){

    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public int getMax() {
        return max;
    }

    public Interval_Tree getLeft() {
        return left;
    }

    public Interval_Tree getParent() {
        return parent;
    }

    public Interval_Tree getRight() {
        return right;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setRight(Interval_Tree right) {
        this.right = right;
    }

    public void setParent(Interval_Tree parent) {
        this.parent = parent;
    }

    public void setLeft(Interval_Tree left) {
        this.left = left;
    }
}