package ExampleInTIJ.Seven;

import sun.security.krb5.internal.crypto.Des;

public class Parcel1 {
    private  int ll ;
    class Contents{
        private int i = 1;;
        public int value(){ return i;}
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){ return  label;}
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
    }

    public static void main(String[] args){
        Parcel1 p = new Parcel1();
        p.ship("Tanzania");
    }
}
