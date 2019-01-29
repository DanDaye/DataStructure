package basic_datastructure.Array;



public class binaryTreeHeight {

    public int treeHigh(TreeNode root){
        if (root == null){
            return  0;
        }else {
           return Math.max(treeHigh(root.getLeft()),treeHigh(root.getRight()))+1;
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(3);
        root.setLeft(l1);
        root.setRight(l2);
        System.out.println(new binaryTreeHeight().treeHigh(root));
    }
}
