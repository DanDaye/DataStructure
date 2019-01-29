package basic_datastructure.Array;

public class theNnode {
    public int index =0;
    public TreeNode KthNode(TreeNode root,int k){
        if (root!=null){
            TreeNode node = KthNode(root.getLeft(),k);
            if (node!=null)
                return node;
            index ++;
            if (index == k)
                return root;
            node = KthNode(root.getRight(),k);
            if (node!=null)
                return node;

        }
        return null;
    }
}
