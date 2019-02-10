package TIJ_examples.Eleven_Holding;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class  Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
    public static void main(String[] args){
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());//运行结果和书上不一致，估计是改进了
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());
        List<Snow> snow4 = Arrays.<Snow>asList(//指定参数
                new Light(),new Heavy()
        );
    }
}
