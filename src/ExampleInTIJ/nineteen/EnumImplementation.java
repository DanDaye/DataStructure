package ExampleInTIJ.nineteen;

import TIJ_examples.net.mindview.util.Generator;
import java.util.Random;

enum CartoonCharacter implements Generator<CartoonCharacter>{
    SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
    private Random random = new Random(47);
    public CartoonCharacter next(){
        return values()[random.nextInt(values().length)];
    }
}
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.print(rg.next() + " . ");
    }

    public static void main(String[] args){
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i =0;i<10;i++){
            printNext(cc);
        }
    }
}
