package DATA_STRUCTURE.HighDesign_Analyze;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;

public class huffman {

    public TreeNode EXTRACT_MIN(List<TreeNode> q){
        TreeNode tt = new TreeNode(Integer.MAX_VALUE);
        for (TreeNode t:q){
            if (t.getValue() < tt.getValue()){
                tt = t;
            }
        }
        return tt;
    }
    public TreeNode HUFFMAN(List<TreeNode> c){
        int n = c.size();
        List<TreeNode> q = c;
        for (int i=1;i<n;i++){
            TreeNode left = EXTRACT_MIN(c);
            c.remove(left);
            TreeNode right = EXTRACT_MIN(c);
            c.remove(right);
            TreeNode total = new TreeNode(left.getValue()+right.getValue());
            total.setLeft(left);
            total.setRight(right);
            c.add(total);
        }
        return EXTRACT_MIN(c);
    }

    public static void main(String[] args){
        List<TreeNode> t = new ArrayList<TreeNode>();
        TreeNode t1 = new TreeNode(45);
        TreeNode t2 = new TreeNode(13);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(16);
        TreeNode t5 = new TreeNode(9);
        TreeNode t6 = new TreeNode(5);
        t.add(t1);
        t.add(t2);
        t.add(t3);
        t.add(t4);
        t.add(t5);
        t.add(t6);
        TreeNode result = new huffman().HUFFMAN(t);
        System.out.println(result.getValue());

    }
}
class TreeNode{
    private int value;
    private TreeNode left = null;
    private TreeNode right = null;

    TreeNode(){

    }

    TreeNode(int value){
        this.value = value;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}