package basic_datastructure.Array;

public class checkCycleLinkedList {

    public boolean checkCycle(linknode head){
        if (head == null || head.getNext()==null)
            return false;
        linknode node1 = head.getNext();
        linknode node2 = head;
        while (node1!=null){
            if (node1 == node2)
                return true;
            node1 = node1.getNext().getNext();
            node2 = node2.getNext();
        }
        return false;
    }

    public static void main(String[] args){
        linknode head = new linknode(1);
        linknode n1 = new linknode(2);
        linknode n3 = new linknode(3);
        linknode n4 = new linknode(4);
        linknode n5 = new linknode(5);
        head.setNext(n1);
        n1.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(head);
        System.out.println(new checkCycleLinkedList().checkCycle(head));
    }
}
