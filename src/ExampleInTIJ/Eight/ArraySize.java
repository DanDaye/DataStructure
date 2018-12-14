package ExampleInTIJ.Eight;

class Weeble{}

public class ArraySize {
    public static void main(String [] args){
        Weeble[] a;
        Weeble[] b = new Weeble[5];
        Weeble[] c = new Weeble[4];
        for (int i=0;i<c.length;i++){
            c[i] = new Weeble();
        }
        Weeble[] d = { new Weeble(),new Weeble(),new Weeble()};
        System.out.println("b.lenght="+b.length);

        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
