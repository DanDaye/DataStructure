package ExampleInTIJ.Eight;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Enumeration;
import java.util.Vector;

class Hanster{
    private int hansterNumber;
    Hanster(int i){
        hansterNumber=i;
    }
    public String toString(){
        return "This is Hanster #"+hansterNumber;
    }
}

class Printer{
    static void printAll(Enumeration e){
        while (e.hasMoreElements()){
            System.out.println(e.nextElement().toString());
        }
    }
}
public class HansterMalze {
    public static void main(String[] args){
        Vector v = new Vector();
        for (int i = 0;i<3;i++){
            v.addElement(new Hanster(i));
        }
        Printer.printAll(v.elements());
    }
}
