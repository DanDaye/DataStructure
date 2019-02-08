package ExampleInTIJ.nineteen;

import static TIJ_examples.net.mindview.util.Print.*;

enum Shrubbery { GROUND,CRAWLING,HANGING}
public class EnumClass {
    public static void main(String[] args){
        for (Shrubbery s:Shrubbery.values()){
            print(s + " ordinal: "+s.ordinal());//ordinal()获得在声明时的次序
            printnb(s.compareTo(Shrubbery.CRAWLING)+" ");//实现了Comparable接口，同时还实现了Serializable接口
            printnb(s.equals(Shrubbery.CRAWLING)+" ");//编译器会自动提供equals()和hasCode()方法
            print(s == Shrubbery.CRAWLING);
            print(s.getDeclaringClass());//知道其所属的类
            print(s.name());
            print("---------------------");
        }
    }
}
