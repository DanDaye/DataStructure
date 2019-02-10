//: net/mindview/atunit/Test.java
// The @Test tag.
package TIJ_examples.net.mindview.atunit;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {} ///:~
