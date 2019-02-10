package ExampleInTIJ.nineteen;

import static TIJ_examples.net.mindview.util.Print.print;
import static TIJ_examples.net.mindview.util.Print.printnb;

enum LikeClasses{
    WINKEN{ void behavior(){ print("Behavior1");}},
    BLINKEN{ void behavior(){ print("Behavior2");}},
    NOD{ void behavior(){ print("Behavior3");}};
    abstract void behavior();
}
public class NotClasses {
}
