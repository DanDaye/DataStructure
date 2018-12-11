package TIJ.Four;

class OverloadClass{
    OverloadClass(){
        System.out.println("Ddefault class with args");
    }
    OverloadClass(String s){
        this();
        System.out.println("with args :" + s);
    }
}
public class two {
    public static void main(String[] args){
        OverloadClass o = new OverloadClass("here");
    }
}
