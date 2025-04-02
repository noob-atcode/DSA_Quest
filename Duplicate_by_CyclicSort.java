public class Duplicate_by_CyclicSort {
    public static void main(String[] args) {
        int[] arr={0,1,3,2,1};
        System.out.println(search(arr));
    }
    static int search(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {   int correct=arr[i];
            if(arr[i]!=arr[correct])
            {swapped(arr,i,correct);}
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index)
            {
                return arr[index];
            }
        }
        return -1;
    }
    static  void swapped(int[]arr,int i,int correct)
    {
        int temp=arr[i];
         arr[i]=arr[correct];
         arr[correct]=temp;
    }

}
