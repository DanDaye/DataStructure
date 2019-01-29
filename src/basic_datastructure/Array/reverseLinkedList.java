package basic_datastructure.Array;

class linknode{
    private int val;
    private linknode next;

    public int getVal() {
        return val;
    }

    public linknode getNext() {
        return next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(linknode next) {
        this.next = next;
    }
    linknode(int val){
        this.val = val;
        this.next = null;
    }
}
public class reverseLinkedList {
    public linknode reverselink(linknode head){
        if (head == null) return head;
        linknode t1=null;
        linknode t2=null;
        while (head.getNext() != null){
            t1 = head;
            head = head.getNext();
            t1.setNext(t2);
            t2 = t1;
        }
        head.setNext(t1);
        return head;
    }
    public static void main(String[] args){
        linknode head = new linknode(1);
        linknode n1 = new linknode(2);
        head.setNext(n1);
        linknode n2 = new linknode(3);
        n1.setNext(n2);
        linknode n3 = new linknode(4);
        n2.setNext(n3);
        linknode result =new reverseLinkedList().reverselink(head);
        while (result!=null){
            System.out.println(result.getVal());
            result = result.getNext();
        }
    }
}
