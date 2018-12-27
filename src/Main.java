import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
        int[] result = new int[n*m];
        boolean flag = true;
        int index =0;
        for(int i=0;i<n;i++){
            if(flag){
                flag = false;
                for (int j=0;j<m;j++){
                    result[index] = mat[i][j];
                    index ++;
                }
            }else{
                flag = true;
                for(int j=m-1;j>=0;j--){
                    result[index] = mat[i][j];
                    index ++;
                }
            }
        }
        return result;
    }

    public String rotateString(String A, int n, int p) {
        // write code here
        p = p%n;
        return A.substring(p+1,A.length())+A.substring(0,p+1);
    }

    public int[][] flipChess(int[][] A, int[][] f) {
        // write code here
        for(int i=0;i<f.length;i++){
            int index1 = f[i][0]-1;
            int index2 = f[i][1]-1;
            //up
            if(index1-1>=0){
                if (A[index1-1][index2]==1){
                    A[index1-1][index2]=0;
                }else {
                    A[index1-1][index2]=1;
                }
            }
            //down
            if(index1+1<4){
                if (A[index1 + 1][index2] == 1)
                    A[index1+1][index2]=0;
                else
                    A[index1+1][index2]=1;
            }
            //left
            if(index2-1>=0){
                if (A[index1][index2-1]==1)
                    A[index1][index2-1]=0;
                else
                    A[index1][index2-1]=1;
            }
            //right
            if(index2+1<4){
                if (A[index1][index2+1]==1)
                    A[index1][index2+1]=0;
                else
                    A[index1][index2+1]=1;
            }
        }
        return A;
    }


    public int partition(int[] A,int left,int right){
        int index = left -1;
        int key = A[right];
        for(int i=left;i<right;i++){
            if(A[i] <= key){
                index ++;
                int temp = A[index];
                A[index] = A[i];
                A[i] = temp;
            }
        }
        index ++;
        int temp = A[index];
        A[index] = key;
        A[right] = temp;
        return index;
    }
    public void quicksort(int[] A,int left,int right){
        if(left < right){
            int middle = partition(A,left,right);
            quicksort(A,left,middle-1);
            quicksort(A,middle+1,right);
        }
    }
    public int countPairs(int[] A, int n, int sum) {
        // write code here
        //先对数组进行排序，QuickSort
        quicksort(A,0,n-1);
        //然后通过头尾指针移动
        int count=0;

        for(int i = 0,j = n - 1;i < j;){
            int s = A[i] + A[j];
            if(s == sum){
                // 3 3 3这种情况
                if(A[i] == A[j]){
                    int x = j-i+1;
                    count += x*(x-1)/2;
                    break;
                }//if
                // 2 2 3 4 4 4这种情况
                else{
                    int k = i+1;
                    while(k <= j && A[i] == A[k]){
                        ++k;
                    }//while
                    int k2 = j-1;
                    while(k2 >= i && A[j] == A[k2]){
                        --k2;
                    }//while
                    count += (k-i)*(j-k2);
                    i = k;
                    j = k2;
                }//else
            }//if
            else if(s < sum){
                ++i;
            }//else
            else{
                --j;
            }//else
        }//for
        return count;
    }
    public static void main(String[] args){
        int[] num = {11,7,7,6,14,2,14,15,2,1,2,12,13,9,8,15,13,8,10,11,14,10,2,9,4,9,3,7,6,10,15,4,7,6,15,3,9,13,5,2,6,10,10,1,12,4,3,3,8,8,1,4,7,11,13,5,13,15,4,3,1,11,6,11,9,9,11,15,12,10,13,3,11,4,8,9,7,3,13,9,11,3,2,11,10,1,4,2,3,3,14,11,5,10,1,14,8,1,11,3,1,9,14,6,1,7,15,10,14,6,4,12,11};
        System.out.println(new Main().countPairs(num,113,16));
    }
}