package ExampleInTIJ.Twelve;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class PassHandles {
    static void f(PassHandles h){
        System.out.println("h inside f() "+h);
    }
    public static void main(String[] args){
        PassHandles p = new PassHandles();
        f(p);
        System.out.println("p inside main() "+p);
    }
}
