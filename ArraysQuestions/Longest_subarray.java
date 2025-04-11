package DSA_Quest.ArraysQuestions;

import java.util.Arrays;

public class Longest_subarray {
 static int gcd(int a,int b){
     if(b==0){
         return a;
     }
    return gcd(b,a%b);

 }
 static int[] find_maxGCD(int[]arr){
     int MAX_length=0;
     int MAX_GCD=0;
     for(int i=0;i<arr.length;i++){
        int current_gcd=arr[i];
        for(int j=i;j<arr.length;j++){
            current_gcd=gcd(current_gcd,arr[j]);

            if(current_gcd>MAX_GCD) {
                MAX_GCD=current_gcd;
                MAX_length=j-i+1;
            }else if(current_gcd==MAX_GCD){
                MAX_length=Math.max(MAX_length,j-i+1);
            }
            if(current_gcd==1){
                break;
            }
        }
     }
     return new int[]{MAX_GCD,MAX_length};
 }
 
 public static void main(String[] args) {
        int[] arr={1, 2, 2};
        System.out.println(Arrays.toString(find_maxGCD(arr)));
    }
}
