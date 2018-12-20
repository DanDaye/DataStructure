package ExampleInTIJ.Eleven;

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}
public class SweetShop {
    public static  void main(String[] args){
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
//            new Gum();
            Class.forName("Gum");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("After Class.forname(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
