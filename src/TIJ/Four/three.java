package TIJ.Four;

class OverloadClass3{
    OverloadClass3(){
        System.out.println("Ddefault class with args");
    }
    OverloadClass3(String s){
        this();
        System.out.println("with args :" + s);
    }
}
public class three {
    public static void main(String[] args){
        OverloadClass3[] o;
    }
}
