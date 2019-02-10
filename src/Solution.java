import TIJ_examples.net.mindview.util.Null;

public class Solution {
    public boolean isNumeric(char[] str) {
        if (str == null){
            return false;
        }else if (str[0]=='+' || str[0]=='-' || (str[0]>='0' && str[0] <='9' )){
            int point = 0;
        }else {
            return false;
        }
        return true;
    }

    public static void main(String[] args){

    }
}
