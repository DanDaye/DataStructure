package ExampleInTIJ.Eight;

import java.util.Vector;

class Gopher{
    private int gopherNumber;
    Gopher(int i){
        gopherNumber =i;
    }
    void print(String msg){
        if (msg!=null) System.out.println(msg);
        System.out.println("Gopher number "+ gopherNumber);
    }
}

class GopherTrap{
    static void caughtYa(Gopher g){
        g.print("Caught one!");
    }
}

public class GopherVector {
    private Vector v = new Vector();
    public void addElement(Gopher m){
        v.addElement(m);
    }
    public Gopher elementAt(int index){
        return (Gopher)v.elementAt(index);
    }

    public int size(){ return v.size();}

    public static void main(String[] args){
        GopherVector gohers  = new GopherVector();
        for (int i=0;i<3;i++){
            gohers.addElement(new Gopher(i));
        }
        for (int i=0;i<gohers.size();i++){
            GopherTrap.caughtYa(gohers.elementAt(i));
        }

    }

}
