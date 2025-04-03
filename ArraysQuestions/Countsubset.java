import java.util.Arrays;

//count subset not adj element
//https://www.geeksforgeeks.org/count-of-subsets-not-containing-adjacent-elements/
public class Countsubset {
    static void subarrays(int[] uparr,int[]arr,int index,int arrsize){
        //Base condition
        if(index>=uparr.length ){
            System.out.println(Arrays.toString(Arrays.copyOf(arr,arrsize)));
            return;
        }


        subarrays(uparr,arr,index+1,arrsize);
        arr[arrsize]=uparr[index];//including term
        subarrays(uparr,arr,index+2,arrsize+1);

    }

    public static void main(String[] args) {
        int[] uparr={1,2,3};
        int[] arr=new int[uparr.length];
        subarrays(uparr,arr,0,0);
    }
}
