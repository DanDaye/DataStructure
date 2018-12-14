package ExampleInTIJ.Eight;

public class IceCream{
    static  String[] flaw ={
            "Chocolate","'Strawberry'",
            "'Vanilla Fudge Swirl'","'Mint Chip'",
            "'Mocha Almond Fudge'","'Fum Raisin'",
            "'Paraline Cream'","'Mud Pie'"
    };
    static String[] flavorSet(int n){
        n = Math.abs(n)%(flaw.length+1);
        String[] result = new String[n];
        int[] picks = new int[n];
        for (int i=0;i<picks.length;i++){
            picks[i] = -1;
        }
        for (int i =0;i<picks.length;i++){
            retry:
            while (true){
                int t = (int)(Math.random()*flaw.length);
                for (int j=0;j<i;j++){
                    if (picks[j] == t) continue retry;
                }
                picks[i] = t;
                result[i] = flaw[t];
                break ;
            }

        }
        return result;
    }
    public static void main(String [] args){
        for (int i=0;i<20;i++){
            System.out.println("flavorSet("+i+") = ");
            String[] fl = flavorSet(flaw.length);
            for (int j=0;j<fl.length;j++){
                System.out.println("\t"+fl[j]);
            }
        }
    }

}
