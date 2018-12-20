package ALO.ONE;

import java.util.HashMap;

public class SortCompare {
    public int calc(int a, int b, int type) {
        // write code here
        int result=0;
        switch(type){
            case 1:
                for(int i=0;i<b;i++){
                    result +=a;
                }
                break;
            case 0:
                if (a<b){
                    result =0;
                }else{
                    int temp =0;
                    for (result =1;result < a;result++){
                        temp+=b;
                        if(temp > a){
                            result -=1;
                            break;
                        }else if(temp == a){
                            break;
                        }
                    }
                }
                break;
            case -1:
                boolean flag = true;
                if (a<b){
                    int temp = a;
                    a = b;
                    b = temp;
                }
                for(;result <= a; result++){
                    if(a == (result + b)){
                        break;
                    }
                }
                if (!flag){
                     
                }
                break;
        }
        return result;
    }
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int type = -1;
        int result = new SortCompare().calc(a,b,type);
        System.out.println(result);
    }
}
