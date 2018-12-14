package ExampleInTIJ.Eight;

import java.util.Enumeration;

public class StrSortVector {
    private SortVector v = new SortVector(
            new Compare() {
                @Override
                public boolean lessThan(Object lhs, Object rhs) {
                    return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase())<0;
                }

                @Override
                public boolean lessThanOrEqual(Object lhs, Object rhs) {
                    return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase())<=0;
                }
            }
    );
    private boolean sorted = false;
    public void addElement(String s){
        v.addElement(s);
        sorted = false;
    }
    public String elementAt(int index){
        if (!sorted){
            v.sort();
            sorted = true;
        }
        return (String)v.elementAt(index);
    }
    public Enumeration elements(){
        if (!sorted){
            v.sort();
            sorted = true;
        }
        return v.elements();
    }
    public static void main(String[] args){
        StrSortVector sv = new StrSortVector();
        sv.addElement("d");
        sv.addElement("A");
        sv.addElement("C");
        sv.addElement("c");
        sv.addElement("b");
        sv.addElement("B");
        sv.addElement("D");
        sv.addElement("a");
        Enumeration e = sv.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
