import java.util.Arrays;

public class Twosumpairclosetto0 {
    static int closestTOsum0(int[] arr) {
      quicksort(arr,0, arr.length-1);
      int res=Integer.MAX_VALUE;
      for(int i=0;i< arr.length;i++){
          int x=arr[i];
          int start=i+1;
          int end=arr.length-1;
          while(start<=end){
              int mid=start+(end-start)/2;
              int current=arr[mid]+x;
              if(current==0){
                  return 0;
              }
              if(Math.abs(current)<Math.abs(res)){
                  res=current;
              }

              if(current<0){
                  start=mid+1;
              }else{
                  end=mid-1;
              }
          }
      }
  return res;
    }

    static void quicksort(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int pivot = arr[start + (end - start) / 2];
        //base condition
        if (low >= high) {
            return;
        }
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
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
        int[] arr = {-10, -3, 0, 5, 9, 20};
//        quicksort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        int res = closestTOsum0(arr);
        System.out.println(res);
    }
}
