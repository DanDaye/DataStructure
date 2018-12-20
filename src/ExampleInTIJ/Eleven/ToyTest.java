package ExampleInTIJ.Eleven;


interface  HasBatteries{}
interface Waterproof{}
interface ShootsThings{}
class Toy{
    Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,ShootsThings{
    FancyToy(){ super(1);}
}
public class ToyTest{
    public static void main(String[] args){
        Class c = null;
        try {
            c = Class.forName("FancyToy");
        } catch (ClassNotFoundException e) {}
        printInfo(c);
        Class[] faces = c.getInterfaces();
        for (int i =0;i<faces.length;i++)
            printInfo(faces[i]);
        Class cy = c.getSuperclass();
        Object o = null;
        try {
            o = cy.newInstance();
        }catch (InstantiationException e){}
        catch (IllegalAccessException e){}
        printInfo(o.getClass());
    }

    private static void printInfo(Class c) {
        System.out.println(
                "Class name: "+c.getName()+ "is interface?["+c.isInterface()+"]");
    }
}
