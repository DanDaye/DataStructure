package ExampleInTIJ.Eight;

import java.util.Enumeration;
import java.util.Vector;

public class CrashJava {
    public String toString(){
        return "CrashJava address:" + this +"\n";//递归调用以致奔溃
    }

    public static void main(String[] args){
        Vector v = new Vector();
        for (int i = 0;i<10;i++){
            v.addElement(new CrashJava());
        }
//        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
