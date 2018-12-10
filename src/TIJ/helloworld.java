package TIJ;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class SimpleConstructor {
    SimpleConstructor(int i){
        System.out.println("Creating rock number "+i);
    }
}
public class helloworld{
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            new SimpleConstructor(i);
        }
    }
}
