import java.util.Arrays;
//This is the example of Worst case that why we have i=0th
//pos always in the logic but out main cyclic sort not always
// start with i=0th position it is type of worst case
//When the i variable is incremented, the i-th position changes with the subsequent value
//, which is i-1, not always with the 0th position.
public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        Cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  Cyclic_Sort(int[] arr){
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swapped(int[]arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
