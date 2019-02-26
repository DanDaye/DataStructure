package basic_datastructure.Array;


public class getParent {
    public TreeNode getSameParent(TreeNode root,TreeNode node1,TreeNode node2){
        if (root == null || node1 == null || node2 == null)
            return null;
        if (root.getVal() == node1.getVal() || root.getVal() == node2.getVal())
            return root;
        TreeNode left = getSameParent(root.getLeft(),node1,node2);
        TreeNode right = getSameParent(root.getRight(),node1,node2);
        if (left!=null && right!=null)
            return root;
        else if (left == null)
            return right;
        else return left;
    }

    public static void main(String[] args){

    }
}
