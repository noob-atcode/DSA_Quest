package DSA_Quest.ArraysQuestions;

import java.util.Arrays;

public class count_subset {
    static int Count_subset(int[] uparr,int[]arr,int index,int arrsize,int count){
        if(index==uparr.length ){
         return  count=count+1;
        }


    int excl= Count_subset(uparr,arr,index+1,arrsize,count);
        arr[arrsize]=uparr[index];//including term
    int incl= Count_subset(uparr,arr,index+1,arrsize+1,count);

    return excl+incl;
    }

    public static void main(String[] args) {
        int[] uparr={1,2,3,4};
        int[] arr=new int[uparr.length];

        System.out.println(  Count_subset(uparr,arr,0,0,0));
    }
}
