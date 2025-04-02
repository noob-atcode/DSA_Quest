public class First_smallest_positiveNo {
    public static void main(String[] args) {
   int[]arr={1,-1,3,4};
        System.out.println(search(arr));
    }
    static int search(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length&&arr[i]!=arr[correct])
            {
                swapped(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
                return index+1;
        }
        return arr.length+1;
    }
    static void swapped(int[]arr,int i,int correct)
    {
        int temp=arr[i];
        arr [i]=arr[correct];
        arr[correct]=temp;
    }

}
