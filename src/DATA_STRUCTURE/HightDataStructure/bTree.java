//package DATA_STRUCTURE.HightDataStructure;
//
//import javafx.beans.binding.ObjectBinding;
//
//import java.security.KeyStore;
//import java.util.Map;
//
//public class bTree<Key extends Comparable<Key>,value> {
//    private static final int M =4;
//    private Node root;
//    private int height;
//    private int n;
//
//    private static final class Node{
//        private int m;
//        private Entry[] children = new Entry[M];
//
//        private Node(int k){
//            m=k;
//        }
//    }
//
//    private static class Entry{
//        private Comparable key;
//        private Object val;
//        private Node next;
//        public Entry(Comparable key, Object val,Node next){
//            this.key =key;
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//    public bTree(){
//        root = new Node(0);
//    }
//
//    public boolean isEmpty(){
//        return size() == 0;
//    }
//
//    public int size(){
//        return n;
//    }
//
//    public int height(){
//        return height;
//    }
//
//    public Value get(Key key){
//        if (key == null){
//            throw new NullPointerException("Key must not be null")''
//        }
//        return search(root,key,height);
//    }
//
//    private Value search(Node x,Key key,int ht){
//
//    }
//}
