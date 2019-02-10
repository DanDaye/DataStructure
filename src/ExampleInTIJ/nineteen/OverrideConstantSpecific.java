package ExampleInTIJ.nineteen;

import static TIJ_examples.net.mindview.util.Print.print;
import static TIJ_examples.net.mindview.util.Print.printnb;

public enum  OverrideConstantSpecific {
    NUT,BOLT,
    WASHER{
        void f(){ print("Overrident method");}
    };
    void f(){print("default behavior");}

    public static void main(String[] args){
        for (OverrideConstantSpecific ocs:values()){
            printnb(ocs+": ");
            ocs.f();
        }
    }
}

