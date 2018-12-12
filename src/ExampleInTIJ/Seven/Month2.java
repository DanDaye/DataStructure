package ExampleInTIJ.Seven;

public final class Month2 {
    private String name;
    private Month2(String nm){ name = nm;}
    public String toString(){ return  name;}
    public final static Month2
        JAN = new Month2("January"),
        FEB = new Month2("February");
    public final static Month2[] month = {JAN,FEB,JAN};
    public static void main(String[] args){
        Month2 m = Month2.JAN;
        System.out.println(m);
        m = Month2.month[2];
        System.out.println(m);
        System.out.println(m==Month2.JAN);
        System.out.println(m.equals(Month2.JAN));
    }
}
