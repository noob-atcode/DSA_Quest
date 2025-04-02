import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleCyclic_sort {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,10,8,2,3,1,9,9};
        List<Integer> result=search(arr);
        System.out.println(result);
    }
    static List<Integer> search(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if( correct>=0 && correct<arr.length && arr[i] != arr[correct])
            {
                swapped(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //Find missing number
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swapped(int[]arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}