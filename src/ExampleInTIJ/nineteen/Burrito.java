package ExampleInTIJ.nineteen;


import ExampleInTIJ.nineteen.enumerated.Spiciness;

import static ExampleInTIJ.nineteen.enumerated.Spiciness.*;//静态导入

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){this.degree = degree;}
    public String toString(){return "Burrito is "+ degree;}
    public static void main(String[] args){
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
