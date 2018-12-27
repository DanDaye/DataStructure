package ExampleInTIJ.Twelve;

import ExampleInTIJ.Six.Bath;
import com.sun.tools.corba.se.idl.constExpr.Or;

class Ordinary{}
class WrongClone extends Ordinary{
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class IsCloneable extends Ordinary implements Cloneable{
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class NoMore extends IsCloneable{
    public Object clone() throws CloneNotSupportedException{
        throw  new CloneNotSupportedException();
    }
}

class TryMore extends NoMore{
    public Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }
}

class BackOn extends NoMore{
    private BackOn duplicate(BackOn b){
        return new BackOn();
    }

    public Object clone(){
        return duplicate(this);
    }
}

final class ReallyNoMore extends NoMore{}
public class CheckCloneable {

    static Ordinary tryToClone(Ordinary ord){
        String id = ord.getClass().getName();
        Ordinary x = null;
        if (ord instanceof  Cloneable){
            try {
                System.out.println("Attempting "+id);
                x = (Ordinary)((IsCloneable)ord).clone();
                System.out.println("Cloned "+id);
            }catch (CloneNotSupportedException e){
                System.out.println("Could not clone "+id);
            }

        }
        return x;
    }

    public static void main(String[] args){
        Ordinary[] ord = {
                new IsCloneable(),
                new WrongClone(),
                new NoMore(),
                new TryMore(),
                new BackOn(),
                new ReallyNoMore()};
        Ordinary x = new Ordinary();
        for (int i =0;i<ord.length;i++)
            tryToClone(ord[i]);
    }
}
