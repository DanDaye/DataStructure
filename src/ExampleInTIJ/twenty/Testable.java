package ExampleInTIJ.twenty;

import TIJ_examples.net.mindview.atunit.Test;

public class Testable {
    public void execute(){
        System.out.println("Executing..");
    }
    @Test void testExecute(){ execute();}
}
