package DSA_Quest.ArraysQuestions;

import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] uparr={1,2,3};
        int[] arr=new int[uparr.length];
        subset(uparr,arr,0,0);
    }
    static void subset(int[] uparr,int[]arr,int index,int arrsize){
        //Base condition
        if(index==uparr.length ){
            System.out.println(Arrays.toString(Arrays.copyOf(arr,arrsize)));
            return;
        }


       subset(uparr,arr,index+1,arrsize);
        arr[arrsize]=uparr[index];//including term
        subset(uparr,arr,index+1,arrsize+1);


    }
}
