package ExampleInTIJ.Seven;

interface Instrument5{
    int i=5;
    void play();
    String what();
    void adjust();
}

class Wind5 implements  Instrument5{

    @Override
    public void play() {
        System.out.println("Wind5.play()");
    }

    @Override
    public String what() {
        return "Wind5";
    }

    @Override
    public void adjust() {

    }
}

class Percussion5 implements Instrument5 {
    public void play() {
        System.out.println("Percussion5.play()");
    }
    public String what() { return "Percussion5"; }
    public void adjust() {}
}

class Stringed5 implements Instrument5 {
    public void play() {
        System.out.println("Stringed5.play()");
    }
    public String what() { return "Stringed5"; }
    public void adjust() {}
}

class Brass5 extends Wind5 {
    public void play() {
        System.out.println("Brass5.play()");
    }
    public void adjust() {
        System.out.println("Brass5.adjust()");
    }
}

class Woodwind5 extends Wind5 {
    public void play() {
        System.out.println("Woodwind5.play()");
    }
    public String what() { return "Woodwind5"; }
}

public class Music5 {
    
    
    public static void main(String[] args){
        Instrument5[] orchestra = new Instrument5[5];
        int i =0;
        orchestra[i++] = new Wind5();
        orchestra[i++] = new Percussion5(); orchestra[i++] = new Stringed5(); orchestra[i++] = new Brass5();
        orchestra[i++] = new Woodwind5(); 
        tuneAll(orchestra);
    }

    private static void tuneAll(Instrument5[] orchestra) {
        for (int i=0;i<orchestra.length;i++){
            tune(orchestra[i]);
        }
    }

    private static void tune(Instrument5 instrument5) {
        instrument5.play();
    }
}
