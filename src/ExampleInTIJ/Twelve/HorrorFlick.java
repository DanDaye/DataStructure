package ExampleInTIJ.Twelve;


class Person{}
class Hero extends Person{}
class Scientist extends Person implements Cloneable{
    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        }catch (CloneNotSupportedException e){
            throw new InternalError();
        }
        return o;
    }
}

class MadScientist extends Scientist{ }
public class HorrorFlick {
    public static void main(String[] args){
        Person  p = new Person();
        Hero h = new Hero();
        Scientist s = new Scientist();
        MadScientist m = new MadScientist();
//        p = (Person)p.clone();
        s = (Scientist)s.clone();
        m = (MadScientist)m.clone();
    }
}
