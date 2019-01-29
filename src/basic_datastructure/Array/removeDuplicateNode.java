package basic_datastructure.Array;

public class removeDuplicateNode {

    public void removeDuplicate(linknode head){
        if (head == null)
            return;
        linknode before,after;
        after = head;
        before = head.getNext();
        while (before!=null){
            if (after.getVal() == before.getVal()){
                before = before.getNext();
                after.setNext(before);
            }else {
                after = after.getNext();
                before = before.getNext();
            }
        }
    }

    public static void main(String[] args){
        linknode head = new linknode(1);
        linknode n1 = new linknode(2);
        linknode n2 = new linknode(2);
        linknode n3 = new linknode(3);
        linknode n4 = new linknode(4);
        linknode n5 = new linknode(5);
        head.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        new removeDuplicateNode().removeDuplicate(head);
        while (head!=null){
            System.out.println(head.getVal());
            head = head.getNext();
        }
    }
}
