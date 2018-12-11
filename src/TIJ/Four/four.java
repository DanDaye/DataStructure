package TIJ.Four;

class OverloadClass4 {
    OverloadClass4() {
        System.out.println("Ddefault class with args");
    }

    OverloadClass4(String s) {
        this();

    }
}
public class four {
    public static void main(String[] args){
        OverloadClass4[] o4 = new OverloadClass4[4];
    }
}
