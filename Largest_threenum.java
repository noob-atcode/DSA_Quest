import java.util.ArrayList;
import java.util.Arrays;


public class Largest_threenum {
    public void largethree(int[] arr){
        quicksort(arr,0,arr.length-1);
        ArrayList<Integer> array=new ArrayList<>(3);
        int count=0;
        for(int i=arr.length-1;i>=0 && count<3;i--){
            if(!array.contains(arr[i])){
                array.add(arr[i]);
                count++;
            }
        }
        System.out.println(array);


    }
    public void quicksort(int [] arr,int low,int high) {
        int start = low;
        int end = high;
        int pivot = arr[start + (end - start) / 2];
        //base condition
        if(low>=high){
            return;
        }
        while (start<= end) {
            while (arr[start] <pivot) {
                start++;
            }
            while (arr[end] >pivot) {
                end--;
            }
            if (start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            quicksort(arr, low, end);
            quicksort(arr, start, high);
        }

    }

    public static void main(String[] args) {
        Largest_threenum tt=new Largest_threenum();
        int[] arr={9,9,8,8,6};
        tt.largethree(arr);
//
    }
}
