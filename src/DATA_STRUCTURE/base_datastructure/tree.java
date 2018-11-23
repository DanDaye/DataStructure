package DATA_STRUCTURE.base_datastructure;

public class tree {

    public void INORDER_TREE_WALK(treenode x){
        if (x !=null){
            INORDER_TREE_WALK(x.getLeft());
            System.out.println(x.getKey());
            INORDER_TREE_WALK(x.getRight());
        }
    }

    public treenode TREE_SEARCH(treenode x,int key){
        if (x!=null){
            if (x.getKey() == key){
                return  x;
            }else if (x.getKey()>key){
                return TREE_SEARCH(x.getLeft(),key);
            }else {
                return TREE_SEARCH(x.getRight(),key);
            }
        }
        return null;
    }

    public treenode ITERATIVE_TREE_SEARCH(treenode x, int key){
        while (x!=null){
            if (x.getKey() == key){
                return  x;
            }else if (x.getKey() > key){
                x =  x.getLeft();
            }else {
                x = x.getRight();
            }
        }
        return  null;
    }

    public treenode TREE_MINIMUM(treenode x){
        while (x!=null){
            if (x.getLeft() == null){
                return x;
            }else {
                x = x.getLeft();
            }
        }
        return null;
    }

    public treenode TREE_MAXIMUM(treenode x){
        while (x!=null){
            if (x.getRight() == null){
                return x;
            }else {
                x = x.getRight();
            }
        }
        return null;
    }

    public treenode TREE_SUCCESSOR(treenode x){
        if (x.getRight()!=null){
            return TREE_MINIMUM(x.getRight());
        }
        treenode y = x.getParent();
        while (y!=null && x== y.getRight()){
            x = y;
            y=y.getParent();
        }
        return  y;
    }


    public treenode TREE_PREDECESSOR(treenode x){
        if (x.getLeft()!=null){
            return TREE_MAXIMUM(x.getLeft());
        }
        treenode y = x.getParent();
        while (y!=null && x== y.getRight()){
            x = y;
            y=y.getParent();
        }
        return  y;
    }

    public void TREE_INSERT(treenode x,int key){
        treenode z = new treenode(key);
        treenode y = null;
        while (x!= null){
            y = x;
            if (x.getKey()>z.getKey()){
                x = x.getLeft();
            }else {
                x = x.getRight();
            }
        }
        z.setParent(y);
        if (y==null){
//            z is the root
        }else if (z.getKey() < y.getKey()){
            y.setLeft(z);
        }else {
            y.setRight(z);
        }

    }
    public static void main(String[] args){
        treenode root = new treenode(6);
        root.setLeft(new treenode(5));
        root.setRight(new treenode(7));
        treenode left = root.getLeft();
        treenode right = root.getRight();
        left.setLeft(new treenode(2));
        left.setRight(new treenode(5));
        right.setRight(new treenode(8));
        tree t = new tree();
//        t.INORDER_TREE_WALK(root);
        treenode result = t.TREE_SEARCH(root,5);
        int val = t.TREE_MINIMUM(root);
        int maxval = t.TREE_MAXIMUM(root);
        t.TREE_SUCCESSOR(left);
        t.TREE_PREDECESSOR(right);

    }
}
class treenode{
    private int key;
    private treenode left = null;
    private treenode right = null;
    private treenode parent = null;
    treenode(int key){
        this.key = key;
    }
    treenode(int key,treenode left,treenode right){
        this.key = key;
        this.left = left;
        this.right = right;
    }
    public int getKey(){
        return  this.key;
    }
    public treenode getLeft(){
        return this.left;
    }
    public treenode getRight(){
        return  this.right;
    }
    public void setLeft(treenode left){
        this.left = left;
        this.left.parent = this;
    }
    public void setRight(treenode right){
        this.right = right;
        this.right.parent = this;
    }
    public treenode getParent(){
        return this.parent;
    }
    public treenode setParent(treenode node){
        this.parent = node;
    }
}
