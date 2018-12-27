package ExampleInTIJ.Thirth;

import java.util.Random;

public class UsingStringBuilder {
    public static Random random = new Random(47);
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for (int i=0;i<25;i++){
            result.append(random.nextInt());
            result.append(". ");
        }
        result.delete(result.length()-2,result.length());
        result.append("]");
        return result.toString();
    }
    public static void main(String[] args){
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
