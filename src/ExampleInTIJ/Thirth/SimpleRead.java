package ExampleInTIJ.Thirth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.Buffer;

public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
    public static void main(String[] args){
        try {
            System.out.println("What is your name?");
            String name = input.readLine();
            System.out.println(name);
            System.out.println("how old are you?what is your favorite double?");
            String number = input.readLine();
            System.out.println(number);
        }catch (IOException e){
            System.out.println("I/O exception");
        }
    }
}
