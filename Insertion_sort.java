import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={-5,-3,3,-9,4,1,2,10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[]arr)
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            int j=i+1;
            while(j>0 && arr[j]<arr[j-1] )
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }

        }
    }
}
