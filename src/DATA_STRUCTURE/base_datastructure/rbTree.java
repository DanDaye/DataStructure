package DATA_STRUCTURE.base_datastructure;

import apple.laf.JRSUIUtils;

public class rbTree {
    int Red = 0;
    int Black = 1;

    public void LEFT_ROATE(TreeNode x){
        TreeNode y = x.getRight();
        x.setRight(y.getLeft());
        if (y.getLeft()!=null){
            y.getLeft().setParent(x);
        }
        y.setParent(x.getParent());
        if (x.getParent()==null){
//            根节点就是y
        }else {
            if (x == x.getParent().getLeft()){
                x.getParent().setLeft(y);
            }else {
                x.getParent().setRight(y);
            }
        }
        y.setLeft(x);
        x.setParent(y);

    }

    public void RIGHT_ROATE(TreeNode x){
        TreeNode y = x.getLeft();
        x.setLeft(y.getRight());
        if (y.getRight()!=null){
            y.getRight().setParent(x);
        }
        y.setParent(x.getParent());
        if (x.getParent()==null){
//            根节点就是y
        }else {
            if (x==x.getParent().getLeft()){
                x.getParent().setRight(y);
            }else {
                x.getParent().setLeft(y);
            }
        }
        y.setRight(x);
        x.setParent(y);
    }

    public void RB_INSERT(TreeNode root,int key){
        TreeNode z = new TreeNode(key);
        TreeNode y=null;
        while (root!=null){
            y = root;
            if (y.getKey()>=z.getKey()){
                root = root.getLeft();
            }else {
                root = root.getRight();
            }
        }
        z.setParent(y);
        if (y==null){
            root = z;
        }else if (y.getKey()>=z.getKey()){
            y.setLeft(z);
        }else {
            y.setRight(z);
        }
        z.setColor(Red);
        RB_INSERT_FIXUP(root,z);
    }

    public void RB_INSERT_FIXUP(TreeNode root,TreeNode z){
        while (z.getParent().getColor()==Red){

            if (z.getParent()==z.getParent().getParent().getLeft()){
                TreeNode y = z.getParent().getParent().getRight();
                //情况1：
                if (y.getColor() ==Red){
                    z.getParent().setColor(Black);
                    y.setColor(1);
                    z.getParent().getParent().setColor(Red);
                    z = z.getParent().getParent();
                }else{//情况2
                    if (z==z.getParent().getRight()){
                        z = z.getParent();
                        LEFT_ROATE(z);
                        z.getParent().setColor(Black);
                        z.getParent().getParent().setColor(Red);
                    }
                    //情况3
                    z.getParent().setColor(Black);
                    z.getParent().getParent().setColor(Red);
                    RIGHT_ROATE(z.getParent().getParent());
                }
            }else{

                TreeNode y = z.getParent().getRight().getLeft();
                //情况1：
                if (y.getColor()==Red){
                    z.getParent().setColor(Black);
                    z.getParent().getParent().setColor(Red);
                    z=z.getParent().getParent();
                }else{
                    //情况2：
                    if (z ==z.getParent().getLeft()){
                        z = z.getParent();
                        LEFT_ROATE(z);
                    }
                    //情况3：
                    z.getParent().setColor(Black);
                    z.getParent().getParent().setColor(Red);
                    RIGHT_ROATE(z.getParent().getParent());
                }
            }
        }
        root.setColor(Black);
    }

    public void RB_TRANSPLANT(TreeNode root,TreeNode u,TreeNode v){
        if (root == null){
            root = v;
        }else if (u == u.getParent().getLeft()){
            u.getParent().setLeft(v);
        }else {
            u.getParent().setRight(v);
        }
        v.setParent(u.getParent());
    }

    public void RB_DELETE(TreeNode root,TreeNode z){
        TreeNode y = z;
        int y_original_color = z.getColor();
        TreeNode x ;
        if (z.getLeft() == null){
            x = z.getRight();
            RB_TRANSPLANT(root,z,x);
        }else if (z.getRight()==null){
            x = z.getLeft();
            RB_TRANSPLANT(root,z,x);
        }else {
            y = Tree_MIMIMUM(z.getRight());
            y_original_color = y.getColor();
            x = y.getRight();
            if (y.getParent() == z){
                x.setParent(y);
            }else {
                RB_TRANSPLANT(root,y,y.getRight());
                y.setRight(x);
                x.setParent(y);
            }
            RB_TRANSPLANT(root,z,y);
            y.setLeft(z.getLeft());
            y.getLeft().setParent(y);
            y.setColor(z.getColor());
        }
        if (y_original_color==Black){
            RB_DELETE_FIXUP(root,x);
        }
    }

