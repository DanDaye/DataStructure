import java.util.ArrayList;
public class Main {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList result = new ArrayList();
        int total =0;
        ArrayList temp = new ArrayList();
        for(int i=1;i<100;i++){
            total +=i;
            temp.add(i);
            if(total < sum){
                continue;
            }else if(total == sum){
                if (temp.size()!=1){
                    result.add(temp);
                    ArrayList<Integer> t = new ArrayList<>();
                    t.addAll(temp);
                    temp = t;
                }

            }else{
                while(total > sum){
                    int top = ((Integer)temp.remove(0)).intValue();
                    total -=top;
                    if(total == sum){
                        if (temp.size()!=1){
                            result.add(temp);
                            ArrayList<Integer> t = new ArrayList<>();
                            t.addAll(temp);
                            temp = t;
                            break;
                        }
                    }
                }
            }
        }
        return  result;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> result = new Main().FindContinuousSequence(8);
        for (ArrayList<Integer> r:result){
            for (Integer t:r){
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}