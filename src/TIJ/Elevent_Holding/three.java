package TIJ.Elevent_Holding;

import TIJ_examples.Ten_Innerclasses.Sequence;

import java.util.ArrayList;
import java.util.Collection;

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class three {
    private ArrayList items;
    private int next = 0;
    public three(){ items = new ArrayList(); }
    public void add(Object x){
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size())
                i++;
        }

    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        three sequence = new three();
        for (int i=0;i<10;i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.print(selector.current()+", ");
            selector.next();
        }
    }
}
