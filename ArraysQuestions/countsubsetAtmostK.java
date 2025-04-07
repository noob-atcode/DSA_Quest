package DSA_Quest.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;


//Total number of Subsets of size at most K
/*
https://www.geeksforgeeks.org/total-number-of-subsets-of-size-at-most-k/
 */
public class countsubsetAtmostK {
    static void subset(int[] uparr,int[]arr,int index,int arrsize,int k){
        //Base condition
        if(index==uparr.length ){
            if(arrsize<=k && arrsize!=0){
            System.out.println(Arrays.toString(Arrays.copyOf(arr,arrsize)));
            return;
            }
            return;
        }
        subset(uparr,arr,index+1,arrsize,k);
        arr[arrsize]=uparr[index];//including term
        subset(uparr,arr,index+1,arrsize+1,k);
    }
 static void Makearr(int input,int k){
     int[] uparr=new int[input];
     for(int i=0;i< uparr.length;i++){
         uparr[i]=i+1;
     }
    int[] arr=new int[uparr.length];
    subset(uparr,arr,0,0,k);
 }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your num:");
        int N=inp.nextInt();
        System.out.print("Enter the K:");
        int K=inp.nextInt();
        Makearr(N,K);


    }
}

