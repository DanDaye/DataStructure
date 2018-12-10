package ExampleInTIJ.four;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
class Tree{
    int height;
    Tree(){
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree(int i){
        System.out.println("Creating new tree that is " + i+"feet tail");
        height = 1;
    }
    void info(){
        System.out.println("Tree is "+height + "feet tial");
    }
    void info(String s){
        System.out.println(s+" :Tree is "+height + "feet tial");
    }
    static void prt(String s){
        System.out.println(s);
    }
}
public class Overloading {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
