import java.util.Arrays;
public class TwosortedArray {
    static void concan(int[]a,int[] b){
       int[] merged=new int[a.length+b.length];
       for(int i=0;i<a.length;i++){
           merged[i]=a[i];
       }
        for(int i=0;i<b.length;i++){
            merged[i+a.length]=b[i];
        }

        quicksort(merged,0,merged.length-1);
        System.out.println(Arrays.toString(merged));
    }
    static void quicksort(int[]merged,int low,int high){

        int start=low;
        int end=high;
        int pivot = merged[start + (end - start) / 2];
        if(low>=high){
            return;
        }
        while (start<= end) {
            while (merged[start] < pivot) {
                start++;
            }
            while (merged[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = merged[start];
                merged[start] = merged[end];
                merged[end] = temp;
                start++;
                end--;
            }
            quicksort(merged,low,end);
            quicksort(merged,start,high);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        concan(arr1,arr2);
    }
}
