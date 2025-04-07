package DSA_Quest.ArraysQuestions;

import java.util.Arrays;

public class sumofallsubset {
    public static void main(String[] args) {
        int[] uparr={1,2,3};
        int[] arr=new int[uparr.length];

        System.out.println( subset(uparr,arr,0,0,0));
    }
    static int subset(int[] uparr,int[]arr,int index,int arrsize,int sum){
        //Base condition
        if(index==uparr.length ){
            int tempsum=0;
            for(int i=0;i<arrsize;i++){
                tempsum=tempsum+arr[i];
            }
            return tempsum;
        }


       int excl= subset(uparr,arr,index+1,arrsize,sum);
        arr[arrsize]=uparr[index];//including term
    int incl=subset(uparr,arr,index+1,arrsize+1,sum);

    return excl+incl;
    }
}
