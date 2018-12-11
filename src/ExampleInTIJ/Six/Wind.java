package ExampleInTIJ.Six;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class Instrument{
    public void play(){}
    static void tune(Instrument i){
        i.play();
        System.out.println("i");
    }
}

public class Wind extends Instrument{
    public static void main(String[] args){
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
