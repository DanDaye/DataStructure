package basic_datastructure.Array;


import java.util.List;

class Node{
    int data;

    Node left =null;
    Node right = null;
    Node(int data){
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }
}
public class NnearRoot {

    public static void printKDistant(Node node,int k){
        if (node==null){
            return;
        }else {
            if (k==0){
                System.out.println(node.getData());
            }
            printKDistant(node.getLeft(),k-1);
            printKDistant(node.getRight(),k-1);
        }
    }

    public static void main(String[] args){
        Node root = new Node(1);
        Node left1 = new Node(2);
        Node right1 = new Node(3);
        Node left11 = new Node(4);
        Node left12 = new Node(5);
        Node rigt1 = new Node(8);
        root.setLeft(left1);
        root.setRight(right1);
        left1.setLeft(left11);
        left1.setRight(left12);
        right1.setLeft(rigt1);

        printKDistant(root,2);
    }
}
