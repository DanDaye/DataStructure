public class test {
    final void hat(int i){System.out.print(i);}
    void hat(String i){System.out.print(i);}
    public static void main(String[] args){
        new test().hat(2);
        new test().hat("333");
    }
}