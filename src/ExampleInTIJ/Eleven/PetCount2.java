package ExampleInTIJ.Eleven;


import java.util.Hashtable;
import java.util.Vector;

public class PetCount2 {
    public static void main(String[] args){
        Vector pets = new Vector();
        Class[] petTypes = {
                Pet.class,
                Dog.class,
                Pug.class,
                Cat.class,
                Rodent.class,
                Gerbil.class,
                Hamster.class
        };
        try {
            for (int i=0;i<15;i++){
                int rnd =1+(int)(Math.random()*(petTypes.length-1));
                pets.addElement(petTypes[rnd].newInstance());
            }
        }catch (InstantiationException e) {}
        catch (IllegalAccessException e){}
        Hashtable h = new Hashtable();
        for (int i=0;i<petTypes.length;i++)
            h.put(petTypes[i].toString(),new Counter());
        for (int i=0;i<pets.size();i++){
            Object o  = pets.elementAt(i);
            if (o instanceof Pet)
                ((Counter)h.get("ExampleInTIJ.Eleven.Pet")).i++;

        }
    }
}
