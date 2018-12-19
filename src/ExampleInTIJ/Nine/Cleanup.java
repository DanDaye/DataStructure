package ExampleInTIJ.Nine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InputFile{
    private BufferedReader in;
    InputFile(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            System.out.println("Could not oper "+ fname);
            throw e;
        }catch (Exception e){
            try {
                in.close();
            }catch (IOException e2){
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        }finally {

        }
    }
    String getLine(){
        String s;
        try {
            s = in.readLine();
        }catch (IOException e){
            System.out.println("readLine() unsuccessful");
            s = "failed";
        }
        return s;
    }
    void cleanup(){
        try {
            in.close();
        }catch (IOException e2){
            System.out.println("in.close() unsuccessful");
        }
    }
}

public class Cleanup {
    public static void main(String[] args){
        try {
            InputFile in = new InputFile("Cleanup.java");
            String s ;
            int i =1;
            while ((s = in.getLine())!=null)
                System.out.println(""+i++ +": "+s);
            in.cleanup();
        }catch (Exception e){
            System.out.println("Caugh in main,e.printStackTrace()");
            e.printStackTrace();
        }
    }
}
