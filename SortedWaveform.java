import java.util.Arrays;

public class SortedWaveform {
    static void waveform(int[] arr){
        int i=1;
        while(i<arr.length-2){
            if((arr[i]<=arr[i-1] && arr[i]<=arr[i+1])||(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]) ){
                i=i+2;
            }
            if(arr[i]>arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                i=i+2;
            }
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=i+2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        waveform(arr);
    }

}
