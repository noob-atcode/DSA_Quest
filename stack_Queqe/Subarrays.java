package stack_Queqe;

import java.util.Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int[] uparr={2,4,6,9};
        int[] arr=new int[uparr.length];
        subarrays(uparr,arr,0,0);
    }
    static void subarrays(int[] uparr,int[]arr,int index,int arrsize){
        //Base condition
        if(index==uparr.length ){
            System.out.println(Arrays.toString(Arrays.copyOf(arr,arrsize)));
            return;
        }


        subarrays(uparr,arr,index+1,arrsize);
        arr[arrsize]=uparr[index];
        subarrays(uparr,arr,index+1,arrsize+1);


    }
}
