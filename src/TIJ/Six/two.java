package TIJ.Six;

class B{
    B(int i){
        System.out.println("B constructor");
    }
}
class C{
    B b = new B(0);
}
class A extends C{
    A(int c){
        System.out.println("A constructor");
    }
}
public class two {
}
