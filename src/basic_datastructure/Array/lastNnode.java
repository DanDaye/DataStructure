package basic_datastructure.Array;

public class lastNnode {

    public linknode lastN(linknode head,int n){
        if (n<0){
            return null;
        }else {
            linknode before = head;
            for (int i =0;i<n;i++){
                before = before.getNext();
                if (before == null){
                    return null;
                }
            }
            linknode after = head;
            while (before!=null){
                after = after.getNext();
                before = before.getNext();
            }
            return after;
        }
    }
}
