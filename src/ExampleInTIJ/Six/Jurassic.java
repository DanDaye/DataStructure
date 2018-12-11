package ExampleInTIJ.Six;

class SmallBrain{}
final class dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){};
}

//class Further extends dinosaur{}

public class Jurassic {
    public static void main(String[] args){
        dinosaur n = new dinosaur();
        n.f();
        n.i =40;
        n.j++;
    }
}
