package TIJ.Elevent_Holding;

import java.util.ArrayList;
import java.util.Random;

class Gerbil{
    private int gerbilNumber;
    Gerbil(int gerbilNumber){ this.gerbilNumber = gerbilNumber; }
    public void hop(){
        System.out.println(gerbilNumber+" is jumping");
    }
}

public class one {
    public static void main(String[] args){
        ArrayList gerbils = new ArrayList();
        Random rand = new Random();
        for (int i=0;i<4;i++)
            gerbils.add(new Gerbil(rand.nextInt(18)));
        for (int i=0;i<gerbils.size();i++)
            ((Gerbil)gerbils.get(i)).hop();
    }
}