    private void RB_DELETE_FIXUP(TreeNode root, TreeNode x) {
        while (x!=root && x.getColor()==Red){
//            情况1：
            if (x == x.getParent().getLeft()){
                TreeNode w = x.getParent().getRight();
                if (w.getColor()==Red){
                    w.setColor(Black);
                    x.getParent().setColor(Red);
                    LEFT_ROATE(x.getParent());
                    w = x.getParent().getRight();
                }
                if (w.getLeft().getColor() == Black && w.getRight().getColor() == Black){
                    w.setColor(Red);
                    x = x.getParent();
                }else if (w.getRight().getColor() == Black){
                    w.getLeft().setColor(Black);
                    w.setColor(Red);
                    RIGHT_ROATE(w);
                    w = x.getParent().getRight();
                }
                w.setColor(x.getParent().getColor());
                x.getParent().setColor(Black);
                w.getRight().setColor(Black);
                LEFT_ROATE(x.getParent());
                x = root;
            }else {
                TreeNode w = x.getParent().getLeft();
                if (w.getColor()==Red){
                    w.setColor(Black);
                    x.getParent().setColor(Red);
                    LEFT_ROATE(x.getParent());
                }
                if (w.getLeft().getColor() == Black && w.getRight().getColor() == Black){
                    w.setColor(Red);
                    x = x.getParent();
                }else if (w.getRight().getColor() == Black){
                    w.getLeft().setColor(Black);
                    w.setColor(Red);
                    LEFT_ROATE(w);
                    w = x.getParent().getRight();
                }
                w.setColor(x.getParent().getColor());
               x.getParent().setColor(Red);
               w.getRight().setColor(Black);
               LEFT_ROATE(x.getParent());
               x = root;
            }
        }
        x.setColor(Black);
    }

    private TreeNode Tree_MIMIMUM(TreeNode x) {
        while (x!=null){
            if (x.getLeft() == null){
                return x;
            }else {
                x = x.getLeft();
            }
        }
        return null;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1,11);
        TreeNode left = new TreeNode(0,2);
        TreeNode right = new TreeNode(1 ,14);
        root.setLeft(left);
        root.setRight(right);
        left.setParent(root);
        right.setParent(root);
        TreeNode left1 = new TreeNode(1,1);
        TreeNode right1 = new TreeNode(1,7);
        left.setLeft(left1);
        left.setRight(right1);
        left1.setParent(left);
        right1.setParent(left);
        TreeNode right2 = new TreeNode(0,15);
        right.setRight(right2);
        right2.setParent(right);
        TreeNode left12 =new TreeNode(0,5);
        TreeNode right12 = new TreeNode(0,8);
        right1.setLeft(left12);
        right1.setRight(right12);
        left12.setParent(right1);
        right12.setParent(right1);
        TreeNode left22 = new TreeNode(0,4);
        left12.setLeft(left22);
        left22.setParent(left12);

        rbTree rbtree = new rbTree();
        rbtree.LEFT_ROATE(left);
    }
}
class TreeNode{
    private int color;
    private int key;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;
    TreeNode(int key){
        this.key =key;
    }
    TreeNode(int color,int key){
        this.color = color;
        this.key = key;
    }
    TreeNode(int color,int key,TreeNode left,TreeNode right ,TreeNode parent){
        this.color = color;
        this.key = key;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
//    set method
    public void setColor(int color){
        this.color = color;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public void setParent(TreeNode parent){
        this.parent = parent;
    }

//    get method
    public int getColor(){
        return this.color;
    }

    public int getKey(){
        return this.key;
    }

    public TreeNode getLeft(){
        return  this.left;
    }

    public TreeNode getRight(){
        return  this.right;
    }

    public TreeNode getParent(){
        return this.parent;
    }

}
