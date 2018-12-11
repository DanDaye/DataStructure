package ExampleInTIJ.Six;

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = new String("Constructed");
    }
    public String toString(){//每次随同自己创建的一个类允许这种行为的时候，都只需要写一个toString方法

        return  s;
    }
}
public class SprinklerSystem {
    private String value1,value2,value3,value4;
    WaterSource waterSource;
    int i;
    float f;
    void print(){
        System.out.println("value1= "+value1);
        System.out.println("value2= "+value2);
        System.out.println("value3= "+value3);
        System.out.println("value4= "+value4);
        System.out.println("i = "+i);
        System.out.println("f = "+f);
        System.out.println("source = "+waterSource);
    }
    public static void main(String[] args){
        SprinklerSystem x = new SprinklerSystem();
        x.print();
    }
}
