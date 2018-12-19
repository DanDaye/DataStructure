package ExampleInTIJ.Nine;

class MyException2 extends Exception{
    private int i;
    public MyException2(){}
    public MyException2(String msg){
        super(msg);
    }
    public MyException2(String msg,int x){
        super(msg);
        i=x;
    }
    public int val(){ return  i;}
}

public class Inheriting2 {
    public static void f() throws MyException2{
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2{
        System.out.println("throwing Myexception2 form g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2{
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originate in h()",47);
    }

    public static void main(String[] args){
        try {
            f();
        }catch (MyException2 e){
            e.printStackTrace();
        }

        try {
            g();
        }catch (MyException2 e){
            e.printStackTrace();
        }

        try {
            h();
        }catch (MyException2 e){
            e.printStackTrace();
            System.out.println("e.val() = "+e.val());
        }
    }

}
