package ExampleInTIJ.Eight;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BISchemaBinding;

import java.util.BitSet;
import java.util.Random;

public class Bits {
    public static void main(String[] args){
        Random rand = new Random();
        byte bt = (byte)rand.nextInt();

        BitSet bb = new BitSet();
        for (int i=0;i<7;i++){
            if (((1<<i)&bt)!=0){
                bb.set(i);
            }else {
                bb.clear(i);
            }
        }
        System.out.println("byte value: "+bt);
        System.out.println(""+bb);

        BitSet bs = new BitSet();
        short st = (short)rand.nextInt();
        for (int i=15;i>=0;i--){
            if (((1<<i)&st)!=0){
                bs.set(i);
            }else {
                bs.clear(i);
            }
        }
        System.out.println("int value:" +st);
        System.out.println(""+bs);

        int it = rand.nextInt();
        BitSet bi = new BitSet();
        for (int i=31;i>=0;i--){
            if (((1<<i)&it)!=0){
                bi.set(i);
            }else {
                bi.clear(i);
            }
        }
        System.out.println("int value "+it);
        System.out.println("" + bi);

        BitSet b127 = new BitSet();
        b127.set(127);
    }
}
