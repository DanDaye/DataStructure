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

    public void TRANSPLANT(treenode root,treenode u,treenode v){
        if (u.getParent() == null){
            root = v;
        }else if(u==u.getParent().getLeft()){
            u.getParent().setLeft(v);
        }else {
            u.getParent().setRight(v);
        }
        if (v!=null){
            v.setParent(u.getParent());
        }
    }

    public void TREE_DELETE(treenode root,treenode z){
        if (z.getLeft()==null){
            TRANSPLANT(root,z,z.getRight());
        }else if (z.getRight() == null){
            TRANSPLANT(root,z,z.getLeft());
        }else {
            treenode y = TREE_MINIMUM(z.getRight());
            if (y.getParent()!=z){
                TRANSPLANT(root,y,y.getRight());
                y.setRight(z.getRight());
                y.getRight().setParent(y);
            }
            TRANSPLANT(root,z,y);
            y.setLeft(z.getLeft());
            y.getLeft().setParent(y);
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
        treenode val = t.TREE_MINIMUM(root);
        treenode maxval = t.TREE_MAXIMUM(root);
        t.TREE_SUCCESSOR(left);
        t.TREE_PREDECESSOR(right);
        t.TREE_DELETE(root,right);

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
    public void setParent(treenode node){
        this.parent = node;
    }
}
