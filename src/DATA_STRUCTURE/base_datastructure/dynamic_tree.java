package DATA_STRUCTURE.base_datastructure;


public class dynamic_tree {
    static final  int Red = 0;
    static  final  int Black = 1;
    public Tree OS_SELECT(Tree root,int i){
        int r = root.getLeft().getSize()+1;
        if (r == i){
            return  root;
        }else if (r < i){
            return OS_SELECT(root.getRight(),i-r);
        }else {
            return OS_SELECT(root.getLeft(),i);
        }
    }

    public int OS_RANK(Tree root,Tree x){
        int r = x.getLeft().getSize()+1;
        Tree y=x;
        while (y!=root){
            if (y==y.getParent().getRight()){
                r = r+y.getLeft().getSize()+1;
            }
            y = y.getParent();
        }
        return r;
    }
}
class Tree{
    private int color;
    private int key;
    private int size=1;
    private Tree left;
    private Tree right;
    private Tree parent;

    Tree(){

    }

    Tree(int key){
        this.key = key;
    }

    public int getColor() {
        return color;
    }

    public int getKey() {
        return key;
    }

    public int getSize() {
        return size;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public Tree getParent() {
        return parent;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public void setParent(Tree parent) {
        this.parent = parent;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
